package org.dean;

import org.junit.Assert;
import org.junit.Test;

public class ForTest {
	@Test
	public void testTry() {
		try {
			Assert.assertEquals(1, 2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
