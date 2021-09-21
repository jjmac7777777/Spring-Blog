package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

    @Controller
    public class PostController {

        @GetMapping("/posts")
        @ResponseBody
        public String posts() {

            return "posts index page!!!";
        }

        @GetMapping("/posts/{id}")
        @ResponseBody
        public String postsId() {

            return "view an individual post!!!";
        }

        @GetMapping("/posts/create")
        @ResponseBody
        public String postsCreate() {

            return "view the form for creating a post!!!";
        }

        @GetMapping("/posts/toCreate")
        @ResponseBody
        public String postsToCreate() {

            return "create a new post!!!";
        }
    }

