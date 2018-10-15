package builder.builder;


public class Builder4d extends AbsBuilder {

	public Builder4d(String std) {
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
		addHotel("Hilton");

		mVacation.addDay();
		addTicket("Zoo Ticket");
		addEvent("Bus to Zoo");
		addEvent("Feed animals");
		addHotel("Hilton");

		mVacation.addDay();
		addTicket("Beach");
		addEvent("Swimming");
		addHotel("Home inn");

		mVacation.addDay();
		addTicket("Plane Ticket");
		addEvent("Fly to Home");
	}

}
