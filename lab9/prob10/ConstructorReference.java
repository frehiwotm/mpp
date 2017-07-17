package labs.lab9.prob10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

@FunctionalInterface
interface TriFunction<T, S, U, R>{ 
	
	R apply(T t, S s, U u);
	
}

class Human
{
	String name;
	int age;
	String gender;
	
	public Human(String name){
		this.name = name;
	}
	public Human(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public Human(String name,int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}

public class ConstructorReference {
	
	public static void main(String args[]){
		
	Human[] list = { new Human("Joe",35,"Male"), new Human("Jane",45,"Female"), new Human("John",30,"Male"), new Human("Dana",25,"Female"),
			 		 new Human("Mina",18,"Female"),  new Human("Ana",31,"Female"),  new Human("Iris",35,"Female")};
	
	//Function<Human[], Stream<Human>> creatStream = a -> Arrays.stream(a);
	
    // Query 1  : Print only male canditates
	
	System.out.println("\n##### Male canditates #####\n");
	Arrays.stream(list).filter(p -> p.getGender().equals("Male"))
			        .forEach(System.out::println);
	
    // Query 2  : add some more objects to the list, and print the count of female candidates whose age is greater than 30 
	
	System.out.println("\n##### female canditates #####\n");
	Arrays.stream(list).filter(p -> p.getGender().equals("Female")&&p.getAge() > 30)
			  .forEach(System.out::println);
	
    // Query 3 : Practice for method reference Classname::new - Create an object by choosing suitable Interface to 
	//	the specified constructors(Totally 3 constructors) and print the object status
	
	System.out.println("\n##### Create an object using Function Interface #####\n");
	Function<String, Human> creatInsfun = Human::new;
	Human p1 = creatInsfun.apply("Lewi");
	System.out.println(p1);
		
	System.out.println("\n##### Create an object using Bifunction Interface #####\n");
	BiFunction<String, Integer, Human> creatInsBi = Human::new;
	Human p2 = creatInsBi.apply("Lewi", 1);
	System.out.println(p2);
		
	System.out.println("\n##### Create an object using TriFunction Interface #####\n");
	TriFunction<String, Integer, String, Human> creatInsTri = Human::new;
	Human p3 = creatInsTri.apply("Lewi", 1, "Male");
	System.out.println(p3);
	
 // Query 4 : convert your Human array into ArrayList of Human by creating a static method, decide your arguments and return type   
	
    List<Human> col1 = arrayToCollection(list);
    System.out.println("\n##### ArrayList of Human array #####\n");
    System.out.println(col1);
    
   }

// Implement the body for Query 4
	public static List<Human> arrayToCollection(Human[] humans){

		return Arrays.asList(humans);
	       	
	}

}
