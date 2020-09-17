package com.demo.bean;
import java.util.Date;

public class Account {

	private int accId;
	private String accName;
	private Date oDate;
	private String accType;
	private double accBal;
		
	//default constructor
	public Account() {
		accId=0;
		accName=null;
		oDate=null;
		accType=null;
		accBal=0;
	}
	//parameterized constructor
	public Account(int id,String name,Date oDate,String type,double bal) {
		this.accId=id;
		this.accName=name;
		this.oDate=oDate;
		this.accType=type;
		this.accBal=bal;
	}
	//setters and getters
	public void setAccId(int id) {
		this.accId=id;
	}
	public int getAccId() {
		return this.accId;
	}
	public void setAccName(String name) {
		this.accName=name;
	}
	public String getAccName() {
		return this.accName;
	}
	public void setODate(Date dt) {
		this.oDate=dt;
	}
	public Date getODate() {
		return this.oDate;
	}
	public void setAccBal(double bal) {
		this.accBal=bal;
	}
	public double getAccBal() {
		return this.accBal;
	}
	public void setAccType(String type) {
		this.accType=type;
	}
	public String getAccType() {
		return this.accType;
	}
	
	//Method to withdraw amount
	public double withdraw(double amount) 
	{
		if(this.accBal - 10000 >= amount) 
		{
			this.accBal -= amount;
			return this.accBal;
		}
		else 
		{
			return -1;
		}	
	}
		
	//Deposit amount
	public double deposit(double amount) 
	{
			this.accBal += amount;
			return this.accBal;
		}
	//to display data--good practice
		public String toString() {
			return "Account Id: "+accId+"\nName: "+accName+"\nOpening Date: "+oDate+"\nAccount Type: "
		+accType+"\nBalance: "+accBal;
			
		}

}
