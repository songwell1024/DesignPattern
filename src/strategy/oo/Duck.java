package strategy.oo;

import strategy.flybehavior.NoFlyBehavior;
import strategy.quackbehavior.NoQuackBehavior;

public abstract class Duck {

	public Duck() {
	}

	public void Quack() {
		System.out.println("~~gaga~~");
	}

	public abstract void display();

	public void swim() {
		System.out.println("~~im swim~~");
	}
	
	
	
	
	public void Fly() {
			System.out.println("~~im fly~~");
		}

}
