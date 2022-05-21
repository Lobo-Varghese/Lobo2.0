package packageJava;

public class A5StudentForDefaultConstructor {
	
	String studentName;
	int RollNo;
	Integer RollNoInteger;
	
	//Example for Default Constructor
	
	//Compiler has created a default constructor here

	public static void main(String[] args) {
		A5StudentForDefaultConstructor student = new A5StudentForDefaultConstructor();
		System.out.println("Student Name: "+ student.studentName);
		System.out.println("Student Id in Int: "+ student.RollNo);
		System.out.println("Student Id in Integer: "+ student.RollNoInteger);
		System.out.println("This Means: Constructor is Used to provide default values to the object like 0, null, etc depending on the type");
		
	}

}
