package se.iDroid.phonar.communication;

public class Protocol {
	
	public static final int COM_UPDATE_COORD = 0,
			COM_GET_COORDS = 1,
			COM_CREATE_GROUP = 2,
			COM_DISBAND_GROUP = 3,
			COM_ADD_USER = 4,
			COM_CREATE_USER = 5,
			ANS_SUCCESS = 6,		// ex: success to create group
			ANS_FAILURE = 7,		// ex: failed to create user
			ANS_GET_COORDS = 8;	

}
