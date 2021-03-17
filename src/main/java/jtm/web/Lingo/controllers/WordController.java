package jtm.web.Lingo.controllers;

import jtm.web.Lingo.model.Words;
import jtm.web.Lingo.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WordController {
    @Autowired
    private WordRepository repo;


    @RequestMapping ("/words")
    public List<Words> listAll() {
        return repo.findAll();
    }
}