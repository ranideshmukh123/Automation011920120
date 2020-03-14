package Oops.abstraction;

import Oops.inheritance.Telephone;

public class BankUser {

	public static void main(String[] args) {
		
	/*	int a=10;
		int b=20;		
		sum(a,b);
		
		RBI obj= new HDFC();
		callBank(obj); */
		
		sum(10,20);
		callBank(new HDFC());
		callBank(new HSBC());
		callBank(new SBI());
		

		callphone(new Telephone());
	}
	
	
	public static void callBank(RBI bank)
	{
		
		bank.creditCard();
		bank.debitCard();
		bank.currentAccount();
		bank.savingAccount();
		bank.demonetization();
	}
	
	public static void callphone(Telephone phone)
	{
		phone.calling();
	}
	
	public static void sum(int a,int b)
	{
		
	}

}
