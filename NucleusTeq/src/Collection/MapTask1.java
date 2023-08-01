//Iterate through a map and print the key(Employee Id) for all the elements that contains string
//provided as an input to the map (The name of the employee). Create another method to add
//elements to the map. The map should have an integer as the key(Employee Id) and the string as
//value (Employee name).

package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MapTask1 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		Scanner scanner = new Scanner(System.in);

		map.put(101, "Sneha Bhate");
		map.put(102, "Akshat Bhate");
		map.put(103, "Kanika Patidar");
		map.put(104, "Aayesha Sharma");
		map.put(105, "Shivranjani Parmar");
		map.put(106, "Vanshika Gangrade");

		System.out.println(map);
		System.out.println("Employee Id's" + map.keySet());
		System.out.println("Name of the employees" + map.values());

		System.out.println(map.containsKey(100));
		System.out.println(map.containsKey(101));

		System.out.println(map.containsValue("Sneha Bhate"));
		System.out.println(map.containsValue("Shivani"));

		map.remove(106, "Vanshika Gangrade");
		System.out.println(map);

		for (Integer keyInteger : map.keySet()) {
			System.out.println(keyInteger);
		}

		for (Entry<Integer, String> entry : map.entrySet()) {

			System.out.println("key : " + entry.getKey());
			System.out.println("values :" + entry.getValue());

		}
		System.out.println("Enter the Name(value) to remove a particular entry set : ");
		String value1 = scanner.nextLine();
		for (Entry<Integer, String> entry : map.entrySet()) {

			if (map.containsValue(value1)) {

				map.remove(entry.getKey());
				break;

			}
		}
		System.out.println(map);

		scanner.close();
	}

}
