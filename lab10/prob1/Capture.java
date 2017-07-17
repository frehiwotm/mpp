package labs.lab10.prob1;

import java.util.Arrays;
import java.util.List;

public class Capture {
	
	public static void reverse(List<?> list) {
		Capture cap = new Capture();
		cap.reverseHelper(list);		
	}
	
	private <T> void reverseHelper(List<T> list) {
		List<T> temp = list;
		for(int i=temp.size()-1, j=0; i >= 0; i--, j++) {
			list.set(j, list.get(i));
		}
		
	}
	
	public static void main(String[] args) {
		
		List<String> myList = Arrays.asList("Java", "MPP", "SE");
		System.out.println("\n##### Original List #####\n");
		System.out.println(myList);
		
		System.out.println("\n##### Reversed List #####\n");
		reverse(myList);
		System.out.println(myList);
	}

}
