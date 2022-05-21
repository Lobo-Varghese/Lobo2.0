package packageJava;

public class C3StaticVariableForStaticKeyword {
	
	static int accountBalance = 0;
	String depositedBy = "Celine";

	public static void main(String[] args) {
		C3StaticVariableForStaticKeyword obj1 = new C3StaticVariableForStaticKeyword();
		int acc1 = obj1.accountBalance=100;
		String dep1 = obj1.depositedBy="Lobo";
		
		C3StaticVariableForStaticKeyword obj2 = new C3StaticVariableForStaticKeyword();
		int acc2 = obj2.accountBalance=2000;
		String dep2 = obj2.depositedBy="Deepa";
		
		System.out.println(acc1);
		System.out.println(dep1);
		System.out.println(acc2);
		System.out.println(dep2);

	}

}
