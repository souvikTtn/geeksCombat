package com.healthyMoves.healthyMoves.filter;

import com.healthyMoves.healthyMoves.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
@Slf4j
public class AuthFilter implements Filter {
    @Value("${public.url}")
    private List<String> publicUrl;

    @Autowired
    private UserService userService;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
    throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        String authToken = httpServletRequest.getHeader("token");
        try {
            if (publicUrl.contains(httpServletRequest.getServletPath())) {
                chain.doFilter(request, response);
            } else {
                userService.findByToken(authToken);
                chain.doFilter(request, response);
            }
        } catch (Exception e) {
            log.error("exception occurred for", e);
            ((HttpServletResponse) response).sendError(400, e.getMessage());
        }

    }
}
