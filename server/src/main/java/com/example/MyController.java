package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello")
public class MyController {

    @Get("/")
    public String getHello(MyClass myClass) {
        return myClass.toString();
    }

}
