package acme.demo.lib_a;

import static org.junit.Assert.*;
import org.junit.Test;

public class LibTest {

	@Test
	public void testAnswer() {
		assertEquals("42", new LibA().getAnswer());
	}

}
