package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

		Set s = new HashSet(); // do not preserve insertion order.

		s.add(29);
		s.add(20);
		s.add(59);
		s.add(10);
		s.add(92);
		s.add(92); // do not contains the duplicate values.

		System.out.println(s);

		Iterator iterator = s.iterator();

	}
}
