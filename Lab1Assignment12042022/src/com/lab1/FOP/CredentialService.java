package com.lab1.FOP;


public class CredentialService {
	
	public CredentialService(String emailId, String password) {
		this.emailId = emailId;
		this.password = password;
	}
	
	private String emailId;
	private String password;
	
	public String getemailId() {
		return emailId;
	}
	public void setemailId(String emailId) {
		this.emailId =emailId;
	}
	public String getpassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password =password;
	}
}