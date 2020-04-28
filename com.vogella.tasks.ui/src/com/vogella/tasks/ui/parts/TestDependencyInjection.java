package com.vogella.tasks.ui.parts;

public class TestDependencyInjection {
	static int i = 0;
	
	@Override
	public String toString() {
		return "This is my object " + i++;
	}
}
