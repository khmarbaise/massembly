import static org.junit.Assert.*;
import org.junit.Test;

public class Child2Test {
	
	@Test
	public void testHello() {
		Child2 child2 = new Child2();
		assertEquals(child2.world(), "World");
	}	
}
