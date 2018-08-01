package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloController {

    private static final String RESPONSE_STRING_FORMAT = "Hello from '%s': %d\n";

    /**
     * Counter to help us see the lifecycle
     */
    private int count = 0;


    @GetMapping
    public String helloworld(){
        count++;
        return String.format(
                RESPONSE_STRING_FORMAT,
                System.getenv().getOrDefault("HOSTNAME", "unknown"),
                count);
    }
}
