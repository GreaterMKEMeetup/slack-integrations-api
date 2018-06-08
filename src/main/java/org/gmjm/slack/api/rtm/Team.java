package org.gmjm.slack.api.rtm;

/**
 * EXPERIMENTAL: This feature is still in development, and the interfaces may change upon official release.
 *
 * The Team object houses brief information about the connecting user's team.
 * https://api.slack.com/methods/rtm.connect
 */
public interface Team {

	/**
	 * The Domain of the connecting Team.
	 * @return The Domain of the connecting Team.
	 */
	String getDomain();

	/**
	 * The ID of the Team.
	 * @return The ID of the Team.
	 */
	String getId();

	/**
	 * The EnterpriseId of the Team if it is part of an EnterpriseGrid
	 * @return The EnterpriseID of the team.
	 */
	String getEnterpriseId();

	/**
	 * The Name of the Team.
	 * @return The Name of the Team.
	 */
	String getName();
}
