package com.tutorial.testng.parameters;

public class User {

	private String user;
	private String password;

	public String getUser() {
		return user;
	}

	public String getPassword() {
		return password;
	}

	public User setUser(String user) {
		this.user = user;
		return this;
	}

	public User setPassword(String password) {
		this.password = password;
		return this;
	}
}
