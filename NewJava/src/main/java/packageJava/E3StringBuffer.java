package packageJava;

public class E3StringBuffer {

	/*****
	 * StringBuffer 
	 * ************ 
	 * 1)It is mutable, i.e it can be changed 2)Its
	 * synchronized i.e multiple object cannot access it simultaneously Thats why
	 * its Thread Safe
	 * 2)Less Efficient
	 * 
	 * How to create String Buffer Object 1) Can only be created using new
	 * Keyword(literal wont work) StringBuffer s= new StringBuffer("Lobo");
	 * 
	 * StringBuffer s= "Lobo"; --> THIS WONT WORK
	 * 
	 * STRING BUILDER:
	 * ***************
	 * 1)StringBuilder is mutable
	 * 2)String Builder is non Synchronised i.e multiple thread can be simutaneously accessed
	 * 	So not Thread Safe
	 * 3)More Efficient
	 *******/

	public static void main(String[] args) {

		System.out.println("String is Mutable");
		System.out.println("*****************");
		String name = new String("Lobo");
		String name1 = name.concat(" Varghese");
		System.out.println("Name after Concat: " + name1);
		System.out.println("Original Name: " + name);

		System.out.println("*************************");
		System.out.println("*************************");

		System.out.println("StringBuffer is ImMutable");
		System.out.println("*****************");
		StringBuffer name2 = new StringBuffer("Lobo");
		StringBuffer name3 = name2.append(" Varghese");
		System.out.println("Name after Concat: " + name3);
		System.out.println("Original Name: " + name2);
		System.out.println("*************************");

		// StringBuffer Methods
		// Reverse : String doesn't have reverse as it immutable but String Buffer has
		StringBuffer reversethis = new StringBuffer("Lobo");
		StringBuffer rev = reversethis.reverse();
		System.out.println("Reverse using StringBuffer: " + rev);

		// Replace
		StringBuffer replacethis = new StringBuffer("Lobo");
		StringBuffer rep = reversethis.replace(0, 1, "Var");
		System.out.println("Replaced String: " + rep);

		// Delete
		StringBuffer del = new StringBuffer("Lobo");
		StringBuffer dele = del.delete(0, 1);
		System.out.println("Deleted Val: "+dele);

		// Insert
		StringBuffer ins = new StringBuffer("Lobo");
		StringBuffer inst = ins.insert(0,"Test");
		System.out.println("Inserted val: "  +inst);
		
		// Capacity
		System.out.println("Capacity: "+ ins.capacity());
	}

}
