package jp.co.internous.mysession.model;

import java.io.Serializable;

public class LoginForm implements Serializable{
	private static final long serialVersionUID = -4036485091817953626L;
	
	private String userName;
	private String password;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
