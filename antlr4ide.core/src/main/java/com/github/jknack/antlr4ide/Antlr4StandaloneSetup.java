package com.github.jknack.antlr4ide;

/**
 * Initialization support for running Xtext languages
 * without equinox extension registry
 */
public class Antlr4StandaloneSetup extends Antlr4StandaloneSetupGenerated {

  /**
   * Initialize Guice and EMF.
   */
  public static void doSetup() {
    new Antlr4StandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
