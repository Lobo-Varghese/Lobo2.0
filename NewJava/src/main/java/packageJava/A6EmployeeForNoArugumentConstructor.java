package packageJava;

public class A6EmployeeForNoArugumentConstructor {
	
	int employeeId =1;
	String employeename = "Celine";
	//define a No Argument Constructor
	
	A6EmployeeForNoArugumentConstructor(){
		
	}
	
	//Above Constructor is created automatically in default constructor
	//Once we explicitly mention , it lose its status of default constructor
	//As no arguments /parameter is provided in the constructor its called No argument/parameter Constructor

	public static void main(String[] args) {
		A6EmployeeForNoArugumentConstructor noArg = new A6EmployeeForNoArugumentConstructor();

	}

}
