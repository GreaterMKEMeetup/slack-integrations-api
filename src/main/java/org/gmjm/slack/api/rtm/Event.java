package org.gmjm.slack.api.rtm;

public interface Event<T> {
	EventType getEventType();
	T getPayload();
}
