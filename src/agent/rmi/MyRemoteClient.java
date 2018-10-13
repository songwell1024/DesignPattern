package agent.rmi;

import java.rmi.Naming;

public class MyRemoteClient {
	public static void main(String[] args) {
		
		new MyRemoteClient().go();
	}
	
	public void go()
	{
		try {
			MyRemote service=(MyRemote)Naming.lookup("rmi://127.0.0.1:6600/RemoteHello");
			String s=service.sayHello();
			System.out.println(s);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
