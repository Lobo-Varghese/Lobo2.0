package packageJava;

public class E2StringExamples {
	
	/***
	 * 
	 * 
	 * 
	 * STRING
	 * ******
	 * 1)Object that represents sequence of char values
	 * eg: "LOBO" is a string of 4 characters
	 * 2)In Java, string is a immutable object, which means its constant , which cannot be 
	 * changed once its created
	 * 3) The Java.lang.String implements Serializable, Comparable and CharSequence Interface
	 * 
	 * How to create a String?
	 * 1) By String literal  --> String name1 = "Lobo";
	 * 						--> String name2 = "Lobo";
	 * String Creation via String Literal : pointer moves to same object
	 * 2) By new key word	--> String name = new String("Lobo");
	 * String Creation via new Keyword :new object is created in Heap memory even if a object exist with same name
	 * 
	 * 
****/
	public static void main(String[] args) {
		
		//Character Start with 0
		
		// returns character value for particular index
		String name = "  Lobo Varghese  ";
		System.out.println(name.charAt(5));
		
		//print string length
		System.out.println(name.length());
		
		//check the equality of object with given object
		System.out.println(name.equals("Lobo"));
		
		//check equality ignoring the case
		System.out.println(name.equalsIgnoreCase("Lobo varghESE"));
		
		//Check whether empty
		System.out.println(name.isEmpty());
		
		//check whether contains character
		System.out.println(name.contains("V"));
		
		//takes particular portion of string from begin index
		System.out.println(name.substring(3));
		
		//takes particular portion of string from begin and end index
		System.out.println(name.substring(5, 12));
		
		//concats character
		System.out.println(name.concat(" is well"));
		
		//replace a/group character
		System.out.println(name.replace('V', 'E'));
		System.out.println(name.replace("Varghese", "Deepa"));
		
		//index of Character
		//method overloading
		System.out.println(name.indexOf('V'));
		
		//index of character from a position
		System.out.println(name.indexOf('a',3));
		System.out.println(name.indexOf("ese", 0));
		
		//trim end spaces
		System.out.println(name.trim());
		
		//convert the given data type to string
		int number = 5;
		System.out.println(String.valueOf(number));
		
		//convert to lower case
		System.out.println(name.toLowerCase());
		
		//convert to uppercase
		System.out.println(name.toUpperCase());
		
		//join the string with given delimiter
		System.out.println(String.join("/","12","12","2012"));
		
		String[] s = name.split("a");
		System.out.println(s[0]);
		System.out.println(s[1]);
		
		for(String splitted: s) {
			System.out.println(splitted);
			
			
		}
	}

}
