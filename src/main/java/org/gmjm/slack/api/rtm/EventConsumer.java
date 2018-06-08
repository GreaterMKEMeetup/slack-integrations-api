package org.gmjm.slack.api.rtm;

/**
 * EXPERIMENTAL: This feature is still in development, and the interfaces may change upon official release.
 *
 * An event consumer is a basic interface for consuming events received from an RtmSession.
 *
 * @param <T> the type of the Event contents.
 */
public interface EventConsumer<T> {

	/**
	 * The ID of the consumer.  This allows for targeted removal of consumers.
	 *
	 * @return the ID of the consumer.
	 */
	EventConsumerID getId();

	/**
	 * This method is invoked when an Event is received from an RtmSession.
	 *
	 * @param event the received event
	 */
	void consume(Event<T> event);

}
