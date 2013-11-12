package se.iDroid.phonar.model;

import java.util.ArrayList;

public class Model {
	
	private User me;
	private ArrayList<User> users;
	
	public Model() {
		users = new ArrayList<User>();
	}
	
	public Double myLongitude() {
		return me.getLongitude();
	}
	
	public Double myLatitude() {
		return me.getLatitude();
	}
	
	public Double myAltitude() {
		return me.getAltitude();
	}
	
	public void updateUserCoords(ArrayList<User> users) {
		this.users = users;
	}
	
	

}
