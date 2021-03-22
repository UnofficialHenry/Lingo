package jtm.web.Lingo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LingoApplicationTests {

	@Test
	void contextLoads() {
	}
	/*	
	@Test
	public void checkLength() {
	    int expected = 5 ;
	    String input = "word";
	    int actual = input.length();
	    assertEquals("Word should be with 5 letters", expected, actual);
	}
	
	@Test
	public void checkLetters() {
	    boolean expected = true ;
	    boolean actual;
	    for (int i = 0; i<5; i++) {
	   		if ( ! input.charAt(i).matches(".*[^A-Z].*") ) { 
	       	actual = false;
	    }
	    assertEquals("Word should contain letters A-Z", expected, actual);
	} */

}
