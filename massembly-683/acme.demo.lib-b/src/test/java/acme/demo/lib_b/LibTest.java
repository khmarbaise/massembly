package acme.demo.lib_b;

import static org.junit.Assert.*;
import org.junit.Test;

public class LibTest {

	@Test
	public void testAnswer() {
		assertEquals("42", new LibB().getAnswer());
	}

}
