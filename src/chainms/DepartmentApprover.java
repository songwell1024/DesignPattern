package chainms;

public class DepartmentApprover extends Approver {

	public DepartmentApprover(String Name) {
		super(Name + " DepartmentLeader");

	}

	@Override
	public void ProcessRequest(PurchaseRequest request) {
		// TODO Auto-generated method stub

		if ((5000 <= request.GetSum()) && (request.GetSum() < 10000)) {
			System.out.println("**This request " + request.GetID()
					+ " will be handled by " + this.Name + " **");
		} else {
			successor.ProcessRequest(request);
		}

	}

}
