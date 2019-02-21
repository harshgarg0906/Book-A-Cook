package com.beans;

public class Chef {

	private int cId;
	private String cName;
	private String cPassword;
	private long cContact;
	private int cMA;
	private int cEA;
	private String cType;
	private int cSalary;
	private int cExp;
	private String cFullname;
	public Chef()
	{
		
		
	}
	public Chef(String cName, String cPassword, long cContact, String cType,int cExp, int cMA, int cEA, int cSalary,
			String cFullname) {
	
		
		this.cName = cName;
		this.cPassword = cPassword;
		this.cContact = cContact;
		this.cMA = cMA;
		this.cEA = cEA;
		this.cType = cType;
		this.cSalary = cSalary;
		this.cExp = cExp;
		this.cFullname=cFullname;
	}
	
	public String getcFullname() {
		return cFullname;
	}
	public void setcFullname(String cFullname) {
		this.cFullname = cFullname;
	}
	public void setcContact(long cContact) {
		this.cContact = cContact;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcPassword() {
		return cPassword;
	}
	public void setcPassword(String cPassword) {
		this.cPassword = cPassword;
	}
	public long getcContact() {
		return cContact;
	}
	public int getcMA() {
		return cMA;
	}
	public void setcMA(int cMA) {
		this.cMA = cMA;
	}
	public int getcEA() {
		return cEA;
	}
	public void setcEA(int cEA) {
		this.cEA = cEA;
	}
	public String getcType() {
		return cType;
	}
	public void setcType(String cType) {
		this.cType = cType;
	}
	public int getcSalary() {
		return cSalary;
	}
	public void setcSalary(int cSalary) {
		this.cSalary = cSalary;
	}
	public int getcExp() {
		return cExp;
	}
	public void setcExp(int cExp) {
		this.cExp = cExp;
	}
	
	
	
	@Override
	public String toString() {
		return "Chef [cId=" + cId + ", cName=" + cName + ", cPassword=" + cPassword + ", cContact=" + cContact
				+ ", cMA=" + cMA + ", cEA=" + cEA + ", cType=" + cType + ", cSalary=" + cSalary + ", cExp=" + cExp
				+ ", cFullname=" + cFullname + "]";
	}
	
	
	
	
}
