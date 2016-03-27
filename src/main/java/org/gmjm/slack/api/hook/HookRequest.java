package org.gmjm.slack.api.hook;

/**
 * Sends a POST message to the <i>recipientUrl</i>.
 *
 */
public interface HookRequest
{
	HookResponse send(String recipientUrl);
}
