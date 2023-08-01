//Task
//● Create a String collection and store 20 elements in it
//● Elements stored should not be repeated.
//● Elements stored should preserve the insertion order
//● Implement different methods for this collection

package Collection;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class LinkedHashSetForString {

	public static void main(String[] args) {

		LinkedHashSet<String> lh = new LinkedHashSet<String>();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the elements : ");
		for (int i = 0; i < 5; i++) {

			lh.add(scanner.next());
		}
		System.out.println("Linked Hash set List is : " + lh);

		lh.add("Aayesha");
		System.out.println(lh);
		System.out.println(lh.contains("Aayushi"));
		System.out.println(lh.contains("sneha"));

		LinkedHashSet<String> lh2 = new LinkedHashSet<String>();
		System.out.println("Enter the elements : ");
		for (int i = 0; i < 5; i++) {

			lh2.add(scanner.next());
		}
		System.out.println(lh2);

		lh.addAll(lh2);
		System.out.println(lh);

		lh.remove("bhate");
		System.out.println(lh);

	}
}
