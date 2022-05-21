package packageJava;

public class E4ExceptionAndTypes {
	
	/********
	 * EXCEPTION:
	 * ***********
	 * Exception is a undesirable or unexpected event which occurs during the execution of the program.
	 * It happens at the runtime, which can be handled by program
	 * 
	 * ERROR:
	 * *******
	 * Error is very severe problem which cant be handled by the program.
	 * Ex: computer run out of space
	 * 
	 * 									OBJECT
	 * 									   |
	 * 									Throwable
	 * 										|
	 * 				----------------------------------------
	 * 				|										|
	 * 		Exception 										Error
	 * 			|											|
	 * 			--->Checked Exception						----> Virtual Machine Error
	 * 		Ex: IO/Compile Time exception 					|
	 * 			|											|	
	 * 			|--->Unchecked Exception					|-->Assertion Error etc 									
	 * 		Ex: Runtime/Null Pointer Exception
	 * 
	 * Try catch Block:
	 * ****************
	 * Try block: This is block where we will write our code which may give run time exception
	 * Catch Block: This is where exception is handled. catch block is immediately followed by try block.
	 * 
	 *Important Point:
	 * ****************
	 * 1} It can have multiple catch Block
	 * 2} If multiple Catch block , it should not be Generic exception Type
	 * 3) If no exception , Catch Block wont get executed
	 * 
	 * Finally Block:
	 * ***************
	 * This block will execute even if exception occurs or not
	 * Used to close the connection of Db, excel or streams
	 * 
	 * Important Points:
	 * *****************
	 * 1) There is no finally without a TRY CATCH.
	 * 2) Finally is not mandatory. If exception occurs finally will be executed, or after the try catch finally will be executed
	 * 3) Finally Block also can have exception
	 * 4) Finally block execute even if try block contain control transfer statements like return, break or continue
	 * 
	 * Will Finally Block always execute?
	 * ***********************************
	 * 
	 * Nope. Finally Block will not execute if:
	 * 1) Thread is Dead.
	 * 2)When system.exit() is called
	 * 3) When an unrecoverable exception happens in finally block
	 *
	 * *****************/
	
	static String  name = "Lobo";
	
	static String val;
	
	public static void main(String[] args) {
		System.out.println(name); // no compile exception as variable is static
		try {
		System.out.println(val.length()); // throw run time exception , Null Pointer exception as val is null
		}catch(NullPointerException e) {
			System.out.println("Null Pointer Exception handled Successfully");
		}
		
	}

}
