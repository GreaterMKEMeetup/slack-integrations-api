package org.gmjm.slack.api.command;

import java.util.Map;

public interface SlackCommandFactory {

	/**
	 *
	 * @param requestParameters the parameters recieved from the slack command.
	 * @return A SlackCommand object parsed from the requestParameters.
	 */
	SlackCommand create(Map<String, String> requestParameters);

}
