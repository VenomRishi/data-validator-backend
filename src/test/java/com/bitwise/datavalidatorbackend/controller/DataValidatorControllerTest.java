package com.bitwise.datavalidatorbackend.controller;

import com.bitwise.datavalidatorbackend.model.DataValidator;
import com.bitwise.datavalidatorbackend.service.DataValidatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class DataValidatorControllerTest {

    @InjectMocks
    private DataValidatorController dataValidatorController;
    @Mock
    private DataValidatorService dataValidatorService;

    @Test
    void testTest() {
        List<DataValidator> dataValidators = new ArrayList<>();
        DataValidator dataValidator = new DataValidator();
        dataValidator.setTable("tourist");
        dataValidator.setKey("id");
        DataValidator dataValidator1 = new DataValidator();
        dataValidator1.setTable("customer");
        dataValidator1.setKey("custid");
        dataValidators.add(dataValidator);
        dataValidators.add(dataValidator1);
        when(dataValidatorService.test()).thenReturn(dataValidators);
        ResponseEntity<List<DataValidator>> responseEntity = dataValidatorController.test();
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(2, responseEntity.getBody().size());
    }
}
