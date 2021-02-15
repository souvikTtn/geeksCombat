package com.healthyMoves.healthyMoves.controller;


import com.healthyMoves.healthyMoves.constant.ApplicationConstant;
import com.healthyMoves.healthyMoves.dto.ResponseDTO;
import com.healthyMoves.healthyMoves.entity.BodyType;
import com.healthyMoves.healthyMoves.service.BodyTypeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(value = ApplicationConstant.V2_BODY_TYPE)
@RestController
@Slf4j
public class BodyTypeController {

    @Autowired
    private BodyTypeService bodyTypeService;

    @GetMapping
    public ResponseDTO<List<BodyType>> getAllBodyTypes() {
        return new ResponseDTO<>(true, "Body Types Fetched Successfully", bodyTypeService.getAllBodyTypes());
    }
}
