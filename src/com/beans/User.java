package com.beans;

public class User {


	private String uName;
	private String uPassword;
	private int uId;
	private float uContact;
	private String uAddress;
	
	public User(String uName, String uPassword) {
		super();
		this.uName = uName;
		this.uPassword = uPassword;
	}


	public User(String uName, String uPassword, float uContact, String uAddress) {
		super();
		this.uName = uName;
		this.uPassword = uPassword;
		this.uContact = uContact;
		this.uAddress = uAddress;
	}
	
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuPassword() {
		return uPassword;
	}
	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public float getuContact() {
		return uContact;
	}public void setuContact(float uContact) {
		this.uContact = uContact;
	}
	public String getuAddress() {
		return uAddress;
	}
	public void setuAddress(String uAddress) {
		this.uAddress = uAddress;
	}


	@Override
	public String toString() {
		return "User [uName=" + uName + ", uPassword=" + uPassword + ", uId=" + uId + ", uContact=" + uContact
				+ ", uAddress=" + uAddress + "]";
	}
	
	
	
	
}