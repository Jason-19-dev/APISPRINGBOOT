
package com.gamervault.gvgg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.log4j.Logger;

@RestController
@RequestMapping("/api")
public class HomeController {
    
    private static final Logger logger = Logger.getLogger(HomeController.class);
    // public HomeController() {}
    @GetMapping
    public String Home() {
        System.out.println("Home is running");
        logger.info("Home is running");
        return "Howdy! Check out the Logs to see the output...";
    }
}
 
