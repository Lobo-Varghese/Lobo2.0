package packageJava;

public class A2BankAccountForClass {
	
	Long accountNumber=123456789L;
	String holdername="Lobo";
	Integer accountBalance=500;
	
	public void getBalance() {
		System.out.println("Account Banlance: " + accountBalance);
	}

	public static void main(String[] args) {
		// ClassName objectName = new ClassName();
		A2BankAccountForClass account = new A2BankAccountForClass();
		account.getBalance();

	}

}
