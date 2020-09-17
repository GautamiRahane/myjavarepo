package com.demo.service;
import java.util.Date;
import java.util.Scanner;
import com.demo.bean.Account;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class AccountService 
{
	public static Scanner sc=new Scanner(System.in);
	public static SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	
	//Accept Data for n accounts
	public static void acceptAccountData(Account acc[]) 
	{
		for(int i=0;i<acc.length;i++) 
		{
			System.out.println("Enter Account id:");
			int id=sc.nextInt();
			System.out.println("Enter name:");
			String name=sc.next();
			System.out.println("Enter Opening Date(dd/MM/yyyy):");
			String odt=sc.next();
			System.out.println("Enter Account Type:");
			String type=sc.next();
			System.out.println("Enter Account Balance:");
			double bal=sc.nextDouble();
				Date odate;
				try {
					odate = sdf.parse(odt);
					acc[i]=new Account(id,name,odate,type,bal);
				} catch (ParseException e) {
					e.printStackTrace();
				}
		}
	}

	//Search an Account by Id given by User
	public static int searchById(Account acc[],int id) {
		for(int i=0;i<acc.length;i++) {
			if(id==acc[i].getAccId()) {
				return i;
			}
		}
		return -1;	
	}
	
	//Withdraw money from Account from AccId given by user
	public static double withdrawAmt(Account acc[],int id, double amt) {
		int pos = searchById(acc,id);
		double bal = acc[pos].withdraw(amt);
		return bal;
	}
	
	//Deposit money into Account from AccId given by user
	public static double depositAmt(Account acc[],int id, double amt) {
		int pos = searchById(acc,id);
		double bal = acc[pos].deposit(amt);
		return bal;
	}
	
	//Display Account Details by given AccId
	public static void displayAccId(Account acc[],int id) {
		int pos = 0;
		for(int i=0;i<acc.length;i++) {
			if(acc[i].getAccId()==id) 
			{
				pos = i;
				break;
			}
		}
		System.out.println(acc[pos]);
	}
	//Display data of all accounts
	public static void displayAccountData(Account[] acc) 
	{
		for(int i=0;i<acc.length;i++) {
			if(acc[i]!=null)
				System.out.println(acc[i]);
			else
				break;
		}
		
	}
}
