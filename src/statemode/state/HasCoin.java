package statemode.state;

import java.util.Random;

public class HasCoin implements State {
	private CandyMachine mCandyMachine;

	public HasCoin(CandyMachine mCandyMachine) {
		this.mCandyMachine = mCandyMachine;
	}

	@Override
	public void insertCoin() {
		// TODO Auto-generated method stub
		System.out.println("you can't insert another coin!");

	}

	@Override
	public void returnCoin() {
		// TODO Auto-generated method stub
		System.out.println("coin return!");
		mCandyMachine.setState(mCandyMachine.mOnReadyState);
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("crank turn...!");
		Random ranwinner=new Random();
		int winner=ranwinner.nextInt(10);
		if(winner==0)
		{
			mCandyMachine.setState(mCandyMachine.mWinnerState);

		}else
		{
			mCandyMachine.setState(mCandyMachine.mSoldState);

		}
		
	}

	@Override
	public void dispense() {
	}

	@Override
	public void printstate() {
		// TODO Auto-generated method stub
		System.out.println("***HasCoin***");

	}

}
