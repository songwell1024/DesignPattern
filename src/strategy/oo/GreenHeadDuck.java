package strategy.oo;

import strategy.flybehavior.NoFlyBehavior;
import strategy.quackbehavior.NoQuackBehavior;

public class GreenHeadDuck extends Duck {

	@Override
	public void display() {
		System.out.println("**GreenHead**");
	}

	
	
	
	
	
	
	public void Fly() {
		System.out.println("~~no fly~~");
	}


}
