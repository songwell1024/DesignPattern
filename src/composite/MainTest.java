package composite;

public class MainTest {
	public static void main(String[] args) {
		Waitress mWaitress = new Waitress();
		CakeHouseMenu mCakeHouseMenu = new CakeHouseMenu();
		DinerMenu mDinerMenu = new DinerMenu();
		mWaitress.addComponent(mCakeHouseMenu);
		mWaitress.addComponent(mDinerMenu);
		mWaitress.printVegetableMenu();;
	}
}
