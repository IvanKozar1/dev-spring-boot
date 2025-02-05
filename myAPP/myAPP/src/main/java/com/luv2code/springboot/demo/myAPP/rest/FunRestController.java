package com.luv2code.springboot.demo.myAPP.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping("/")
    public String sayHello() {
        return "Hello Wordl";
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Bicep curls";
    }

    @GetMapping("/vedran")
    public String aboutVedran() {
        return "Vedran je mali klokan";
    }
}
