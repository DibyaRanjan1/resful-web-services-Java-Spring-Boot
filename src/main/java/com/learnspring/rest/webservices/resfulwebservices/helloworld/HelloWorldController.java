package com.learnspring.rest.webservices.resfulwebservices.helloworld;

import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello-world")
    public HelloWorldBean helloWorld(){
        return new HelloWorldBean("hello World");

    }

    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
       return new HelloWorldBean(String.format("Hello world , %s",name));
    }
}
