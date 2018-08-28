package org.gmjm.slack.api.hook;

import java.util.concurrent.CompletableFuture;

/**
 * A simple interface to send a message, and recieve a response asyncronously.  These objects should be created
 * using an implementation of a HookRequestFactory.  An AsyncHookRequest is intended to
 * be thread safe, and can be reused any number of times.
 * <p>
 *     https://api.slack.com/incoming-webhooks
 * </p>
 */
public interface AsyncHookRequest {

  /**
   * Send a message using the underlying implementation of HookRequest.
   * No exceptions should escape this method, and should be captured in
   * the returned HookResponse.  Capturing all runtime exceptions will make processing a stream of
   * HookRequest and HookResponse objects safer.
   *
   * @param message The message to send
   * @return A Future HookResponse object.
   */
  CompletableFuture<HookResponse> send(String message);
}
