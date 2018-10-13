package agent.candymachine;

public class OnReadyState implements State {
	private transient CandyMachine mCandyMachine;
	public OnReadyState(CandyMachine mCandyMachine)
	{
		this.mCandyMachine=mCandyMachine;
	}

	@Override
	public void insertCoin() {
		// TODO Auto-generated method stub
		System.out
		.println("you have inserted a coin,next,please turn crank!");
		mCandyMachine.setState(mCandyMachine.mHasCoin);
	}

	@Override
	public void returnCoin() {
		// TODO Auto-generated method stub
		System.out.println("you haven't inserted a coin yet!");
		
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("you turned,but you haven't inserted a coin!");
		
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printstate() {
		// TODO Auto-generated method stub
		System.out.println("***OnReadyState***");
		
	}
	@Override
	public String getstatename() {
		// TODO Auto-generated method stub
		return "OnReadyState";
	}
}
