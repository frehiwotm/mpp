package labs.lab7.prob3;

public interface QuackBehavior {
	public default void quack() {
		System.out.println("quacking");
	}

}
