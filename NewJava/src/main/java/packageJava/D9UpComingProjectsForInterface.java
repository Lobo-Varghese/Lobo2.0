package packageJava;

public interface D9UpComingProjectsForInterface {
	//Variable are by default public, Static,final 
	String projects="test";
	
	//method are by default abstract
	//abstract method doesn't specify
	 void employees();
	 void method2();
	 void method3();
	 
	 //As all are unimplemented we cannot create object
	 // That's why WebDriver Interface we can instantiate as WebDriver driver = new WebDriver();
	 // We can only use WebDriver driver = new ChromeDriver / gekkoDriver();
	 // WebDriver interface just have findElement/get method as abstract, ChromeDriver Class implements it.
	
}
