package org.gmjm.slack.api.rtm;

public interface EventConsumer<T> {

	EventConsumerID getId();

	void consume(Event<T> event);

}
