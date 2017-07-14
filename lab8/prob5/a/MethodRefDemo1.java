package labs.lab8.prob5.a;

import java.util.Arrays;
import java.util.List;

public class MethodRefDemo1 {
	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "cherries", "blums");
		
		// Prints the fruits using lambda.
		System.out.println("a. Using forEach Lambda:\n");
		fruits.forEach((fruit)-> System.out.println(fruit));
		
		// Prints the fruits using method reference.
		System.out.println("\nb. Using method reference:\n");
		fruits.forEach((System.out::println));
	
		}
	}


