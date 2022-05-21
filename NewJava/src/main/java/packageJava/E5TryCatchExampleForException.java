package packageJava;

public class E5TryCatchExampleForException {

	public static void main(String[] args) {
		
		try {
			int num = 10;
			int num1= 0;
			int res= num/num1;
		System.out.println(res);
		}		
		catch(NullPointerException e) {
			System.out.println("Its Null Pointer Exception");
		}
		catch(ArithmeticException e){
			System.out.println("Its Arithematic Exception");
		}
		catch(Exception e) {
			System.out.println("Its an Exception");
		}
		

	}

}
