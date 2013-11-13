package se.iDroid.phonar.bootstrap;

import java.net.DatagramSocket;
import java.net.SocketException;

import se.iDroid.phonar.communication.CommunicationMonitor;
import se.iDroid.phonar.communication.PollThread;
import se.iDroid.phonar.communication.SendThread;
import se.iDroid.phonar.model.Model;
import android.util.Log;

public class Bootstrap {
	
	private Model model;

	public Bootstrap() {
		DatagramSocket socket;
		try {
			Log.d("UDP", "hurray????");
			socket = new DatagramSocket();
			Log.d("UDP", "hurray!!!!");
			model = new Model();
			CommunicationMonitor comMon = new CommunicationMonitor(socket, model);
			SendThread sentThread = new SendThread(comMon);
			PollThread pollThread = new PollThread(comMon);
			sentThread.start();
			pollThread.start();
			comMon.sendHelloWorld();
		} catch (SocketException e) {
			e.printStackTrace();
		}
		
	}
}
