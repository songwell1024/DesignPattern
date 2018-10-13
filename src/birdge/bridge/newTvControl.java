package birdge.bridge;

import birdge.control.Control;

public class newTvControl extends TvControlabs {
	private  int ch=0;
	private  boolean ison=false;
	private int prech=0;
	public newTvControl(Control mControl) {
		super(mControl);
		// TODO Auto-generated constructor stub
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
		prech=ch;
		ch++;
		mControl.setChannel(ch);
	
	}

	@Override
	public void preChannel() {
		// TODO Auto-generated method stub
		prech=ch;
		ch--;
		if(ch<0)
		{
			ch=200;
		}
		mControl.setChannel(ch);
	
	}

	
	public void  setChannel(int nch)
	{
		prech=ch;
		ch=nch;
		mControl.setChannel(ch);
		
	}
	public void   Back()
	{
		mControl.setChannel(prech);
	}
}
