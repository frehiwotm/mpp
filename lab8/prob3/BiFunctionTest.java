package labs.lab8.prob3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionTest{
	
	public static void main(String[] args) {
		
		BiFunction<Double, Double, List<Double>> bi = (x, y) -> {
															List<Double> list = new ArrayList<>();
															list.add(Math.pow(x, y));
															list.add(x*y);
															return list;
												};
		List<Double> result = bi.apply(2.0, 3.0);
		result.forEach(System.out::println);
	}

}
