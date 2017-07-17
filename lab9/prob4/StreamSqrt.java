package labs.lab9.prob4;

import java.util.stream.IntStream;

public class StreamSqrt {
	
	public static void main(String[] args) {
		printSquares(4);
		printSquares(3);
		
	}
	
	public static void printSquares(int num) {
		System.out.println("\n##### The first " + num + " squares" + " #####\n");
		IntStream.iterate(1, n->n+1)
				.limit(num)
				.map(n-> n*n)
				.forEach(System.out::println);
	}

}
