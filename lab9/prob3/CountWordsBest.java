package labs.lab9.prob3;

import java.util.Arrays;
import java.util.List;

public class CountWordsBest {
	
	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("passage", "its", "ten", "led", "ink", "sik","hearted", "recoval", "cordial", "prefere" ,"campany", "astonished");
		
		System.out.println(LambdaLibrary1.filterWords.apply(words, "c", "m", 7));
		System.out.println(LambdaLibrary1.filterWords.apply(words, "i", "k", 3));
		System.out.println(LambdaLibrary1.filterWords.apply(words, "p", "k", 7));
	}

}
