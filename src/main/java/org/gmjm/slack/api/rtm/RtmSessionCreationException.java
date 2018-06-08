package org.gmjm.slack.api.rtm;

/**
 * EXPERIMENTAL: This feature is still in development, and the interfaces may change upon official release.
 *
 *
 */
public class RtmSessionCreationException extends RuntimeException {

	private final ConnectionError connectionError;

	public RtmSessionCreationException(ConnectionError connectionError) {
		super(connectionError.getConnectionErrorType().code);
		this.connectionError = connectionError;
	}

	public RtmSessionCreationException(ConnectionError connectionError, Exception e) {
		super(connectionError.getConnectionErrorType().code, e);
		this.connectionError = connectionError;
	}

	public ConnectionError getConnectionError() {
		return connectionError;
	}

}
