package birdge.control;

public class SharpControl implements Control {

	@Override
	public void On() {
		// TODO Auto-generated method stub
		System.out.println("***Open Sharp TV***");
	}

	@Override
	public void Off() {
		// TODO Auto-generated method stub
		System.out.println("***Off Sharp TV***");
	}

	@Override
	public void setChannel(int ch) {
		// TODO Auto-generated method stub
		System.out.println("***The Sharp TV Channel is setted "+ch+"***");
	}

	@Override
	public void setVolume(int vol) {
		// TODO Auto-generated method stub
		System.out.println("***The Sharp TV Volume is setted "+vol+"***");
	}

}
