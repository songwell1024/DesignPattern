package visitor;

import java.util.HashMap;

public class Employees {
	private HashMap<String, Employee> employees;

	public Employees() {
		employees = new HashMap<String, Employee>();
	}

	public void Attach(Employee employee) {
		employees.put(employee.getName(), employee);
	}

	public void Detach(Employee employee) {
		employees.remove(employee);
	}

	public Employee getEmployee(String name) {
		return employees.get(name);
	}

	public void getCompensation() {
		for (Employee employee : employees.values()) {

			System.out
					.println(employee.getName()
							+ "'s Compensation is "
							+ (employee.getDegree()
									* employee.getVacationDays() * 100));

		}

	}
}
