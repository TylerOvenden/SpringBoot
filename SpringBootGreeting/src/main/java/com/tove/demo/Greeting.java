package com.tove.demo;

public class Greeting {
	private long id;
	private String message;
	
	public Greeting(long id, String message ) {
		this.id = id;
		this.message = message;
	
	}
	
	public long getid() {
		return id;
	}
	public String getMessage() {
		return message;
	}
	
	
}
