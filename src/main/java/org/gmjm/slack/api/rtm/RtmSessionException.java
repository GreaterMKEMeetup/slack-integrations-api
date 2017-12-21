package org.gmjm.slack.api.rtm;

public class RtmSessionException extends RuntimeException {

	public RtmSessionException(String message) {
		super(message);
	}

	public RtmSessionException(String message, Exception e) {
		super(message, e);
	}
}
