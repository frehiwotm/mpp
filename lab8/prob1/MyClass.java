package labs.lab8.prob1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MyClass {
	private Integer x;
	private Integer y;
	
	public MyClass(){
		
	}
	
	public MyClass(Integer x, Integer y) {
		this.x = x;
		this.y = y;
	}


	public Integer getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public boolean myMethod(MyClass cl) {
		
		Predicate<MyClass> isEqual = this::equals;
		return isEqual.test(cl);
	}
	
	public boolean equals(Object obj) {
		
		if(this == obj) return true;
		if(obj == null) return false;
		if(this.getClass().getName() != obj.getClass().getName()) return false;
		MyClass other = (MyClass) obj;
		
		return this.getX().equals(other.getX()) && this.getY().equals(other.getY());
		
	}
	
	public static void main(String[] args) {
		
		List<MyClass> myList = Arrays.asList(new MyClass(2,5), new MyClass(3,4), new MyClass(2,5), new MyClass(5,5));
		
		for(MyClass list:myList) {
				System.out.println(myList.get(0).myMethod(list));
				
		}
		
		
	}

	
}