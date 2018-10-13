package birdge.bridge;


import birdge.control.Control;

public class TvControl extends TvControlabs {
	private  int ch=0;
	private  boolean ison=false;
	
	public TvControl(Control mControl)
	{
		super(mControl);
	}
	@Override
	public void Onoff() {
		// TODO Auto-generated method stub

		if(ison)
		{
			ison=false;
			mControl.Off();
		}else{
			ison=true;
			mControl.On();
		}
	
	}

	@Override
	public void nextChannel() {
		// TODO Auto-generated method stub

		ch++;
		mControl.setChannel(ch);
	
	}

	@Override
	public void preChannel() {
		// TODO Auto-generated method stub

		ch--;
		if(ch<0)
		{
			ch=200;
		}
		mControl.setChannel(ch);
	
	}

}
