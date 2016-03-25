package org.gmjm.slack.api.hook;

public interface HookResponse
{
	enum Status {SUCCESS,FAILED}

	String getMessage();
	int getStatusCode();
	Status getStatus();
	Throwable getThrowable();
}
