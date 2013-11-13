package se.iDroid.phonar.communication;

import java.net.DatagramSocket;
import java.util.LinkedList;
import java.util.Queue;

import se.iDroid.phonar.model.Model;

public class CommunicationMonitor {
	
	private static CommunicationMonitor instance;
	private Model model;
	private DatagramSocket socket;
	
	private Queue<SendTask> tasks;

	public CommunicationMonitor(DatagramSocket socket, Model model) {
		tasks = new LinkedList<SendTask>();
		this.model = model;
		this.socket = socket;
	}
	
	public synchronized void sendPendingTasks() {
		while (tasks.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		while (!tasks.isEmpty()) {
			SendTask task = tasks.poll();
			task.execute(socket);
		}
	}
	
	public synchronized void sendHelloWorld() {
		tasks.add(new HelloWorldTask());
		notifyAll();
	}

	public synchronized void sendCoords() {
//		tasks.add(new SendCoordsTask());
		notifyAll();
	}
	
	public synchronized void updateUserCoords() {
		notifyAll();
	}
	
	public synchronized void sendCreateGroupCommand() {
		notifyAll();
	}
	
	public synchronized void sendLeaveGroupCommand() {
		notifyAll();
	}
	
}
