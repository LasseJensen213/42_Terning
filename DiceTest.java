package terning;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class DiceTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test 
	public void testAndreværdier() {
Dice dice = new Dice();
		
		int expected = 0;
		int OverValue = 0;
		
		for(int i=0, n=60000; i<n; i++) {
			int Roll;
			Roll = dice.roll();
			if (Roll <= 0 && Roll >= 7) {
				OverValue++;	
			}
		}
		assertEquals(expected,OverValue);
	}
	
	
	@Test
	public void testRoll() {
		Dice dice = new Dice();
		
		//Instanser
		int one = 0;		//Til at starte med er 1 forekommet 0 gange
		int two = 0;		//Til at starte med er 2 forekommet 0 gange
		int three = 0;		//Til at starte med er 3 forekommet 0 gange
		int four = 0;		//Til at starte med er 4 forekommet 0 gange
		int five = 0;		//Til at starte med er 5 forekommet 0 gange
		int six = 0;		//Til at starte med er 6 forekommet 0 gange		
		
		//Expected values
		
		
		for(int i=0, n=60000; i<n; i++) {
			int Roll;
			

			Roll = dice.roll();
			
			switch(Roll) {
			case 1 : 
				one++;
				break;
			case 2 : 
				two++;
				break;
			case 3 :
				three++;
				break;
			case 4 :
				four++;
				break;
			case 5 :
				five++;
				break;
			case 6 :
				six++;
				break;
				
			}
		}
		assertEquals(10000, one, 400);
		assertEquals(10000, two, 400);		
		assertEquals(10000, three,400);		
		assertEquals(10000, four, 400);		
		assertEquals(10000, five, 400);		
		assertEquals(10000, six, 400);		
		
	}

}
