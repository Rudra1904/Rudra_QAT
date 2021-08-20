package Test;

public class MainActivityTest {

	public static void main(String[] args) {
		CurrentAccount ca= new CurrentAccount();
		SavingsAccount sa = new SavingsAccount();
		ca.checkBankBalance();
		ca.validateUser();
		sa.checkBankBalance();
		sa.validateUser();

	}

}
