package labs.lab9.prob7b;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class LambdaLibray {
	
	final static BiFunction<List<Employee>, Character, String> empFilterBySalary = (employees, filterChar) ->
																  employees.stream()
														         .filter(e -> e.getSalary() > 100000 && (e.getLastName().charAt(0) > filterChar))
														         .map(e -> e.getFirstName() + " " + e.getLastName())
														         .sorted()
														         .collect(Collectors.joining(", "));

}
