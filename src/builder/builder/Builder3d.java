package builder.builder;

public class Builder3d extends AbsBuilder {

	public Builder3d(String std) {
		super(std);
		// TODO Auto-generated constructor stub

	}

	@Override
	public void buildDay(int i) {
		// TODO Auto-generated method stub

		mVacation.setVacationDay(i);

	}

	@Override
	public void addHotel(String hotel) {
		// TODO Auto-generated method stub
		mVacation.setHotel(hotel);
	}

	@Override
	public void addTicket(String ticket) {
		// TODO Auto-generated method stub
		mVacation.addTicket(ticket);
	}

	@Override
	public void addEvent(String event) {
		// TODO Auto-generated method stub
		mVacation.addEvent(event);
	}

	@Override
	public void buildvacation() {
		// TODO Auto-generated method stub
		addTicket("Plane Ticket");
		addEvent("Fly to Destination");
		addEvent("Supper");
		addEvent("Dancing");
		addHotel("Four Seasons");

		mVacation.addDay();
		addTicket("Theme Park");
		addEvent("Bus to Park");
		addEvent("lunch");
		addHotel("Four Seasons");

		mVacation.addDay();

		addTicket("Plane Ticket");
		addEvent("City Tour");
		addEvent("Fly to Home");

	}

}
