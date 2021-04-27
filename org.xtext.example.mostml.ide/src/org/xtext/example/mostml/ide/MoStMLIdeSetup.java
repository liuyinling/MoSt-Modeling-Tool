/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mostml.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.mostml.MoStMLRuntimeModule;
import org.xtext.example.mostml.MoStMLStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class MoStMLIdeSetup extends MoStMLStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new MoStMLRuntimeModule(), new MoStMLIdeModule()));
	}
	
}
