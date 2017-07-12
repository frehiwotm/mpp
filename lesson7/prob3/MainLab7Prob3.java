package mains;

import labs.lab7.prob3.DecoyDuck;
import labs.lab7.prob3.Duck;
import labs.lab7.prob3.MallardDuck;
import labs.lab7.prob3.RubberDuck;
import labs.lab7.prob3.RedheadDuck;


public class MainLab7Prob3 {

	public static void main(String[] args) {
		Duck[] ducks = {new MallardDuck(), new DecoyDuck(), new RedheadDuck(), new RubberDuck()};
		for(Duck d: ducks) {
			System.out.println(d.getClass().getSimpleName() + ":");
			System.out.print("  ");
			d.display();
			System.out.print("  ");
			d.fly();
			System.out.print("  ");
			d.quack();
			System.out.print("  ");
			d.swim();
		}

	}

}
