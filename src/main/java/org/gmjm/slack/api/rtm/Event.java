package org.gmjm.slack.api.rtm;

/**
 * EXPERIMENTAL: This feature is still in development, and the interfaces may change upon official release.
 *
 * An Event is an object that represents a message received from the RTM API.
 * The EventType describes the type of event, and the payload is dependent on
 * the implementation provided by the core library, or any custom extensions.
 *
 * @param <T> the type of the event contents.
 */
public interface Event<T> {
	EventType getEventType();
	T getPayload();
}
