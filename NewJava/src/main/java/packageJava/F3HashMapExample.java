package packageJava;

import java.util.HashMap;

public class F3HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer,String> employee = new HashMap<Integer,String>();
		employee.put(1, "Lobo");
		employee.put(2, "Deepa");
		employee.put(3, "Celine");
		employee.put(4, "Lobo2");
		System.out.println("Employee Map: "+ employee);
		
		//to make a copy of the existing Map
		HashMap<Integer,String> duplicateMap = new HashMap<Integer,String>();
		duplicateMap.putAll(employee);
		System.out.println("Duplicate Map: "+duplicateMap);
		
		//clear to delete the map contents
		duplicateMap.clear();
		System.out.println("Duplicate Map cleared: "+duplicateMap);
		
		//To check key is present or not in Map
		System.out.println(employee.containsKey(1));
		
		//To check value is there or not
		System.out.println(employee.containsValue("Celine"));
		
		//Clone the Map
		System.out.println("Cloned Map: "+employee.clone());
		
		//check map empty or not
		System.out.println(employee.isEmpty());
		
		//keyset
		System.out.println(employee.keySet());
		
		//Fetch a value
		System.out.println(employee.get(1));
		
		//Fetch all the value
		System.out.println(employee.values());
		
		//entry set
		System.out.println(employee.entrySet());
	}

}
