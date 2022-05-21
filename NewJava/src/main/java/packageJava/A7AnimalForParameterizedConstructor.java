package packageJava;

public class A7AnimalForParameterizedConstructor {

	
	String animalName;
	String animalType;
	//Define Parameterized Constructor 
	A7AnimalForParameterizedConstructor(String name,String type){
		animalName = name;
		animalType = type;
	}
	public void sayAboutAnimal() {
		System.out.println("ParameterizedConstructor Animal Name: "+ animalName);
		System.out.println("ParameterizedConstructor Animal Type: "+ animalType);
	}
	
	public static void main(String[] args) {
		
		A7AnimalForParameterizedConstructor ParaConstructor1 = new A7AnimalForParameterizedConstructor("Dog", "Domestic");
		ParaConstructor1.sayAboutAnimal();
		
		A7AnimalForParameterizedConstructor ParaConstructor2 = new A7AnimalForParameterizedConstructor("Bear", "Wild");
		ParaConstructor2.sayAboutAnimal();
	}

}
