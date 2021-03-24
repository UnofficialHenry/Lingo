package jtm.web.Lingo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;

import jtm.web.Lingo.controllers.GameLogic;

@SpringBootTest
class LingoApplicationTests {
	GameLogic gamelogic = new GameLogic();
	String correct = "seven";
	String testword1="seven";

	@Test
	void contextLoads() {
	}
	
	@Test
	public void test01GameLogic() {
		String[] result = gamelogic.compare(testword1,correct);
		String[] expected = {"green","green","green","green","green"};
		assertEquals(expected,result);
		
		testword1="srven";
		result = gamelogic.compare(testword1,correct);
		expected = new String[] {"green","red","green","green","green"};
		assertEquals(expected,result);
		
		testword1="verse";
		result = gamelogic.compare(testword1,correct);
		expected = new String[] {"yellow","green","red","yellow","yellow"};
		assertEquals(expected,result);
		
		testword1="eeeee";
		result = gamelogic.compare(testword1,correct);
		expected = new String[] {"yellow","green","yellow","green","yellow"};
		assertEquals(expected,result);
		
		testword1="beven";
		result = gamelogic.compare(testword1,correct);
		expected = new String[] {"red","green","green","green","green"};
		assertEquals(expected,result);
		
		correct = "abcde";
		testword1="abcde";
		result = gamelogic.compare(testword1,correct);
		expected = new String[] {"green","green","green","green","green"};
		assertEquals(expected,result);
		
		testword1="edcba";
		result = gamelogic.compare(testword1,correct);
		expected = new String[] {"yellow","yellow","green","yellow","yellow"};
		assertEquals(expected,result);
	}

}
