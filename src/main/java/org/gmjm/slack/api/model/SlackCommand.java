package org.gmjm.slack.api.model;

import java.util.Map;

public interface SlackCommand
{
	/**
	 *
	 * @return The text the user sent with the command.
	 */
	String getText();

	/**
	 *
	 * @return The name of the command
	 */
	String getCommand();

	/**
	 *
	 * @return The username of the user who initiated the command.
	 */
	String getUserName();

	/**
	 * The token configured in the slack command's settings.
	 * Can be used to verify if command came from a valid source.
	 *
	 * @return
	 */
	String getToken();

	/**
	 * The userId of the user who initiated the command.
	 *
	 * @return
	 */
	String getUserId();

	/**
	 * Returns a string formatted to display a linked username in a slack message.
	 * example:  username = stan, userId = 1234, return = <@1234|stan>
	 *
	 *
	 * @return
	 */
	String getMsgFriendlyUser();

	/**
	 * The url that Slack is expecting a response on.  If the web request that
	 * was initially received is not responded to within 3000 ms, use this.
	 *
	 * If you respond the the initial request with a blank body, and 200, the
	 * user who issued the command will not see a response.  If you do respond
	 * within 3000 ms, you can respond with the message as the body.  Else, use
	 * the URL returned from this method.
	 *
	 * @return
	 */
	String getResponseUrl();

	/**
	 *
	 * @return a map containing all incoming parameters.
	 */
	Map<String,String> getAll();
}
