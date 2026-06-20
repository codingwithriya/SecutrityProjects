package com.SecurityDemo.SecutrityProjects.Controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpRequest;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello(){
        return "Hello welcome to Spring boot learning session!";
    }

    @GetMapping("id")
    public String getSessionId(HttpServletRequest hp){
        return "Session Id:" + hp.getSession().getId();
    }
}
