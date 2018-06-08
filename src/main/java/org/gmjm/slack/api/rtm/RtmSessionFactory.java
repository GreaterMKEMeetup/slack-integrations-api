package org.gmjm.slack.api.rtm;

/**
 * EXPERIMENTAL: This feature is still in development, and the interfaces may change upon official release.
 *
 * A factory to create new RTM sessions.
 */
public interface RtmSessionFactory {

	/**
	 * Request a new RTM session. Session must be connected to within 30 seconds or the URI will be invalidated.
	 * The URI can only be used to connect to the session once.
	 * @return RtmSessionDetails if session is created.
	 * @throws RtmSessionCreationException if session is not created.
	 */
	RtmSession createSession() throws RtmSessionCreationException;
}
