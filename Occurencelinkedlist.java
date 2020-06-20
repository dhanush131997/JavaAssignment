package DailyAssignment;

import java.util.LinkedList;

public class Occurencelinkedlist {

	public static void main(String[] args) {
		 LinkedList<String> ll1 = new LinkedList<String>();
		 			 ll1.add("Red");
		 			ll1.add("Green");
		 			ll1.add("Black");
		 			ll1.add("Pink");
		 			ll1.add("orange");
		      
		      // print original list
		   System.out.println("Original linked list:" + ll1);  
		 
		   // Find first element of the List
		    Object first_element = ll1.getFirst();
		    System.out.println("First Element is: "+first_element);
		 
		    // Find last element of the List
		    Object last_element = ll1.getLast();
		    System.out.println("Last Element is: "+last_element);
	}

}
