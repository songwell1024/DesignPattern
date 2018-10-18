package visitor.mode;

public class CompensationVisitor implements Visitor {

	@Override
	public void Visit(Element element) {
		// TODO Auto-generated method stub
		Employee employee = ((Employee) element);

		System.out.println(employee.getName() + "'s Compensation is "
				+ (employee.getDegree() * employee.getVacationDays() * 10));
	}

}
