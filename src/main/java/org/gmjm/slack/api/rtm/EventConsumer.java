package org.gmjm.slack.api.rtm;

public interface EventConsumer {

	EventConsumerID getId();

	void consume(Event event);

}
