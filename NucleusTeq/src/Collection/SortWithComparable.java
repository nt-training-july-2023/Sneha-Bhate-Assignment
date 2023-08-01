package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortWithComparable {

	public static void main(String[] args) {

		ArrayList<Employee> employee = new ArrayList<Employee>();

		employee.add(new Employee(111, "Sneha", "293938"));
		employee.add(new Employee(102, "Aayesha", "89389"));
		employee.add(new Employee(109, "Shivranjani", "4673"));

		// For Comparable
		System.out.println("Using Comparable Interface : ");
		System.out.println("Sorting over IDs : ");
		System.out.println(employee);
		Collections.sort(employee);
		System.out.println(employee);

		// For Comparator

		System.out.println("Using Comparator Interface : ");
		System.out.println("Sorting over IDs : ");
		Collections.sort(employee, new IdComparator());
		System.out.println(employee);

		System.out.println("Sorting over names : ");
		Collections.sort(employee, new NameComparator());
		System.out.println(employee);

		System.out.println("Sorting over phone no. : ");
		Collections.sort(employee, new PhoneComparator());
		System.out.println(employee);

	}
}
