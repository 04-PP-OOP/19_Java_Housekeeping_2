package com.cc.java;

public class Cat {

	private String name;

	/**
	 * @param name
	 */
	public Cat(String name) {
		this.name = name;
	}
	
	public String getAttributes() {
		return "Hi, I'm " + name + " and I live @: " + this;
	}
	
	
}
