package labs.lab9.prob3;

import java.util.List;

@FunctionalInterface
interface QuintFunction<S, T, V, U, R>{
	
	R apply(S s, T t, V v, U u);
}
public class LambdaLibrary1 {
	
	final static QuintFunction<List<String> , String , String, Integer, Integer> filterWords =
					(words, charIn, charEx, len) -> 
									 (int) words.stream()
									 .filter(word -> word.length()==len )
									 .filter(word -> word.contains(charIn) && !word.contains(charEx))
									 .count();
    

}