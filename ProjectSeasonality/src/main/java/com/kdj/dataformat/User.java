package com.kdj.dataformat;

public class User {
	public int keyNumber;
	public String userName;
	public String userId;
	public String userPassword;
	
	public User() {
		
	}
	
	public User(int keyNumber, String userName, String userId, String userPassword) {
		this.keyNumber = keyNumber;
		this.userName = userName;
		this.userId = userId;
		this.userPassword = userPassword;
	}
	
	public int getKeyNumber() {
		return this.keyNumber;
	}
	
	public void setKeyNumber(int keyNumber) {
		this.keyNumber = keyNumber;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserPassword() {
		return this.userPassword;
	}
	
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
}
