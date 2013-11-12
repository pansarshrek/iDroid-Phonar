package se.iDroid.phonar.communication;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class PollThread extends Thread {
	
	private Communicator com;
	
	public PollThread(Communicator com) {
		this.com = com;
	}
	
	public void run() {
		com.sendCoords();
		com.updateUserCoords();
		tick(100);
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
