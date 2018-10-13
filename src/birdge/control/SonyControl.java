package birdge.control;

public class SonyControl implements Control {

	@Override
	public void On() {
		// TODO Auto-generated method stub
		System.out.println("*Open Sony TV*");
	}

	@Override
	public void Off() {
		// TODO Auto-generated method stub
		System.out.println("*Off Sony TV*");
	}

	@Override
	public void setChannel(int ch) {
		// TODO Auto-generated method stub
		System.out.println("*The Sony TV Channel is setted "+ch+"*");
	}

	@Override
	public void setVolume(int vol) {
		// TODO Auto-generated method stub
		System.out.println("*The Sony TV Volume is setted "+vol+"*");
	}

}
