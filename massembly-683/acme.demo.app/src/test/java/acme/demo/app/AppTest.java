package acme.demo.app;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {

	@Test
	public void testAnswer() {
		assertEquals("42", new App().getAnswer());
	}

}
