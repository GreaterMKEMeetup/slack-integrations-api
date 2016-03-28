package org.gmjm.slack.api.message;


/**
 * SlackMessageBuilder can be used to build up a complex, formatted slack message.
 *
 */
public interface SlackMessageBuilder
{
	SlackMessageBuilder setText(String text);

	SlackMessageBuilder setIconEmoji(String iconEmoji);

	SlackMessageBuilder setIconUrl(String iconUrl);

	SlackMessageBuilder setText(String text, boolean markdownEnabled);

	SlackMessageBuilder setChannel(String channelName);

	SlackMessageBuilder setUserAsChannel(String userName);

	SlackMessageBuilder addAttachment(AttachmentBuilder attachmentBuilder);

	SlackMessageBuilder setResponseType(String responseType);

	SlackMessageBuilder setUsername(String username);

	String build();
}
