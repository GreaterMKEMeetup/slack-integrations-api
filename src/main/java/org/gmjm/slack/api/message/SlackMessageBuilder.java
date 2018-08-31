package org.gmjm.slack.api.message;

/**
 * SlackMessageBuilder can be used to build up a complex, formatted slack message.
 * <p>
 *     https://api.slack.com/docs/formatting
 * </p>
 */
public interface SlackMessageBuilder {

	/**
	 * Set the text of the message.  Markdown enabled by default.
	 *
	 * @param text The text of the message.
	 * @return this
	 */
	SlackMessageBuilder setText(String text);

	/**
	 * Specify an emoji as an icon.
	 *
	 * @param iconEmoji The name of the emoji to set as the user icon.
	 * @return this
	 */
	SlackMessageBuilder setIconEmoji(String iconEmoji);

	/**
	 * Specify a URL to use as an icon. Any publicly reachable resource will work.
	 *
	 * @param iconUrl A URL to an image resource to set as the user icon.
	 * @return this
	 */
	SlackMessageBuilder setIconUrl(String iconUrl);

	/**
	 * Set the text of the message.
	 * Specify if markdown is enabled.
	 *
	 * @param text            - The text of the message.
	 * @param markdownEnabled - Should message text be parsed as markdown.
	 * @return this
	 */
	SlackMessageBuilder setText(String text, boolean markdownEnabled);

	/**
	 * Set the channelId the message should be sent to.
	 * <p>
	 * (Will override setChannel and setUserAsChannel)
	 *
	 * @param channelId The ID of the channel.
	 * @return this
	 */
	SlackMessageBuilder setChannelId(String channelId);

	/**
	 * Set the channelName the message should be sent to.
	 * <p>
	 * (Will override setChannelId and setUserAsChannel)
	 *
	 * @param channelName The name of the channel.
	 * @return this
	 */
	SlackMessageBuilder setChannel(String channelName);

	/**
	 * Set the userName (PM) the message should be sent to.
	 * <p>
	 * (Will override setChannel and setChannelId)
	 *
	 * @param userName The recipient username.
	 * @return this
	 */
	SlackMessageBuilder setUserAsChannel(String userName);

	/**
	 * Add an attachment to this message.
	 *
	 * @param attachmentBuilder The attachment builder to include.
	 * @return this
	 */
	SlackMessageBuilder addAttachment(AttachmentBuilder attachmentBuilder);

	/**
	 * Set the response type.  If responding directly to a request, or to
	 * URL obtained from slackCommand.getResponseUrl(), you can specify the following:
	 * <p>
	 * ephemeral -  This will respond so only the user who issued the command can see the message.
	 * <p>
	 * in_channel - This will respond to the entire channel the command was issued in.
	 *
	 * @param responseType The response type.
	 * @return this
	 */
	SlackMessageBuilder setResponseType(String responseType);

	/**
	 * Set the username that should appear on the message.
	 *
	 * @param username The username that should appear on the message.
	 * @return this
	 */
	SlackMessageBuilder setUsername(String username);

	/**
	 *
	 * Used only when creating messages in response to a button action invocation. When set to true,
	 * the inciting message will be replaced by this message you're providing. When false, the message
	 * you're providing is considered a brand new message.
	 *
	 * @param replaceOriginal Should original message be replaced.
	 * @return this
	 */
	SlackMessageBuilder replaceOriginal(boolean replaceOriginal);

	/**
	 *
	 * Used only when creating messages in response to a button action invocation. When set to true,
	 * the inciting message will be deleted and if a message is provided, it will be posted as a brand
	 * new message.
	 *
	 * @param deleteOriginal Should original message be deleted.
	 * @return this
	 */
	SlackMessageBuilder deleteOriginal(String deleteOriginal);

	/**
	 * Sets an arbitrary key, value pair on the message.
	 *
	 * This should only be used in cases where the API has not been updated to
	 * support a new feature.  Try to avoid using this.
	 *
	 * @param key The key of the attribute that will be added to the message.
	 * @param value The value of the attribute that will be added to the message.
	 * @return this
	 */
	SlackMessageBuilder setAttribute(String key, String value);

	/**
	 * Build up the current message into a String.
	 *
	 * @return The current message as a String formatted for Slack.
	 */
	String build();
}
