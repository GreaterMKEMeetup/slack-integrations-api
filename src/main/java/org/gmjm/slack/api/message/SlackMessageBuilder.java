package org.gmjm.slack.api.message;


/**
 * SlackMessageBuilder can be used to build up a complex, formatted slack message.
 *
 */
public interface SlackMessageBuilder
{
	/**
	 * Set message text.  <i>markdownEnabled</i> is defaulted to true.
	 */
	SlackMessageBuilder setText(String text);

	/**
	 * Set the name of the emoji to display.  
	 * 
	 * example "coffee"
	 * 
	 */
	SlackMessageBuilder setIconEmoji(String iconEmoji);


	/**
	 * Set the URL of an icon to use.  This can override the default icon used
	 * to setup the integration in some cases.
	 * 
	 */
	SlackMessageBuilder setIconUrl(String iconUrl);

	/**
	 * Set the message text, and specify if markdown is enabled.
	 */
	SlackMessageBuilder setText(String text, boolean markdownEnabled);

	/**
	 * Set the name of the channel this message should appear in.
	 * Cannot include some special characters, and must be 21 characters or less.
	 */
	SlackMessageBuilder setChannel(String channelName);

	/**
	 * Allows for a user to be set as a channel, to "PM" a particular user.
	 */
	SlackMessageBuilder setUserAsChannel(String userName);

	/**
	 * Add an attachment to the message.  The AttachmentBuilder must have been created from
	 * the same SlackMessageFactory to ensure compatibility.
	 */
	SlackMessageBuilder addAttachment(AttachmentBuilder attachmentBuilder);

	/**
	 * When responding to a Slack command, use <i>ephemeral</i> to respond only the the 
	 * user who initiated the command.  Use <i>in_channel</i> to respond to the entire
	 * channel where the command was initiated.
	 */
	SlackMessageBuilder setResponseType(String responseType);

	/**
	 * Set the username of the message.  This can override the default incoming webhook
	 * username and icon defaults, but cannot override command defaults.
	 */
	SlackMessageBuilder setUsername(String username);

	/**
	 * Build to String.  Type (plain, JSON, ...) is determined by the SlackMessageFactory
	 * implementation used.
	 */
	String build();
}
