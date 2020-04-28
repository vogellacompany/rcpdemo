
package com.vogella.tasks.ui.parts;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;

public class TodoDetailsPart {
	public TodoDetailsPart() {
		System.out.println(this.getClass().getSimpleName() + " constructed");
	}

	@Inject
	@Optional
	public void getMyObject(TestDependencyInjection o) {
		System.out.println("DetailsPart " + o);
	}
}