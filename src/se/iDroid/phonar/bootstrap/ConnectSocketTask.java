package se.iDroid.phonar.bootstrap;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import android.os.AsyncTask;

public class ConnectSocketTask extends AsyncTask<Void, Void, Socket>{
	
	

	@Override
	protected Socket doInBackground(Void... arg0) {
		Socket socket = null;
		try {
			socket = new Socket("192.168.0.100", 13337);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return socket;
	}

}
