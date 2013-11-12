package se.iDroid.phonar.bootstrap;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.ExecutionException;

import se.iDroid.phonar.communication.CommunicationMonitor;
import se.iDroid.phonar.model.Model;
import android.util.Log;

public class Bootstrap {
	
	private Model model;

	public Bootstrap() {
		new ConnectSocketTask().execute();
	}
}
