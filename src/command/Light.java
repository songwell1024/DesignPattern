package command;

public class Light {

	String loc = "";

	public Light(String loc) {
		this.loc = loc;
	}

	public void On() {

		System.out.println(loc + " On");
	}

	public void Off() {

		System.out.println(loc + " Off");
	}

}
