package jtm.web.Lingo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping
	String startGame() {
		return "start_game";
	}
}
