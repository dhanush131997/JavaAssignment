package DailyAssignment;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
	public static void main(String[] args){
        ArrayList<String> animals = new ArrayList<>();

        // Add elements in the array list
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        animals.add("Zebra");

        // Create an object of Iterator
        Iterator<String> iterate = animals.iterator();
        System.out.print("ArrayList: ");

        // Use methods of Iterator to access elements
        while(iterate.hasNext()){
            System.out.print(iterate.next());
            System.out.print(", ");
        }
    }
}
