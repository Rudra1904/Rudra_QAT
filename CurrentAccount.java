package Test;

public class CurrentAccount implements BankAccount{

	@Override
	public void checkBankBalance() {
		System.out.println("Current account balance is Rs.10000");
		
	}

	@Override
	public void validateUser() {
		System.out.println("Current account user validated");
		
	}

}
