package labs.lab8.prob5.b;

import java.util.Arrays;
import java.util.List;

public class MethodRefDemo2 {
	public static void main(String[] args) {
		
		// Prints the fruits using method reference.
		
		System.out.println("\nUsing method reference:\n");
		
		String[] names = {"Alexis", "Tim", "Kyleen", "KRISTY"};
		
		Arrays.sort(names, String::compareToIgnoreCase);
		
		for(int i=0; i< names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
