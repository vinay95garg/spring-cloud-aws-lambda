package com.javatechie.springcloud.function.api;

import java.util.function.Function;

public class Test implements Function<String, String> {

    @Override
    public String apply(String t){
        return "Serverless functional programming : example by";
    }
}
