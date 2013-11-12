package se.iDroid.phonar.communication;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class PollThread extends Thread {

	private CommunicationMonitor com;

	public PollThread(CommunicationMonitor com) {
		this.com = com;
	}

	public void run() {
		while (true) {
			com.sendCoords();
			com.updateUserCoords();
			tick(100);
		}
	}

	public void tick(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
