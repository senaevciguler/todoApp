package com.todo.todo;

import helloWorld.HelloWorldBean;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class HelloWorld {

    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        //throw new RuntimeException("Some Error happened. Contact Support at**-**");
        return new HelloWorldBean("Hello World-Changed");
    }

    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldVariablePath(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World, %s",name));
    }
}
