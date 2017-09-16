package io.vividcode.feature9.module;

import java.lang.module.ModuleFinder;
import java.lang.module.ModuleReference;
import java.net.URISyntaxException;
import java.nio.file.Paths;

public class ModuleTestSupport {

  public static final String MODULE_NAME = "io.vividcode.store.common";

  public static ModuleFinder getModuleFinder() throws URISyntaxException {
    return ModuleFinder.of(
        Paths.get(
            ModuleDescriptorTest.class.getResource("/modules").toURI()));
  }

  public static ModuleReference getModuleReference() throws URISyntaxException {
    return getModuleFinder().find(MODULE_NAME).get();
  }
}
