package com.julius.spring5jokesappv2.controllers;

import com.julius.spring5jokesappv2.services.JokesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JokesRestController {

    private final JokesService jokesService;

    public JokesRestController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @GetMapping("/joke")
    public String getRandomJoke(){
        return jokesService.getRandomQuote();
    }
}
