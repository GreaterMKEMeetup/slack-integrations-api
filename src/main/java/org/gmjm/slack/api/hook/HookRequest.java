package org.gmjm.slack.api.hook;

/**
 * A simple interface to send a message.  These objects should be created
 * using an implementation of a HookRequestFactory.  A HookRequest is intended to
 * be thread safe, and can be reused any number of times.
 * <p>
 *     https://api.slack.com/incoming-webhooks
 * </p>
 */
public interface HookRequest {

	/**
	 * Send a message using the underlying implementation of HookRequest.
	 * No exceptions should escape this method, and should be captured in
	 * the returned HookResponse.  Capturing all runtime exceptions will make processing a stream of
	 * HookRequest and HookResponse objects safer.
	 *
	 * @param message The message to send
	 * @return A HookResponse object.
	 */
	HookResponse send(String message);
}
