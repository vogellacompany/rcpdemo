package com.vogella.tasks.model;

public class Todo {
	private String summary = "";

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@Override
	public String toString() {
		return "My Todo";
	}
}
