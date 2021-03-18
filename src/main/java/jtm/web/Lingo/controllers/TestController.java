package jtm.web.Lingo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

	@GetMapping("/")
	String startGame() {
		return "start_game";
	}
	
	@GetMapping("/game")
	String inGame(@RequestParam(value="word",defaultValue = " ",required = true)String word, Model model) {
		model.addAttribute("word",word);
		return "in_game";
	}
	
	@GetMapping("/end_game")
	String endGame() {
		return "end_game";
	}

}
