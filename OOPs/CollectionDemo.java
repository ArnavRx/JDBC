
import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionDemo {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("Oracle");
		v.add("Microsoft");
		v.add("google");
		v.add("IBM");
		v.add("Apple");
		System.out.println("Iterating over vector using each");
		for (String elem : v) {
			System.out.println(elem);
		}
		System.out.println("iterating over vector using iterator");

		Iterator<String> itr = v.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		LinkedList<String> lst = new LinkedList<>();
		lst.add("tesla");
		lst.add("Apache");
		lst.addFirst("Apple");
		v.addAll(lst);// merging all into vector
		System.out.println("iterating over vector using for each");
		for (String elem : v) {
			System.out.println(elem);
		}
		// converting vector into set
		HashSet<String> set = new HashSet<>(v);
		System.out.println("iterating over Hashset using for each");
		for (String elem : set) {
			System.out.println(elem);
		}

		// converting set to trees
		TreeSet<String> tree = new TreeSet<String>(set);
		System.out.println("iterating over Treeset using for each");
		for (String elem : tree.descendingSet()) {
			System.out.println(elem);
		}
		// new way to iterate from Java8
		System.out.println("iterating over TreeSet using foreach");
		tree.forEach(System.out::println);
		
		String[] week = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
		List<String> days = Arrays.asList(week);
		days.forEach(System.out::println);
			
	}

}
