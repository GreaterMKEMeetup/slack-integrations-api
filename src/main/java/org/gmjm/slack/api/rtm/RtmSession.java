package org.gmjm.slack.api.rtm;

/**
 * EXPERIMENTAL: This feature is still in development, and the interfaces may change upon official release.
 *
 * The RtmSession interface
 *
 * @param <T> the type of the event contents.
 */
public interface RtmSession<T> {

	RtmSessionDetails getDetails();

	void send(String message) throws RtmSessionException;

	void registerConsumer(EventConsumer<T> eventConsumer);

	void removeConsumer(EventConsumerID id);

}
