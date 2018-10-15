package builder.builder;


import builder.vacation.Vacation;

public class BuilderSelf {
	public Vacation mVacation;

	public BuilderSelf(String std) {
		mVacation = new Vacation(std);
		// TODO Auto-generated constructor stub

	}

	public BuilderSelf addDay() {
		// TODO Auto-generated method stub

		mVacation.addDay();
		return this;
	}

	public BuilderSelf buildDay(int i) {
		// TODO Auto-generated method stub

		mVacation.setVacationDay(i);
		return this;
	}

	public BuilderSelf addHotel(String hotel) {
		// TODO Auto-generated method stub
		mVacation.setHotel(hotel);
		return this;
	}

	public BuilderSelf addTicket(String ticket) {
		// TODO Auto-generated method stub
		mVacation.addTicket(ticket);
		return this;
	}

	public BuilderSelf addEvent(String event) {
		// TODO Auto-generated method stub
		mVacation.addEvent(event);
		return this;
	}

	public Vacation getVacation() {

		return mVacation;

	}
}
