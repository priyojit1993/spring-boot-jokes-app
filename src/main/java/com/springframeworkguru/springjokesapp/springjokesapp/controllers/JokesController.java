package com.springframeworkguru.springjokesapp.springjokesapp.controllers;

import com.springframeworkguru.springjokesapp.springjokesapp.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/jokes")
public class JokesController {

    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @GetMapping("/get")
    public String getJokes(Model model) {
        String jokes = jokesService.getrandomJokes();
        model.addAttribute("joke", jokes);
        return "jokes/list";
    }

}
