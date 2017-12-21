package org.gmjm.slack.api.rtm;

/**
 * The Self object contains a small amount of information concerning the connecting user.
 * https://api.slack.com/methods/rtm.connect
 */
public interface Self {

	/**
	 * The ID of the connecting user.
	 * @return ID of the connecting user.
	 */
	String getId();

	/**
	 * The name of the connecting user.
	 * @return Name of the connecting user.
	 */
	String getName();

}
