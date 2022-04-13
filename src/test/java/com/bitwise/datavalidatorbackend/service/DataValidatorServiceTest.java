package com.bitwise.datavalidatorbackend.service;

import com.bitwise.datavalidatorbackend.model.DataValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class DataValidatorServiceTest {

    @InjectMocks
    private DataValidatorService dataValidatorService;

    @Test
    void testTest() {
        List<DataValidator> test = dataValidatorService.test();
        Assertions.assertEquals(2, test.size());
    }
}
