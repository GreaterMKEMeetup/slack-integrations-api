package org.gmjm.slack.api.rtm;

/**
 * EXPERIMENTAL: This feature is still in development, and the interfaces may change upon official release.
 *
 *
 */
public class RtmSessionException extends RuntimeException {

	public RtmSessionException(String message) {
		super(message);
	}

	public RtmSessionException(String message, Exception e) {
		super(message, e);
	}
}
