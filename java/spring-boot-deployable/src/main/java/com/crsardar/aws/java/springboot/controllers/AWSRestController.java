package com.crsardar.aws.java.springboot.controllers;

import com.crsardar.aws.java.springboot.models.HelloAWS;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chittaranjan Sardar
 * www.crsardar.com
 * @date 10/11/20 6:30 am
 */

@RestController
public class AWSRestController {

    @GetMapping
    public String hiChitta()
    {
        return "\nSpider lives in Web, I live at Home!\nPlease wait for me!\n\n - Chittaranjan Sardar";
    }

    @GetMapping("/aws-spring-boot")
    public HelloAWS helloAwsSpring()
    {
        return new HelloAWS("Hello AWS! I am SpringBoot!");
    }
}
