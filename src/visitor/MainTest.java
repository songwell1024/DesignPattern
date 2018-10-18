package visitor;
import java.util.Random;

public class MainTest {
	public static void main(String[] args) {
		Employees mEmployees = new Employees();

		mEmployees.Attach(new Employee("Tom", 4500, 8, 1));
		mEmployees.Attach(new Employee("Jerry", 6500, 10, 2));
		mEmployees.Attach(new Employee("Jack", 9600, 12, 3));
		mEmployees.getCompensation();
	}

}
