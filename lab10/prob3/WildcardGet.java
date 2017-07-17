package labs.lab10.prob3;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class WildcardGet {
	
	public static double sum(Collection<? extends Number> list) {
		double sum = 0.0;
		
		for(Number num:list){
			sum += num.doubleValue(); 
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		System.out.println("\n##### Wildcard Get : Integer #####\n");
		List<Integer> intList = Arrays.asList(4, 2, 9, 7, 5);
		System.out.println("The total sum of the list is: " + sum(intList));
		
		System.out.println("\n\n##### Wildcard Get : Double #####\n");
		List<Double> doubleList = Arrays.asList(4.8, 1.5, 6.6, 7.0);
		System.out.println("The total sum of the list is: " + sum(doubleList));
	}

}
