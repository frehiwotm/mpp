package labs.lab9.prob1;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOf {
	public static void main(String[] args) {
		
		/*
		 * Creating Streams from values and joining them using "," delimiters. 
		 */
		Stream<String> stream = Stream.of("Bill", "Thomas", "Mary");
	
		System.out.println(stream.collect(Collectors.joining(",")));
	    
	}

}
