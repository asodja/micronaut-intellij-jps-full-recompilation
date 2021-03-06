package com.example;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class MyClass {

    private static final String CONSTANT = "1";

    private String value;

    public MyClass(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
