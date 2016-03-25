package org.gmjm.slack.api.hook;

public interface HookRequest
{
	HookResponse submitMessage(String string);
}
