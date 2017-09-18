package io.vividcode.feature9.module;

import static org.junit.Assert.assertEquals;

import com.google.common.collect.Lists;
import java.util.List;
import org.junit.Test;

public class ClassLoaderTest {

	@Test
	public void testClassLoaderName() throws Exception {
		ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
		final List<String> names = Lists.newArrayList();
		while (classLoader != null) {
			names.add(classLoader.getName());
			classLoader = classLoader.getParent();
		}
		assertEquals(2, names.size());
		assertEquals("app", names.get(0));
		assertEquals("platform", names.get(1));
	}
}
