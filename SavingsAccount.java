package Test;

public class SavingsAccount implements BankAccount {

	@Override
	public void checkBankBalance() {
		System.out.println("Saving account balance is Rs.10000");
		
	}

	@Override
	public void validateUser() {
		System.out.println("Savings account user validated");
		
	}

}
