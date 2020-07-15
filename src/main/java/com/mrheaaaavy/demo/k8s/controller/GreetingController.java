package com.mrheaaaavy.demo.k8s.controller;

import com.mrheaaaavy.demo.k8s.config.GreetingConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mrheaaaavy
 */
@RestController
@RequestMapping("/")
public class GreetingController {

    private final GreetingConfig greetingConfig;

    public GreetingController(GreetingConfig greetingConfig) {
        this.greetingConfig = greetingConfig;
    }

    @GetMapping("hello")
    public String hello() {
        return greetingConfig.getMessage();
    }

}
