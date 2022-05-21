package packageJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class E8ListForCollectionExample {

	public static void main(String[] args) {
		
		//Dynamic polymorphism base class and child class
		//
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("Benz");
		arrayList.add("BMW");
		arrayList.add("Bently");
		arrayList.add("Bently");
		//Insertion Order Maintained
		//Duplicate Allowed
		System.out.println(arrayList);
		//get the element
		System.out.println(arrayList.get(0));
		//index of element
		System.out.println(arrayList.indexOf("Bently"));
		//Last Index Of
		System.out.println(arrayList.lastIndexOf("Bently"));
		//-1 if Element not there
		System.out.println(arrayList.indexOf("Lobo"));
		//Clone a List
		List<String> anotherList = new ArrayList<>();
		anotherList.addAll(arrayList);
		System.out.println(anotherList);
		//Clear all the Elements in a List
		anotherList.clear();
		System.out.println(anotherList);
		//Remove Element using Index
		anotherList.addAll(arrayList);		
		anotherList.remove(3);
		System.out.println(anotherList);
		//using value
		anotherList.remove("Benz");
		System.out.println(anotherList);
		//null insertion is possible
		anotherList.add(null);
		//Set to update a element in a position
		anotherList.set(0, "Maruti");
		System.out.println(anotherList);
		//isEmpty
		System.out.println(anotherList.isEmpty());
		
		
		//iterate foreach
		System.out.println("Iterate using For each Loop: ");
		for(String s:arrayList) {
			System.out.println(s);
		}
		//iterate for loop
		System.out.println("Iterate using For Loop: ");
		for(int i=0;i<=arrayList.size()-1;i++) {
			System.out.println(arrayList.get(i));
		}
		//iterate using ListIterator
		System.out.println("Iterate using List Iterator");
		ListIterator<String> listiterator = arrayList.listIterator();
		while(listiterator.hasNext()){			
			System.out.println(listiterator.next());
		}
		//traverse reverse using List Iterator
		System.out.println("Iterate reverse using List Iterator");
		while(listiterator.hasPrevious()) {
			System.out.println(listiterator.previous());
		}
		
		//iterate using iteartor
		System.out.println("Traverse using iterator");
		Iterator<String> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//not synchronized or not tread safe which Throws ConcurrentModificationException
		System.out.println("Iterate using For each Loop: ");
		for(String s:arrayList) {
			System.out.println(s);
			//arrayList.add("test");
		}
		
		//Can add heterogeneous object if generic not used
		
		List ad = new ArrayList();
		ad.add(1);
		ad.add("String");
		System.out.println(ad);
	}

}
