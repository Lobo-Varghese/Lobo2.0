package packageJava;

//Multiple Inheritance not supported, implemented using Interface
public class  D8BenzForAbstarctionAndInterface extends D6CarsForAbstarction implements D9UpComingProjectsForInterface,E1Interface2ForInterface{
	@Override 
	public void engineSecret() {
		System.out.println("Benz's engine Secret");
	}
	@Override
	public void companyVault() {
		System.out.println("Benz's Company Vault");
	}
	
	public static void main(String[] args) {
		D6CarsForAbstarction car = new D8BenzForAbstarctionAndInterface();
		car.engineSecret();
		car.companyVault();

	}

	public void employees() {
		System.out.println("employee");
		
	}
	
	public void method2() {
		System.out.println("method2");
		
	}
	
	public void method3() {
		System.out.println("method3");
		
	}

}
