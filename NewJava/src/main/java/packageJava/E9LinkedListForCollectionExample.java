package packageJava;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class E9LinkedListForCollectionExample {
	//Linkedlist is implemented using Doubly linked List, so insertion deletion easy as it use reference
	//Implements Serializable and Clonable interface
	//Unlike ArrayList, its not suited for search Operation as it doen't implement RandomAccess Interface
	// As list it maintain Order and Allow Duplicate
	public static void main(String[] args) {
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		linkedlist.add(1);
		linkedlist.add(5);
		linkedlist.add(6);
		linkedlist.add(3);
		linkedlist.add(3);
		System.out.println(linkedlist);
		//add first Method
		linkedlist.addFirst(2);
		System.out.println(linkedlist);
		//Add Last
		linkedlist.addLast(9);
		System.out.println(linkedlist);
		
		//Get First Element
		System.out.println(linkedlist.get(0));
		System.out.println(linkedlist.getFirst());
		//Get Last Element
		System.out.println(linkedlist.get(linkedlist.size()-1));
		System.out.println(linkedlist.getLast());
		//RemoveFirst and last
		System.out.println(linkedlist.removeFirst());
		System.out.println(linkedlist.removeLast());
		System.out.println(linkedlist);
		
		//Remove using Poll
		System.out.println(linkedlist.poll());
		System.out.println(linkedlist.pollLast());
		System.out.println(linkedlist);
		
		//Iterate using For Loop
		System.out.println("Iterate using For Loop");
		for(int i=0;i<=linkedlist.size()-1;i++) {
			System.out.println(linkedlist.get(i));
		}
		//Iterate using Foreach or Advanced for loop
		System.out.println("Iterate using For Each");
		for(Integer in:linkedlist) {
			System.out.println(in);
		}
		//Iterate using while
		System.out.println("Iterate Using While");
		Iterator<Integer> itr = linkedlist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
