package labs.lab9.prob9;

import java.util.function.Predicate;

import labs.lab9.prob9.Dish.Type;

public class LambdaLibrary3 {
	
	
	final static Predicate<Dish> veg = dish -> dish.getType() == Type.OTHER;
	final static Predicate<Dish> lessCal = amount -> amount.getCalories() < 1000;
	final static Predicate<Dish> highCal = amount -> amount.getCalories() > 1000;
	
	
}
