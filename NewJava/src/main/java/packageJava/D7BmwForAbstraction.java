package packageJava;

public class D7BmwForAbstraction extends D6CarsForAbstarction{
	
	@Override
	public void engineSecret() {
		System.out.println("BMW's engine Secret");
	}
	@Override
	public void companyVault() {
		System.out.println("BMW's Company Vault");
	}

	public static void main(String[] args) {
		D6CarsForAbstarction car = new D7BmwForAbstraction();
		car.engineSecret();
		car.companyVault();
	}

}
