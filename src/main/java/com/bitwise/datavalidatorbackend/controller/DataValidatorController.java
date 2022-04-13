package com.bitwise.datavalidatorbackend.controller;

import com.bitwise.datavalidatorbackend.model.DataValidator;
import com.bitwise.datavalidatorbackend.service.DataValidatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataValidatorController {
    @Autowired
    private DataValidatorService dataValidatorService;
    @GetMapping("test")
    public ResponseEntity<List<DataValidator>> test() {
        return new ResponseEntity<>(dataValidatorService.test(), HttpStatus.OK);
    }
}
