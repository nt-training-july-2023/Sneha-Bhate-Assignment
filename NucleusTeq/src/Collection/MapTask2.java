package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapTask2 {

	public static void main(String[] args) {

		// HashMap does not maintains the insertion and sorting order.

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>(); // create

		hashMap.put(101, "Sneha Bhate");
		hashMap.put(102, "Akshat Bhate");
		hashMap.put(103, "Kanika Patidar");
		hashMap.put(104, "Aayesha Sharma");
		hashMap.put(105, "Shivranjani Parmar");
		hashMap.put(106, "Vanshika Gangrade");

		System.out.println("Hash Map elements are : " + hashMap); // read

		hashMap.put(102, "Rituja Kekatpure"); // update
		hashMap.put(105, "Sampada Vyas");

		System.out.println("Updated Hash Map elements are : " + hashMap);

		hashMap.remove(104); // delete
		hashMap.remove(106);

		System.out.println("Hash map elements after deleting some elements : " + hashMap);

		// Linked hash Map maintains the insertion and sorting order .
		// because it holds the pointer of previous and next values.

		LinkedHashMap<Integer, String> lHashMap = new LinkedHashMap<Integer, String>(); // create

		lHashMap.put(201, "Sneha Bhate");
		lHashMap.put(202, "Aayushi Mandloi");
		lHashMap.put(203, "Ankit Kumar");
		lHashMap.put(203, "Abhishek Garg");
		lHashMap.put(205, "Aditi Dwivedi");

		System.out.println("Linked Hash Map elements are : " + lHashMap); // read

		lHashMap.put(203, "Rituja Kekatpure"); // update
		lHashMap.put(204, "Sampada Vyas");

		System.out.println("Updated Linked Hash Map elements are : " + lHashMap);

		hashMap.remove(203); // delete
		hashMap.remove(204);

		System.out.println("Linked Hash map elements after deleting some elements : " + lHashMap);

		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

	}

}
