package birdge.control;

public class LGControl implements Control {

	@Override
	public void On() {
		// TODO Auto-generated method stub
		System.out.println("**Open LG TV**");
	}

	@Override
	public void Off() {
		// TODO Auto-generated method stub
		System.out.println("**Off LG TV**");
	}

	@Override
	public void setChannel(int ch) {
		// TODO Auto-generated method stub
		System.out.println("**The LG TV Channel is setted "+ch+"**");
	}

	@Override
	public void setVolume(int vol) {
		// TODO Auto-generated method stub
		System.out.println("**The LG TV Volume is setted "+vol+"**");
	}

}
