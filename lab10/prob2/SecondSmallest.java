package labs.lab10.prob2;

import java.util.Arrays;
import java.util.List;

public class SecondSmallest {
	
	public static <T extends Comparable<? super T>> T secondSmallest(List<T> list) {
		
		T firstSmall = list.get(0);
		T secondSmall = list.get(0);
        for (int i = 0; i < list.size() ; i ++){
           
            if (list.get(i).compareTo(firstSmall) < 0 ){
            	secondSmall = firstSmall;
            	firstSmall = list.get(i);
            }
 
            else if (list.get(i).compareTo(secondSmall) < 0 && list.get(i) != firstSmall) {
            	secondSmall = list.get(i);
            }
        }
        
        return secondSmall;
		
	}
	
	public static void main(String[] args) {
		
		List<Integer> ints = Arrays.asList(9, 7, 8, 3, 9, 1);
		List<String> strs = Arrays.asList("Hiwot", "Melak", "Abebe", "Fre");
		
		System.out.println("Second smallest number in the list is: " + secondSmallest(ints));
		
		System.out.println("Second smallest string in the list is: " + secondSmallest(strs));
		
	}

}
