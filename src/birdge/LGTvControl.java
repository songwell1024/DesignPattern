package birdge;


import birdge.control.LGControl;

public class LGTvControl extends LGControl implements TvControl{
	private static int ch=0;
	private static boolean ison=false;
	public void Onoff()
	{
		if(ison)
		{
			ison=false;
			super.Off();
		}else{
			ison=true;
			super.On();
		}
	}
	public void nextChannel()
	{
		ch++;
		super.setChannel(ch);
	}
	public void preChannel()
	{
		ch--;
		if(ch<0)
		{
			ch=200;
		}
		super.setChannel(ch);
	}

}
