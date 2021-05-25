package vendormachine;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.*;

import vendormachine.users.util.Wallet;

public class WalletTEST {
	
	/** 
	 * Task 1:
	 * 	Objective:
	 * 		Test the Wallet class from:
	 * 		'vendormachine.users.util.Wallet'
	 * 
	 * 		Goal: 80% code/line coverage
	 * */
	
	// Hint: 
	// Others Tests for other classes that use Wallet may impact code coverage
	// Avoid relying on these tests, one test for one class; keep "Single Responsibility" in mind.
	
	// Assertions
	// =======
	// fail();
	// assetTrue | assertFalse
	// assertEquals| assertNotEquals
	// assertNull | assertNotNull
	// assertSame | assertNotSame
	Wallet w = new Wallet();
	Wallet w1 = new Wallet(3.0f);
	Wallet w2 = new Wallet("Nike", 2.0f);
	@BeforeAll
	public static void start() {
//		System.out.println(w.getCredit(0.5f));		
	}
	
	@Test
	public void addCreditTest() {
		w1.addCredit(0.5f);
		float value = w1.getAllCredit();
//		System.out.println(w1.getAllCredit());
		assertEquals(3.5f, value);
	}
	
	@Test
	public void getCreditTest() {
		float retrieve = .8f;
		assertEquals(0, w.getCredit(retrieve));
		assertEquals(.8f, w1.getCredit(retrieve));
	}
	
	@Test
	public void getAllCreditTest() {
//		System.out.println(w1.getBrand(""));
		assertEquals(.5f, w.getAllCredit());		
	}
	
	@Test
	public void getBrandTest() {
//		System.out.println(w1.getBrand(""));
		assertSame("Generic", w.getBrand());		
	}
	
	@Test
	public void setCreditTest() {
//		System.out.println(w1.getBrand(""));
		w.setCredit(.9f);
		float val = w.getAllCredit();
		assertEquals(.9f, val);		
	}
	
	@Test
	public void setBrandTest() {
//		System.out.println(w1.getBrand(""));
		w.setBrand("Adidas");
		String val = w.getBrand();
		assertEquals("Adidas", val);		
	}
	
}
