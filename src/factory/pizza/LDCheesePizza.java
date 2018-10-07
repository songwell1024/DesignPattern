package factory.pizza;

public class LDCheesePizza extends Pizza {

	@Override
	public void Prepare() {
		// TODO Auto-generated method stub
		super.setName("LDCheesePizza");
		
		System.out.println(name+" preparing;");
	}

}
