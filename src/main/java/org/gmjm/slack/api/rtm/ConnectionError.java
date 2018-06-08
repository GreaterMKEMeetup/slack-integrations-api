package org.gmjm.slack.api.rtm;

/**
 * EXPERIMENTAL: This feature is still in development, and the interfaces may change upon official release.
 *
 * A wrapper class for RTM connection errors.
 */
public interface ConnectionError {

	/**
	 * Returns the specific error encountered when attemting to connect to the RTM API.
	 *
	 * @return the type of error.
	 */
	ConnectionErrorType getConnectionErrorType();

}
