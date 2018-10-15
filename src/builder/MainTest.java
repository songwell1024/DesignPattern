package builder;


import builder.builder.Builder3d;
import builder.builder.Builder4d;
import builder.builder.BuilderSelf;

public class MainTest {

	public static void main(String[] args) {

		Director mDirector = new Director(new Builder4d("2015-12-29"));

		mDirector.construct();

		mDirector.setBuilder(new Builder3d("2015-8-30"));
		mDirector.construct();
		testself() ;
	}

	public static void testself() {
		BuilderSelf builder = new BuilderSelf("2015-9-29");

		builder.addTicket("Plane Ticket").addEvent("Fly to Destination")
				.addEvent("Supper").addHotel("Hilton");

		builder.addDay().addTicket("Zoo Ticket").addEvent("Bus to Zoo")
				.addEvent("Feed animals").addHotel("Home Inn");

		builder.addDay();
		builder.addTicket("Beach");
		builder.addEvent("Swimming");
		builder.addHotel("Home inn");

		builder.addDay().addTicket("Plane Ticket").addEvent("Fly to Home");
		builder.getVacation().showInfo();
	}

}
