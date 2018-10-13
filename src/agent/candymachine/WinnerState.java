package agent.candymachine;

public class WinnerState implements State {

	private transient CandyMachine mCandyMachine;

	public WinnerState(CandyMachine mCandyMachine) {
		this.mCandyMachine = mCandyMachine;
	}

	@Override
	public void insertCoin() {
		// TODO Auto-generated method stub
		System.out.println("please wait!we are giving you a candy!");

	}

	@Override
	public void returnCoin() {
		// TODO Auto-generated method stub
		System.out.println("you haven't inserted a coin yet!");

	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out
				.println("we are giving you a candy,turning another get nothing,!");

	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub

		
		mCandyMachine.releaseCandy();
		if (mCandyMachine.getCount() == 0) {
			mCandyMachine.setState(mCandyMachine.mSoldOutState);
		} else {
			System.out.println("you are a winner!you get another candy!");
			mCandyMachine.releaseCandy();
			if (mCandyMachine.getCount() > 0) {
				mCandyMachine.setState(mCandyMachine.mOnReadyState);
			} else {
				System.out.println("Oo,out of candies");
				mCandyMachine.setState(mCandyMachine.mSoldOutState);
			}
		}

	}

	@Override
	public void printstate() {
		// TODO Auto-generated method stub
		System.out.println("***WinnerState***");

	}
	@Override
	public String getstatename() {
		// TODO Auto-generated method stub
		return "WinnerState";
	}
}
