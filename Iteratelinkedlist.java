package DailyAssignment;

import java.util.Iterator;
import java.util.LinkedList;

public class Iteratelinkedlist {

	public static void main(String[] args) {
		 LinkedList<String> list = new LinkedList<String>();
		          list.add("Red");
		          list.add("Green");
		          list.add("Black");
		          list.add("White");
		          list.add("Pink");
		// set Iterator at specified index
		   Iterator p = list.listIterator(1);

		   // print list from second position
		   while (p.hasNext()) {
		   System.out.println(p.next());
		   }
	}

}
