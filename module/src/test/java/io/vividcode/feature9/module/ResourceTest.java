package io.vividcode.feature9.module;

import org.junit.Test;

public class ResourceTest {

  @Test
  public void testResources() {
    final ClassLoader classLoader = ResourceTest.class.getClassLoader();
    classLoader.resources("res/application.properties").forEach(System.out::println);
  }
}
