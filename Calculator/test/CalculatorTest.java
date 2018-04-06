import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd(){
		Calculator cal = new Calculator();
		int result = cal.add(10, 5);
		assertEquals(50,result);
	}
	@Test
	public void testMul(){
		Calculator cal = new Calculator();
		int result = cal.mul(10, 5);
		assertEquals(50,result);
	}
}
