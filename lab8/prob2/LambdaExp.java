package labs.lab8.prob2;

import java.util.function.Supplier;

public class LambdaExp {
	
	public static void main(String[] args) {
		
		Supplier<Double> supply = ()-> Math.random();
		
		System.out.println("\n+++++++ Random number generation using Lambda expression +++++++\n");
		System.out.println("\tRandom number 1: " + supply.get());
		System.out.println("\tRandom number 2: " + supply.get());
		System.out.println("\tRandom number 3: " + supply.get());
	}

}
