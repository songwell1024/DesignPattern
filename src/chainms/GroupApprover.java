package chainms;

public class GroupApprover extends Approver {

	public GroupApprover(String Name) {
		super(Name+" GroupLeader");
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void ProcessRequest(PurchaseRequest request) {
		// TODO Auto-generated method stub

		if (request.GetSum() < 5000) {
			System.out.println("**This request " + request.GetID()
					+ " will be handled by "
					+ this.Name + " **");
		} else {
			successor.ProcessRequest(request);
		}
	}

}
