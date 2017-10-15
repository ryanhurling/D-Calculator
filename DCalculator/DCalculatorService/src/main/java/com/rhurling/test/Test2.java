package com.rhurling;

import com.rhurling.dcalculator.api.TestInjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Test2 {

    @Autowired
    private TestInjection test;

    public Test2() {
        System.out.println(test.toString());
    }

}
