package DailyAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CopyarrayList {

	public static void main(String[] args) {
		List<String> l1=new ArrayList<String>();
		l1.add("1");
		l1.add("2");
		l1.add("3");
		l1.add("4");
		System.out.println("list l1:"+l1);
		List<String> l2=new ArrayList<String>();
		l2.add("a");
		l2.add("b");
		l2.add("c");
		l2.add("d");
		System.out.println("list l2:"+l2);
		Collections.copy(l2, l1);
		System.out.println("list l2:"+l2);

	}

}
