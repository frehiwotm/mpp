package labs.lab9.prob9;
import java.util.*;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Dish {

    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    public enum Type { MEAT, FISH, OTHER }

    @Override
    public String toString() {
        return name;
    }

    public static final List<Dish> menu =
            Arrays.asList( new Dish("pork", false, 800, Dish.Type.MEAT),
                           new Dish("beef", false, 700, Dish.Type.MEAT),
                           new Dish("chicken", false, 400, Dish.Type.MEAT),
                           new Dish("french fries", true, 530, Dish.Type.OTHER),
                           new Dish("rice", true, 350, Dish.Type.OTHER),
                           new Dish("season fruit", true, 120, Dish.Type.OTHER),
                           new Dish("pizza", true, 550, Dish.Type.OTHER),
                           new Dish("prawns", false, 400, Dish.Type.FISH),
                           new Dish("salmon", false, 450, Dish.Type.FISH));
    
    
    /*
     * Executes the request and returns boolean.  
     */ 
    public static boolean isThere(String quires){
    	
    	if(quires.equals("vegi")){ 
    		
    		return menu.stream().anyMatch(LambdaLibrary3.veg);
    	}
    	
    	if(quires.equals("healthy")){
    		
    		return menu.stream().anyMatch(LambdaLibrary3.lessCal);
    	}
    	
    	if(quires.equals("unhealthy")){
    		
    		return menu.stream().anyMatch(LambdaLibrary3.highCal);
    	}
    	return false;
    }
    
    /*
     * Returns the first item for the type MEAT.  
     */
    public static Optional<Dish> findFirstItem(){
    	
    	return menu.stream().filter(dish -> dish.getType() == Type.MEAT).findFirst();
    	
    }
    
    /*
     *   Calculates total calories of all meals in the menu: using Lambda.
     */
    public static int calculateTotalCalories(){
    	
    	return menu.stream().map(dish-> dish.getCalories()).reduce(0, (x, y) -> x + y);
    	
    }
    
    /*
     *  Calculates total calories of all meals in the menu: using method reference.
     */
    public static int calculateTotalCaloriesMethodReference() {
    	
//    	Supplier<Integer> totalCal = Dish::calculateTotalCalories;
//    	return totalCal.get();
    	
    	return menu.stream().map(Dish::getCalories).reduce(0, (x, y) -> x + y);
    }
    	
	public static void main(String[] args) {
		
		System.out.println("Is there any Vegetarian meal available: " + isThere("vegi"));
		System.out.println("Is there any healthy menu have calories less than 1000: " + isThere("healthy"));
		System.out.println("Is there any unhealthy menu have calories greater than 1000 : " + isThere("unhealthy"));
		
		Optional<Dish> meatDish = findFirstItem();
		System.out.println("First item for the type of MEAT in the menu is: " + meatDish.orElse(null)); 
		
		System.out.println("Total calories of all meals in the menu is: " + calculateTotalCaloriesMethodReference());		 
		
	}
}