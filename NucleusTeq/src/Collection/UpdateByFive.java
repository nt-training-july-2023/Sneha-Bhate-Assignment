//Task
//● Create a Integer collection and store 20 elements in it
//● Display elements of in reverse order without using for loop
//● Update elements of list by 5 whenever there is an element
//greater than 50 is encountered.
//● Display elements less than 60

package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UpdateByFive {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the elements of the list : ");

		for (int i = 0; i < 6; i++) {

			al.add(scanner.nextInt());
		}

		System.out.println("Array list is  : " + al);
		System.out.println("Array List size : " + al.size());

		Collections.reverse(al); // method of collections to reverse the list.

		System.out.println("Reversed List is : " + al);

		System.out.println("List is : ");

		for (int i = 0; i < al.size(); i++) {

			if (al.get(i) > 50) {

				al.set(i, al.get(i) + 5);

			}

		}

		System.out.println(al);

	}

}
