package com.springframeworkguru.springjokesapp.springjokesapp.services;


import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorisJokesService implements JokesService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorisJokesService() {
        chuckNorrisQuotes = new ChuckNorrisQuotes();
    }


    @Override
    public String getrandomJokes() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
