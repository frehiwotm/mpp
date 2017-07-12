package labs.lab7.prob3;

public interface FlyBehavior{
	
	public default void fly() {
		System.out.println("fly with wings");
	}

}
