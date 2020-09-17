package com.demo.test;
import java.util.Scanner;
import com.demo.bean.Account;
import com.demo.service.AccountService;

public class TestAccount 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Account[] a=new Account[2];
		
		int choice = 0;
		int id = 0;
		double amt = 0;
		do 
		{
			System.out.println("\nMenu : \n\t1.Create new Accounts\n\t2.Withdraw\n\t3.Deposit\n\t4.Display Account by Id\n\t5.Exit");
			System.out.println("\nEnter your choice :");
			choice = sc.nextInt();
			
			switch(choice) 
			{
			case 1:
				AccountService.acceptAccountData(a);
				break;
			case 2:
				System.out.println("\nEnter Account Id:");
				id = sc.nextInt();
				System.out.println("\nEnter Amount to be withdrawn :");
				amt = sc.nextDouble();
				double updtBal = AccountService.withdrawAmt(a,id,amt);
				if(updtBal != -1)
					System.out.println("\nUpdated Balance:" + updtBal);
				else
					System.out.println("\nInsufficient Funds !");
				break;
			case 3:
				System.out.println("\nEnter Account Id:");
				id = sc.nextInt();
				System.out.println("\nEnter Amount to be deposited:");
				amt = sc.nextDouble();
			    updtBal = AccountService.depositAmt(a,id,amt);
				System.out.println("\nUpdated account balance is:" + updtBal);
				break;
			case 4:
				System.out.println("\nEnter Id :");
				id = sc.nextInt();
				AccountService.displayAccId(a,id);
				break;
			case 5:
				System.out.println("\nExited");
				break;
			default:
				System.out.println("\nPlease enter valid choice ! ");	
			}
		}while(choice!=5);
			
	}
}


