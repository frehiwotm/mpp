package labs.lab7.prob3;

public abstract class Duck implements FlyBehavior, QuackBehavior {

	public void swim(){
		System.out.println("swimming");
	}
	
	public abstract void display();
	


}
