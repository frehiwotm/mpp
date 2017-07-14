package labs.lab8.prob2;

import java.util.function.Supplier;

public class InnerRef {
	
	public static void main(String[] args) {
		
		InnerRef inner = new InnerRef();		
		RandomNumberGenerator random = inner.new RandomNumberGenerator();
				
		System.out.println("\n+++++++ Random number generation using inner class +++++++\n");
		System.out.println("\tRandom number 1: " + random.get());
		System.out.println("\tRandom number 2: " + random.get());
		System.out.println("\tRandom number 3: " + random.get());
		
		
	}

	public class RandomNumberGenerator implements Supplier<Double>{
		
		@Override
		public Double get() {
			return Math.random();
		}
		
	}
}
