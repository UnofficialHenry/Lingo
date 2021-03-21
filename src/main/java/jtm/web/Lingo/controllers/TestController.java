package jtm.web.Lingo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

@Controller
public class TestController {
	private GameLogic gamelogic = new GameLogic();

	private String gameWord = null;

	@Autowired
	private RandWordUtil randWordUtil;
	
	@GetMapping("/")
	String startGame() {
		return "start_game";
	}
	
	@GetMapping("/game")
	String inGame(@RequestParam(value="word",defaultValue = "     ",required = true)String word, Model model) {
		if (gameWord == null)
			gameWord = randWordUtil.getRandomWord();

		String word1= gameWord;
		String[] colors= gamelogic.compare(word, word1);
		model.addAttribute("word",word1);
		for(int i =0; i<5;i++) {
			model.addAttribute("classitem"+Integer.toString(i+1),colors[i]);//assigns color to cell
			model.addAttribute("col"+Integer.toString(i+1),word.charAt(i));//assigns input letters to cell
		}
		return "in_game";
	}
	
	@GetMapping("/end_game")
	String endGame() {
		return "end_game";
	}

}
