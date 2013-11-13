package se.iDroid.phonar.communicationtasks;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;

import se.iDroid.phonar.communication.Protocol;
import se.iDroid.phonar.model.Model;

public class SendCoordsTask extends SendTask{
	
	private Model model;
	
	public SendCoordsTask(Model model) {
		this.model = model;
	}

	@Override
	public DatagramPacket createPacket() {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(bos);
		
		try {
			dos.writeInt(Protocol.COM_UPDATE_COORDS);
			dos.writeUTF(model.myName());
			dos.writeDouble(model.myLatitude());
			dos.writeDouble(model.myLongitude());
			dos.writeDouble(model.myAltitude());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		byte[] buffer = bos.toByteArray();
		
		DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
		
		return packet;
		
	}

}
