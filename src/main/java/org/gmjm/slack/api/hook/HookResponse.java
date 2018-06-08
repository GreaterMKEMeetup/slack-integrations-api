package org.gmjm.slack.api.hook;

/**
 * Contains information on the status of the HookRequest once it's been submitted.
 * A HookResponse object is intended to be thread safe, and immutable.
 */
public interface HookResponse {

	/**
	 * Returns the URL the message was sent to.
	 *
	 * @return the URL the message was sent to.
	 */
	String getWebhookUrl();

	/**
	 * Returns the message sent by the HookRequest
	 *
	 * @return the message sent by the HookRequest
	 */
	String getSentMessage();

	/**
	 * Implementations should never return null.
	 *
	 * @return a success or error message.
	 */
	String getReceivedMessage();

	/**
	 * Implementations should never return null.
	 *
	 * Deprecated: Use getReceivedMessage()
	 * @return a success or error message.
	 */
	@Deprecated
	String getMessage();

	/**
	 * @return The HTTP status code of the response.
	 */
	int getStatusCode();

	/**
	 * Implementations should never return null.
	 *
	 * @return a Status enumeration denoting if the request was successful.
	 */
	Status getStatus();

	/**
	 * Should return null in most cases.
	 *
	 * @return null if no exception captured, throwable if an exception occurred.
	 */
	Throwable getThrowable();

	enum Status {
		SUCCESS, // Message was recieved successfully
		FAILED   // Message was not successfully recieved
	}
}
