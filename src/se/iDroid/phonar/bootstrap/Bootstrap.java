package se.iDroid.phonar.bootstrap;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import se.iDroid.phonar.communication.Communicator;
import se.iDroid.phonar.communication.PollThread;
import se.iDroid.phonar.model.Model;

public class Bootstrap {
	
	private Model model;

	public Bootstrap() {
		
		model = new Model();
		
		Communicator com = null;
		try {
			 com = new Communicator(new Socket("192.168.0.100", 13337), model);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//new PollThread(com).start();
	}
}
