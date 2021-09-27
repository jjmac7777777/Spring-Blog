package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.ArrayList;
import java.util.List;

@Controller
    public class PostController {

        @GetMapping("/posts")
        public String posts(Model model) {

                ArrayList<Post> allPosts = new ArrayList<>();

                allPosts.add(new Post("P1", "post1"));
                allPosts.add(new Post("P2", "post2"));

                model.addAttribute("posts", allPosts);
                return "posts";
        }

        @GetMapping("/posts/{id}")
        public String postsId(@PathVariable int id, Model model) {

                    Post post = new Post("title", "body");
                    model.addAttribute("postId", id);
                    model.addAttribute("post", post);

            return "posts/id";
        }

        @GetMapping("/posts/create")
        public String postsCreate() {

            return "posts/create";
        }

        @GetMapping("/posts/toCreate")
        public String postsToCreate() {

            return "posts/toCreate";
        }


    private class Post {
        public Post(String title, String body) {
        }
    }
}

