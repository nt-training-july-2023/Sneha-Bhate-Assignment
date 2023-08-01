//Given an integer representing the threshold size, write a method which would print all the
//elements existing in the map and then clear the map if the size of the map is equal to or greater
//than the threshold size provided as input. There would be another method which would add the
//elements in the map.

package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class MapTask3 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		Scanner scanner = new Scanner(System.in);

		map.put(101, "Sneha Bhate");
		map.put(102, "Akshat Bhate");
		map.put(103, "Kanika Patidar");
		map.put(104, "Aayesha Sharma");
		map.put(105, "Shivranjani Parmar");
		map.put(106, "Vanshika Gangrade");

		for (Entry<Integer, String> entry : map.entrySet()) {

			System.out.println("key : " + entry.getKey());
			System.out.println("value :" + entry.getValue());

		}

		System.out.println("Enter the threshold value : ");
		int th = scanner.nextInt();

		if (th >= map.size())

			map.clear();

		System.out.println(map);

	}

}
