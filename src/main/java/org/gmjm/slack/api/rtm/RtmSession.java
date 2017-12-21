package org.gmjm.slack.api.rtm;

public interface RtmSession {

	RtmSessionDetails getDetails();

	void send(String message) throws RtmSessionException;

	void registerConsumer(EventConsumer eventConsumer);

	void removeConsumer(EventConsumerID id);

}
