package com.codeup.springblog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String helloFromSpring() {

        return "Hello from Spring!!!";
    }

    @GetMapping("/helloWorld")
    @ResponseBody
    public String helloWorld() {

        return "Hello World!!!";
    }

    @GetMapping("/helloWorld/{username}")
    @ResponseBody
    public String helloWorld(@PathVariable String username) {

        return "Hello " + username + "!";
    }

}
