package Collection;

import java.util.ArrayList;
import java.util.*;

public class ListDemo {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(12);
		list.add(39);
		list.add(82);
		list.add(12);
		list.add(13);
		list.add(19);
		list.add(52);
		list.add(72);

		System.out.println(list);
		list.add(0, 2); // added
		System.out.println(list);

//		list.add(10,8); // exception
//		System.out.println(list);

		Iterator iterator = list.iterator(); // Interface to iterate the list by using iterator() method

		while (iterator.hasNext()) {

			System.out.println(iterator.next());
		}

	}
}
