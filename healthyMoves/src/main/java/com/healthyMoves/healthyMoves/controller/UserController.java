package com.healthyMoves.healthyMoves.controller;

import com.healthyMoves.healthyMoves.command.UserCO;
import com.healthyMoves.healthyMoves.constant.ApplicationConstant;
import com.healthyMoves.healthyMoves.dto.ResponseDTO;
import com.healthyMoves.healthyMoves.entity.User;
import com.healthyMoves.healthyMoves.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Slf4j
@RequestMapping(value = ApplicationConstant.V2_USER)
public class UserController {

    @Autowired
    private MessageSource messageSource;

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<ResponseDTO<User>> saveUser(@Valid @RequestBody UserCO userCO) {
        log.info("Request received for saving user with mail {}", userCO.getEmail());
        User user = userService.save(userCO);
        ResponseDTO<User> responseDTO = new ResponseDTO<>(true, messageSource
                .getMessage("resource.created", new String[]{"user"},
                            LocaleContextHolder.getLocale()), user);
        return ResponseEntity.ok(responseDTO);
    }

    @PutMapping
    public ResponseDTO updateUser(@RequestBody UserCO userCO, @RequestHeader("token") String token) {
        log.info("Request received fro updating user");
        userService.updateUser(userCO, token);
        return new ResponseDTO(true, "User updated successfull", null);
    }

}
