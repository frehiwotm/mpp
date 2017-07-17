package labs.lab9.prob3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountWordsGood {
	
	public int countWords(List<String> words, char c, char d, int len) {
		
		return (int)words.stream()
				.filter(word -> word.length()==len )
				.filter(word -> word.contains(Character.toString(c)) && !word.contains(Character.toString(d)))
				.count();
	}
	
	public static void main(String[] args) {
		CountWordsGood countWord = new CountWordsGood();
		List<String> words = Arrays.asList("passage", "its", "ten", "led", "ink", "sik","hearted", "recoval", "cordial", "preference" ,"campany", "astonished");
		System.out.println(countWord.countWords(words, 'c', 'm', 7));
		System.out.println(countWord.countWords(words, 'i', 'm', 3));
	}

}
