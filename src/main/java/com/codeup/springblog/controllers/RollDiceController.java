package com.codeup.springblog.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Random;

public class RollDiceController {

@GetMapping("/roll-dice")
    public String rollDice() {
    return "roll-dice";
}

@GetMapping("/roll-dice/{n}")
    public String guess(@PathVariable int n, Model model) {

    Random r = new Random();
    int random = r.nextInt((6-1)+1)+1;

    model.addAttribute("diceRoll", random);
    model.addAttribute("usrAttempt", n);
    model.addAttribute("isRight", random == n);

    return "roll-dice";
}




}
