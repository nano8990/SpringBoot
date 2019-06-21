package com.example.userVO;

public class UserVO {
	private int idx;
	private String name;
	private String locale;

	public UserVO() {
	}
	
	public UserVO(String name, String locale) {
		this.name = name;
		this.locale = locale;
	}

	public int getUserIdx() {
		return this.idx;
	}

	public void setUserIdx(int idx) {
		this.idx = idx;
	}

	public String getUserName() {
		return this.name;
	}

	public void setUserName(String name) {
		this.name = name;
	}

	public String getUserLocale() {
		return this.locale;
	}

	public void setUserLocale(String locale) {
		this.locale = locale;
	}

	@Override
	public String toString() {
		return "User [idx=" + idx + ", name=" + name + ", locale=" + locale + "]";
	}
}