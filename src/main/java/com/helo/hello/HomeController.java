package com.helo.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping({"/","/home","/status"})
    public String getStatus(){
        return  "Hello this is Backend";
    }

}
