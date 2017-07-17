package labs.lab9.prob5;

import java.util.Arrays;
import java.util.stream.Stream;

public class Section {
	
	public static Stream<String> streamSection(Stream<String> stream, int m, int n){
		
		return stream.limit(n).skip(m-1);
	}
	
	public static Stream<String> nexStream(){
		
		return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh","iii").stream();
	}
	
	public static void main(String[] args) {
		
		Stream<String> subStream = nexStream();
		streamSection(subStream, 2,4).forEach(System.out::println);
		
		
	}

}
