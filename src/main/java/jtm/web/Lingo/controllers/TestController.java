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
	private int guessCount=0;
	private int roundCount=1;
	private int pointCount=0;
	private int highScore=0;
	private int[] levels = {100, 80, 60, 45, 30};
	private String[] words= new String[6];
	// private String[][] colorMatrix = new String[4] [4];

	@Autowired
	private RandWordUtil randWordUtil;
	
	@GetMapping("/")
	String startGame() {
		return "start_game";
	}
	
	@GetMapping("/game")
	String inGame(@RequestParam(value="word",defaultValue = "     ",required = true)String word, Model model) {
		model.addAttribute("submit","SUBMIT");
		model.addAttribute("roundNumber",roundCount);
		model.addAttribute("totalPoints", pointCount);
		model.addAttribute("highscore", highScore);
		if (gameWord == null)
			gameWord = randWordUtil.getRandomWord();
		String word1 = gameWord;
		String[] colors = gamelogic.compare(word, word1);
		model.addAttribute("word",word1);
		for(int i = 0; i < 5; i++) {
			model.addAttribute("classitem"+Integer.toString(guessCount)+Integer.toString(i + 1),colors[i]);//assigns color to cell
			model.addAttribute("cell"+Integer.toString(guessCount)+Integer.toString(i + 1),word.charAt(i));//assigns input letters to cell
	//		colorMatrix [guessCount] [i] = colors [i];          // save colors [i] in matrix where [guessCount] is row nr and [i] colon nr
		}
		words[guessCount]=word;
		if(guessCount>0) {
			for(int i=1;i<guessCount;i++) {
				for(int j=0;j<5;j++) {
					model.addAttribute("cell"+Integer.toString(guessCount-i)+Integer.toString(j + 1),words[guessCount-i].charAt(j));
	//  			model.addAttribute("classitem"+Integer.toString(guessCount-i)+Integer.toString(j + 1), colorMatrix[guessCount-i] [j]);  // shows matrix colors to old guesses
				}
			}
		}
		if(guessCount==0)
			model.addAttribute("cell11",word1.charAt(0));
		guessCount++;
		if(word1.toUpperCase().equals(word)) {
			pointCount = pointCount + levels [guessCount-2];
			gameWord=null;
			guessCount=0;
			roundCount++;
			
			words=new String[6];
			model.addAttribute("submit","NEXT ROUND");
		}
		if(guessCount>5) {
			if (highScore < pointCount) {
				highScore = pointCount;
			}
			return endGame();
		}
		return "in_game";
	}
	
	@GetMapping("/end_game")
	String endGame() {
		guessCount=0;
		roundCount=1;
		gameWord=null;
		pointCount= 0;
		words=new String[6];
		return "end_game";
	}

}
