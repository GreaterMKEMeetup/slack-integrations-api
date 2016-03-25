package org.gmjm.slack.api.model;

import java.util.Map;

public interface SlackCommand
{
	String getText();

	String getUserName();

	String getToken();

	String getUserId();

	String getMsgFriendlyUser();

	String getResponseUrl();

	Map<String,String> getAll();
}
