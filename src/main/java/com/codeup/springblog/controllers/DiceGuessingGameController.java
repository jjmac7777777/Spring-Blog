package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@Controller
public class DiceGuessingGameController {

        @GetMapping("/roll-dice")
        public String diceGuess(String name, Model model) {

                model.addAttribute("name", name);
                return "roll results guess";

        }

    }





