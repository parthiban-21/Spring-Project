package com.chainsys.Example.model;

import org.springframework.stereotype.Repository;

@Repository
public class User {
	
	private String username;
	private String password;
	private String mailID;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMailID() {
		return mailID;
	}
	public void setMailID(String mailID) {
		this.mailID = mailID;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", mailID=" + mailID + "]";
	}
}
