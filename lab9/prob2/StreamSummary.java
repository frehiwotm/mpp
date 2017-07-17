package labs.lab9.prob2;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class StreamSummary {
	
	public static void main(String[] args) {
		/*
		 * Statistical information for the stream of int data type, for example max and min value of the stream. 
		 */
		IntStream intStream = IntStream.range(1, 15);
		IntSummaryStatistics myIntSummary = intStream.summaryStatistics();
		
		System.out.println("\n##### Statistical information #####\n");
		System.out.println("\tMaximum value : " + myIntSummary.getMax());
		System.out.println("\tMinimum value : " + myIntSummary.getMin());
	}

}
