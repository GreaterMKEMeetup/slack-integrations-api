package org.gmjm.slack.api.hook;

/**
 * Contains information on the status of the HookRequest once it's been submitted.
 */
public interface HookResponse
{
	enum Status {SUCCESS,FAILED}

	String getMessage();
	int getStatusCode();
	Status getStatus();
	Throwable getThrowable();
}
