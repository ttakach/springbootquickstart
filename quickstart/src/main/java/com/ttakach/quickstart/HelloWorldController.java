package com.ttakach.quickstart;

@RestController
public class HelloWorldController{

    @GetMapping(path = '/hello')
    public String helloWorld(){
        return "Hello World!";

    }
}