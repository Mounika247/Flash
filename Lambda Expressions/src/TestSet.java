import java.util.HashSet;
import java.util.TreeSet;

public class TestSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> names1 = new HashSet<>();
		TreeSet<String> names = new TreeSet<>();
		
		//Hashset -->Duplicate elements are identified and will give unique collections but they will not be sorted
		//Treeset  -->Duplicate elements are identified and will give unique collections but they will be sorted
		//Treeset uses compareTo method to sort the elements
		
		
		names.add("Hary");
		names.add("Kumar");
		names.add("Kiran");
		names.add("Archana");
		names.add("Amy");
		names.add("Rachel");
		names.add("Kumar");
		names.add("Archana");
		
		names.forEach(System.out::println);
		
		//** data structure internally used to implement hashset collection class is HashTable data structure ;
		// insertion order is not preserved in Hashset collection class
		
		
		
	}

}
