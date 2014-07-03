import static org.junit.Assert.*;
import org.junit.Test;

public class Child1Test {
	
	@Test
	public void testHello() {
		Child1 child1 = new Child1();
		assertEquals(child1.hello(), "Hello");
	}	
}
