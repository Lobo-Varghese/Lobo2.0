package packageJava;

public class E6FinallyExampleForException {
	
	public static int dummy() {
		return 5;
	}

	public static void main(String[] args) {
		try {
			System.out.println("This is try block");
			System.exit(0);
			System.out.println(dummy());
			//throw new Exception();
			System.out.println("After Exception");
		}
		catch(Exception e){
			System.out.println("This is catch Block");
		}finally {
			System.out.println("This is finally");
		}

	}

}
