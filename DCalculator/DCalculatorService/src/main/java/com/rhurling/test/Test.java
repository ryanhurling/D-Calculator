package com.rhurling;

import com.rhurling.dcalculator.api.Function;
import com.rhurling.dcalculator.api.TestInjection;
import org.springframework.stereotype.Service;

@Service
public class Test implements TestInjection{

    public Test() {
        Function function = new Function();
    }

}
