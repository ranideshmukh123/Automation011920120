package Oops.abstraction;

public class HSBC implements RBI {

	@Override
	public void savingAccount() {
		// TODO Auto-generated method stub
		System.out.println("HSBC saving Account");
	}

	@Override
	public void currentAccount() {
		// TODO Auto-generated method stub
		System.out.println("HSBC current Account");
	}

	@Override
	public void debitCard() {
		// TODO Auto-generated method stub
		System.out.println("HSBC debit Card");
	}

	@Override
	public void creditCard() {
		// TODO Auto-generated method stub
		System.out.println("HSBC credit Card");
	}

}
