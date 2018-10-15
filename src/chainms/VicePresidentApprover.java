package chainms;

public class VicePresidentApprover extends Approver {

	public VicePresidentApprover(String Name) {
		super(Name + " Vice President");
	}

	@Override
	public void ProcessRequest(PurchaseRequest request) {
		// TODO Auto-generated method stub
		if ((10000 <= request.GetSum()) && (request.GetSum() < 50000)) {
			System.out.println("**This request " + request.GetID()
					+ " will be handled by " + this.Name + " **");
		} else {
			successor.ProcessRequest(request);
		}
	}

}
