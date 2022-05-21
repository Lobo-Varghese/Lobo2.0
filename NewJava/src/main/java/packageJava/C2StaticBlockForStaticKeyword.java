package packageJava;

public class C2StaticBlockForStaticKeyword {
	
	{
		System.out.println("Inside Block");
	}
	
	static	{
		System.out.println("Inside Static Block1");
	}
	static {
		System.out.println("Inside Static Block2");
	}

	public static void main(String[] args) {
		System.out.println("Inside Main Method");

	}

}
