package se.iDroid.phonar.model;

public class User {
	
	private String name;
	private double latitude;
	private double longitude;
	private double altitude;
	
	public User(String name, double latitude, double longitude, double altitude) {
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
		this.altitude = altitude;
	}
	
	public User(String name) {
		this.name = name;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}
	
	public double getAltitude() {
		return altitude;
	}
	
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}
	

}
