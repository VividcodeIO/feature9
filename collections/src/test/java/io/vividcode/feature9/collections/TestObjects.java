package io.vividcode.feature9.collections;

import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.assertEquals;

public class TestObjects {
	@Test
	public void testRequireNonNullElse() throws Exception {
		assertEquals("hello",
				Objects.requireNonNullElse("hello", "world"));
		assertEquals("world",
				Objects.requireNonNullElse(null, "world"));
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testCheckIndex() throws Exception {
		assertEquals(0, Objects.checkIndex(0, 1));
		Objects.checkIndex(3, 1);
		assertEquals(1, Objects.checkFromIndexSize(0, 2, 5));
		Objects.checkFromIndexSize(0, 3, 1);
		assertEquals(1, Objects.checkFromToIndex(1, 3, 5));
		Objects.checkFromToIndex(0, 3, 2);
	}
}
