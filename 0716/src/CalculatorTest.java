import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	private Calculator cal;

	@BeforeEach
	void init() {
		this.cal = new Calculator();
	}
	
	@Test 
	void testAdd() {
		assertEquals(8, this.cal.add(3, 5));
	}
	
	@Test 
	void testSubstract() {
		assertEquals(5, this.cal.subtract(3, 5));
	}
	
	@Test 
	void testMultiple() {
		assertEquals(24, this.cal.multiple(6, 4));
	}
	
	@Test 
	void testDivede() {
		assertEquals(4.1, this.cal.div(25, 6));
	}
	
	
	@Disabled @Test
	void testAdd() {
		fail("Not yet implemented");
	}

	@Disabled @Test
	void testSubtract() {
		fail("Not yet implemented");
	}

	@Disabled @Test
	void testMultiple() {
		fail("Not yet implemented");
	}

	@Disabled @Test
	void testDivide() {
		fail("Not yet implemented");
	}

}