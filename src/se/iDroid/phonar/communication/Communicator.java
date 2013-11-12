package se.iDroid.phonar.communication;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import se.iDroid.phonar.model.Model;

public class Communicator {

	private DataOutputStream dos;
	private DataInputStream dis;
	private Model model;

	public Communicator(Socket socket, Model model) {
		try {
			this.dos = new DataOutputStream(socket.getOutputStream());
			this.dis = new DataInputStream(socket.getInputStream());
			this.model = model;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void sendCoords() {
		try {
			dos.writeInt(Protocol.COM_UPDATE_COORD);
			dos.writeDouble(model.myLongitude());
			dos.writeDouble(model.myLatitude());
			dos.writeDouble(model.myAltitude());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void updateUserCoords() {
		try {
			dos.writeInt(Protocol.COM_GET_COORDS);
			dis.readInt();
			
		} catch (IOException e) {
			
		}
	}

}
