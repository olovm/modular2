package org.example.modular2;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Modular2Test {
	@Test
	public void testModular() throws Exception {
		Modular2 m = new Modular2();
		assertEquals(m.getDummyString(), "dummyString");
	}
}