package org.gmjm.slack.api.command;

public interface SlackCommandFactory<T> {

	/**
	 *
	 * @param commandObject the object received from the slack command.
	 * @return A SlackCommand object parsed from the requestParameters.
	 */
	SlackCommand create(T commandObject);

}
