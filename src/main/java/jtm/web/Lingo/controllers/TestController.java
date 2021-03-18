package jtm.web.Lingo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/")
	String startGame() {
		return "start_game";
	}
	
	@GetMapping("/game")
	String inGame() {
		return "in_game";
	}
	
	@GetMapping("/end_game")
	String endGame() {
		return "end_game";
	}

}
