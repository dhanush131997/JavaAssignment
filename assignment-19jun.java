1)Difference between array and collection.

	Arrays                           Collection
1)Arrays are fixed in size.          1)Collections are growable in nature.
2)Arrays contain both primitive      2)Collection contains only objects but not primitives
 and object type
3)Arrays can hold only homogenous    3)Collection can hold both homogenous as well as
data type elements.                     heterogenous data.
4)If we know the size of the elements 4)If we know the size of the elements
it is good to go for arrays.             it is good to go for arrays.
5)ex:int[] arr=new int[5];            5)ex:ArrayList<String> l=new ArrayList<String>();

2)explain various interfaces used in collection framework?
The Collection interface is the interface which is implemented by all the classes in the collection framework. 
It declares the methods that every collection will have. In other words, 
we can say that the Collection interface builds the foundation on which the collection framework depends.

Some of the methods of Collection interface are Boolean add ( Object obj), Boolean addAll ( Collection c), void clear(), etc. 
which are implemented by all the subclasses of Collection interface. 

List interface:
List interface is the child interface of Collection interface. 
It inhibits a list type data structure in which we can store the ordered collection of objects. It can have duplicate values.

List interface is implemented by the classes ArrayList, LinkedList, Vector, and Stack.

To instantiate the List interface, we must use :
List <data-type> list1= new ArrayList();  
List <data-type> list2 = new LinkedList();  
List <data-type> list3 = new Vector();  
List <data-type> list4 = new Stack();  
There are various methods in List interface that can be used to insert, delete, and access the elements from the list.

Queue interface:
Queue interface maintains the first-in-first-out order. 
It can be defined as an ordered list that is used to hold the elements which are about to be processed.
 There are various classes like PriorityQueue, Deque, and ArrayDeque which implements the Queue interface.

Queue interface can be instantiated as:

Queue<String> q1 = new PriorityQueue();  
Queue<String> q2 = new ArrayDeque();  
There are various classes that implement the Queue interface, some of them are given below.

Deque Interface:
Deque interface extends the Queue interface. In Deque, we can remove and add the elements from both the side. 
Deque stands for a double-ended queue which enables us to perform the operations at both the ends.

Deque can be instantiated as:

Deque d = new ArrayDeque();  

Set Interface:
Set Interface in Java is present in java.util package. It extends the Collection interface. It represents the unordered set of elements which doesn't allow us to store the duplicate items. We can store at most one null value in Set. Set is implemented by HashSet, LinkedHashSet, and TreeSet.

Set can be instantiated as:

Set<data-type> s1 = new HashSet<data-type>();  
Set<data-type> s2 = new LinkedHashSet<data-type>();  
Set<data-type> s3 = new TreeSet<data-type>();  

3)Difference between ArrayList and Vector.
*java.util.Vector came along with the first version of java development kit (JDK). 
java.util.ArrayList was introduced in java version1.2, as part of java collections framework.
*All the methods of Vector is synchronized. But, the methods of ArrayList is not synchronized.
*Vector and ArrayList both uses Array internally as data structure. 
They are dynamically resizable. 
*By default, Vector doubles the size of its array when its size is increased. 
But, ArrayList increases by half of its size when its size is increased.
*vector is slow compared to arraylist

4)Difference between ArrayList and LinkedList.
*Arraylist stores the data in the form of array where as linkedlist stores in the form of nodes.
*Data structure used is growable or resizeable array in case of arraylist where as linked list is doubly linked list.
*Arraylist can be use for search and retrieval operations where as linked list can be used for insertion and removal operations.
*arraylist as three overloaded constructors where as linked list as two overloaded constructors.
*intial and incremental capacity is applicable for arraylist but not for linked list.
*Memory required is less in case of arraylist where as linked list needs more memory.

5)Difference between Iterator and listIterator.
*Iterator is a interface and ListIterator is a sub interface of Iterator.
*Iterator is used to iterate only in forward direction where listiterator can iterate in both forward and backward direction.
*Iterator is not index based where as ListIterator is indexbased.
*Iterator can be used iterate all the iterfaces of collection where as ListIterator can iterate only List interface.

6)Difference between list and set.
1
Positional access: 
The list provides positional access of the elements in the collection.
Set doesn't provide positional access to the elements in the collection
2
Implementation: 
Implementation of List are ArrayList,LinkedList,Vector ,Stack
Implementation of a set interface is HashSet and  LinkedHashSet
3
Duplicate: 
We can store the duplicate elements in the list.
We can’t store duplicate elements in Set 
4
Ordering: 
List maintains insertion order of elements in the collection 
Set doesn’t maintain any order 
5
Null Element: 
The list can store multiple null elements 
Set can store only one null element

7)Difference between hashset and treeset.
1
Implementation: 
Hash set is implemented using HashTable 
The tree set is implemented using a tree structure. 
2
Null Object: 
HashSet allows a null object 
The tree set does not allow the null object. It throws the null pointer exception. 
3
Methods: 
Hash set use equals method to compare two objects 
Tree set use compare method for comparing two objects. 
4
Heterogeneous object:
Hash set doesn't allow a heterogeneous object 
Tree set allows a homogeneous object. 
5
Ordering 
HashSet does not maintain any order 
TreeSet maintains an object in sorted order 

8)Difference between hashset and hashmap.
HashMap
Hash Set
HashMap  is an implementation of Map interface
HashSet is an implementation of Set Interface
HashMap Stores data in form of  key-value pair
HashSet Store only objects
Put method is used to add element in map
Add method is used to add element is Set
In hash map hashcode value is calculated using key object
Here member object is used for calculating hashcode value 
which can be same for two objects so equal () method is used to check for equality if it returns false that means two objects are different.
HashMap is faster than HashSet because unique key is used to access object
HashSet is slower than Hashmap

9)Difference between Hashmap and Hashtable.
1. Synchronization or Thread Safe :  This is the most important difference between two .
 HashMap is non synchronized and not thread safe.On the other hand, Hashtable is thread safe and synchronized.
 Hashtable should be used in multithreading applications.

2. Null keys and null values :  HashMap allows one null key and any number of null values, 
while Hashtable do not allow null keys and null values in the Hashtable object.

3. Iterating the values:  HashMap object values are iterated by using iterator .
Hashtable is the only class other than vector which uses enumerator to iterate the values of Hashtable object.
4.  Fail-fast iterator  : The iterator in HashMap is fail-fast iterator while the enumerator for Hashtable is not.
5. Performance :  HashMap is much faster and uses less memory than Hashtable as former is unsynchronized .
 Unsynchronized objects are often much better in performance in compare to synchronized  object like Hashtable in single threaded environment.

10)Difference between compareable and comparator.
1.  Sort sequence :  In comparable ,Only one sort sequence can be created while in comparator many sort sequences can be   created .

2.  Methods Used : Comparator interface in Java has method public int compare (Object o1, Object o2) which returns a negative integer, 
			zero, or a positive integer as the first argument is less than, equal to, or greater than the second. 
			While Comparable interface has method public int compareTo(Object o) which returns a negative integer, 
			zero, or a positive integer as this object is less than, equal to, or greater than the specified object.

3.  Objects needed for Comparision : If you see then logical difference between these two is Comparator in Java compare two objects provided to it ,
 					while Comparable interface compares "this" reference with the object specified. 
					So only one object is provided which is then compared to "this" reference.

4 Modify Classes :One has to modify the class whose instances you want to sort while in comparator one build a class separate from the class whose instances
		 one want to sort .

5. Package : Comparator in Java is defined in java.util package while Comparable interface in Java is defined in java.lang package,
		 which very much says that Comparator should be used as an utility to sort objects which Comparable should be provided by default.

11)How to synchronize List,Map and Set elements.
*To sychronize List:
To synchronize ArrayList, we use Collections.synchronizedList() method. 
This method returns synchronized list backed by the specified list. 
There is an advise from javadocs that while iterating over the synchronized list, you must use it in a synchronized block.
 Failed to do so may result in non-deterministic behavior.
*To Synchronize Set:
We use Collections.synchronizedSet() method to synchronize HashSet. 
This method returns synchronized set backed by the specified set. 
There is also an advice from javadocs that you must use this synchronized set in a synchronized block while iterating over it. 
If you don’t do this, it may result in non-deterministic behavior.
*To Synchronize Map:
We use Collections.synchronizedMap() to synchronize HashMap. 
This method returns synchronized map backed by the specified map. 
You must iterate it in a synchronized block to avoid unexpected behavior.

12)what do you uderstand by failfast.
A fail-fast system is nothing but immediately report any failure that
is likely to lead to failure. When a problem occurs, a fail-fast system
fails immediately. In Java, we can find this behavior with iterators.
Incase, you have called iterator on a collection object, and another
thread tries to modify the collection object, then concurrent modification
exception will be thrown. This is called fail-fast.

13)Difference between array and arraylist.
Array :

1. Arrays are static in nature. Arrays are fixed length data structures. You can’t change their size once they are created.
2. Arrays can hold both primitives as well as objects.

3. Arrays can be iterated only through for loop or for-eachloop.

4. The size of an array is checked using length attribute.

5. Arrays don’t support generics.

6. Arrays are not type safe.

Array List :

1. ArrayList is dynamic in nature. Its size is automatically increased if you add elements beyond its capacity
2. ArrayList can hold only objects.

3. ArrayList provides iterators to iterate through their elements.

4. The size of an ArrayList can be checked using size()method.

5. ArrayList supports generics.

6. ArrayList are type safe.

14)How to remove duplictes from arraylist.
The easiest way to remove repeated elements is to add the contents to a Set (which will not allow duplicates)
 and then add the Set back to the ArrayList : Set<String> set = new HashSet<>(list); 
						list. clear(); 
						list. addAll(set);