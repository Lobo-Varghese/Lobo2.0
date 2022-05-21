package packageJava;

public class C1StaticMethodForStaticKeyword {
	
	public static void method1() {
		System.out.println("Static Method");
	}
	
	public void nonStaticMethod() {
		method1(); //Static method can be called in non static method
		System.out.println("Non Static Method");
	}

	public static void main(String[] args) {
				
		method1();
		C1StaticMethodForStaticKeyword method = new C1StaticMethodForStaticKeyword();
		method.nonStaticMethod();
	}

}
