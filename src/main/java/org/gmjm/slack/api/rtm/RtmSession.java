package org.gmjm.slack.api.rtm;

public interface RtmSession<T> {

	RtmSessionDetails getDetails();

	void send(String message) throws RtmSessionException;

	void registerConsumer(EventConsumer<T> eventConsumer);

	void removeConsumer(EventConsumerID id);

}
