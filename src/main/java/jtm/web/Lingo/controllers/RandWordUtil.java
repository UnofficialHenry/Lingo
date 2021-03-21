package jtm.web.Lingo.controllers;


import jtm.web.Lingo.model.Words;
import jtm.web.Lingo.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

@Service
public class RandWordUtil {
    @Autowired
    private WordRepository repo;

    public String getRandomWord() {
        List<Words> words = repo.findAll();
        SecureRandom rand = new SecureRandom();

        return words.get(rand.nextInt( words.size())).getWord();
    }
}
