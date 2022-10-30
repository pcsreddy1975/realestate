package com.demo.realestate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RealEstateController {

    public static  Integer counter = 0;

    @GetMapping("/real-estate")
    public String getDetails(){
        return "Counter value is:"+ (++counter);
    }
}