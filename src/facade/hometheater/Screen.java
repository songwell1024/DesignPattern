package facade.hometheater;

public class Screen {



	private static Screen instance = null;

	private Screen() {

	}

	public static Screen getInstance() {
		if (instance == null) {
			instance = new Screen();
		}

		return instance;
	}
	
	public void up() {
		System.out.println("Screen  up");
	}

	public void down() {
		System.out.println("Screen  down");
	}

	
	
	
	

}
