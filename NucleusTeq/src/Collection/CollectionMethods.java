package Collection;

//Collection is an Interface.
//Collection is used to store the objects or it is a group of objects.

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionMethods {

	public static void main(String[] args) {

		ArrayList aList1 = new ArrayList(); // ArrayList is Implemented class of List Interface.

		aList1.add(10); // add() to add the objects in the collection.
		aList1.add(20);
		aList1.add(7);
		aList1.add(21);

		System.out.println("Array List 1 is : " + aList1);

		ArrayList aList2 = new ArrayList();

		aList2.add(19); // add() to add the objects in the collection.
		aList2.add(2);
		aList2.add(1);
		aList2.add(21);

		System.out.println("Array List 2 is : " + aList2);

		aList1.addAll(aList2); // addAll() to add the one collection objects to another collection objects.
		System.out.println("ArrayList 2 is added to ArrayList 1 : " + aList1);

		aList1.remove(0);
		System.out.println(aList1);

		aList1.removeAll(aList2);
		System.out.println(aList1);

		System.out.println(aList1.contains(20)); // checks if the object contains in the collection.
		System.out.println(aList2.containsAll(aList2));

		System.out.println(aList1.isEmpty()); // checks if the list is empty.

		System.out.println(aList1.size());

	}

}
