package com.bullyrooks.test_service_one.controller;

import com.bullyrooks.test_service_one.controller.dto.HelloWorldResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/helloworld")
    public HelloWorldResponse getHelloWorld(){
        return HelloWorldResponse.builder().message("Hello World!").build();
    }

}
