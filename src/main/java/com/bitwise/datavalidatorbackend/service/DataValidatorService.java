package com.bitwise.datavalidatorbackend.service;

import com.bitwise.datavalidatorbackend.model.DataValidator;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataValidatorService {

    public List<DataValidator> test() {
        List<DataValidator> dataValidators = new ArrayList<>();
        DataValidator dataValidator = new DataValidator();
        dataValidator.setTable("tourist");
        dataValidator.setKey("id");
        DataValidator dataValidator1 = new DataValidator();
        dataValidator1.setTable("customer");
        dataValidator1.setKey("custid");
        dataValidators.add(dataValidator);
        dataValidators.add(dataValidator1);
        return dataValidators;
    }
}
