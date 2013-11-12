package se.iDroid.phonar.bootstrap;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import se.iDroid.phonar.communication.CommunicationMonitor;
import se.iDroid.phonar.model.Model;
import android.util.Log;

public class Bootstrap {
	
	private Model model;

	public Bootstrap() {
		
		model = new Model();
		
		CommunicationMonitor com = null;
		try {
			Log.d("hej", "Connecting");
			 com = new CommunicationMonitor(new Socket("192.168.0.100", 13337), model);
			 Log.d("hej", "Connected");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		} catch (Exception e) {
			 Log.d("hej", e.toString());
		}


		
		//new PollThread(com).start();
	}
}
