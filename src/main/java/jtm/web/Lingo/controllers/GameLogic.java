package jtm.web.Lingo.controllers;

public class GameLogic {
	
	private String[] color;
	
	public String[] compare(String word, String word1) {
		color = new String[5];
		for(int i = 0; i < word.length(); i++) {
			if(Character.toUpperCase(word.charAt(i)) == Character.toUpperCase(word1.charAt(i))) {
				color[i] = "green"; // letter exists and correct position - set letter color to GREEN
				continue;
			}
			for(int j = 0; j < word1.length(); j++) {
				if(Character.toUpperCase(word.charAt(i)) == Character.toUpperCase(word1.charAt(j))) {

					color[i] = "yellow"; // letter exists and but incorrect position - set letter color to YELLOW
					break;
				}
				else {
					color[i] = "red"; // "#d9d9d9"; // letter doesnt exist - set letter color to RED
				}
			}
		}
		return color;
	}
}
