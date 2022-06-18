package packageJava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class F1SetAndExamples {
	
	/*******
	 * 
	 * SET:
	 * ****
	 * 1) Set(I) is child interface of Collection
	 * 2) Duplicate values are not allowed
	 * 3) Insertion Order is not maintained (as it is maintained using hascode(address))
	 * 4) Can insert heterogeneous method(if generics are not used)
	 * 
	 * 
	 * HashSet:
	 * ********
	 * 1)HashSet(C) are implementation of Set interface
	 *2) Duplicates not allowed
	 *3) Insertion order not maintained
	 *4)DS for Hashset is HashTable
	 *5) Implements Serializable and Cloneable
	 *
	 * LinkedHashSet:
	 ***************
	 *1) Insertion Order is allowed(This is the distinction)
	 *2) Underlying DS is HashTable + Linked List
	 *3) mostly similar to hashSet
	 *
	 *TreeSet:
	 *********
	 *1) TreeSet(C) implements SORTEDSET(I) and NAVIGABLE(SET)
	 *2) Duplicates not allowed
	 *3) Elements retrived in Natural Sorting Order
	 *4) Underlying DS is Binary Search Tree
	 *5) Heterogeneous Objects are not allowed(elements should be Comparable to Sort the Order)
	 *6) Null not allowed after 1.6 Java
	 *
	 * *********/

	public static void main(String[] args) {
		/**HashSet****/
		//Add the value
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("A");
		hashSet.add("D");
		hashSet.add(null);
		System.out.println(hashSet);
		
		//contains
		System.out.println(hashSet.contains("A"));
		
		//add all
		HashSet<String> hashSet1 = new HashSet<String>();
		hashSet1.addAll(hashSet);
		System.out.println(hashSet1);
		//conatains All
		System.out.println(hashSet1.containsAll(hashSet));
		
		//iterator
		Iterator<String> itr = hashSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());			
		}
		
		/*********Linked HashSet*************/
		Set linkedhaset = new LinkedHashSet();
		linkedhaset.add(1);
		linkedhaset.add("A");
		linkedhaset.add("C");
		linkedhaset.add("B");
		linkedhaset.add(null);
		System.out.println("Insertion Order maintained");
		System.out.println(linkedhaset);
		
		/******************TreeSet**********************/
		
		TreeSet<Integer> treeset = new TreeSet<Integer>();
		treeset.add(1);
		treeset.add(9);
		treeset.add(0);
		treeset.add(1);		
		treeset.add(4);		
		treeset.add(6);
		treeset.add(3);
		treeset.add(8);
		//Ascending Order
		System.out.println(treeset);
		//First Element
		System.out.println(treeset.first());
		//Last Elements
		System.out.println(treeset.last());
		//HeadSet : Value less than given set
		//TailSet : Value greater or equal to than given set
		System.out.println("HeadSet: "+treeset.headSet(4));
		System.out.println("TailSet: "+treeset.tailSet(4));
		//SubSet: not including last
		System.out.println(treeset.subSet(1, 6));
		//comparator: null when sorted in natural order
		System.out.println(treeset.comparator());
		//desending Set
		System.out.println(treeset.descendingSet());
		//descending Iterator
		Iterator<Integer> disitr = treeset.descendingIterator();
		while(disitr.hasNext()) {
			System.out.println(disitr.next());
		}
		//Generic Used should not be one which doesn't implement comparable interface
		TreeSet<StringBuffer> set = new TreeSet<StringBuffer>();
		set.add(new StringBuffer("A"));
		set.add(new StringBuffer("B"));
		System.out.println(set);
	}

}
