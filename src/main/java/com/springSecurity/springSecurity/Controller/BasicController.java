package com.springSecurity.springSecurity.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpRequest;

@RestController
public class BasicController {

    @GetMapping("/")
    public String getHello(HttpServletRequest request){
        return "Hello World" + request.getSession().getId();
    }
}
