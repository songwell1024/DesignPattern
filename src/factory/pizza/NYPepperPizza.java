package factory.pizza;

public class NYPepperPizza extends Pizza {

	@Override
	public void Prepare() {
		// TODO Auto-generated method stub
		super.setName("NYPepperPizza");
		
		System.out.println(name+" preparing;");
	}

}
