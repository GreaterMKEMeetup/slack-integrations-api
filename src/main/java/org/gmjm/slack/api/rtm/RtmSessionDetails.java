package org.gmjm.slack.api.rtm;

import java.net.URI;

/**
 * Details needed to connect to a RTM session.
 */
public interface RtmSessionDetails {

	/**
	 * Details about the session's user.
	 * @return Details about the session's user.
	 */
	Self getSelf();

	/**
	 * Details about the session's team.
	 * @return Details about the session's team.
	 */
	Team getTeam();

	/**
	 * The URI needed to connect to the RTM session.  Must be connected to
	 * within 30 seconds, or it will become invalid.  This URI can only be
	 * used to connect to the session once.
	 * @return The URI needed to connect to the RTM session.
	 */
	URI getUri();
}
