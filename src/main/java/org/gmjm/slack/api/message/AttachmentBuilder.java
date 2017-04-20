package org.gmjm.slack.api.message;

/**
 * AttachementBuilder is used to build up a complex, formatted attachment
 * for inclusion in a SlackMessageBuilder.
 * <p>
 * https://api.slack.com/docs/attachments
 */
public interface AttachmentBuilder {

	/**
	 * Sets the title, and enables it to link to a URL.
	 *
	 * @param title The title of the Attachment.
	 * @param link  The link of the attachment (URL)
	 * @return this
	 */
	AttachmentBuilder setTitle(String title, String link);

	/**
	 * Set the title of the Attachment.
	 *
	 * @param title The Title of the Attachment
	 * @return this
	 */
	AttachmentBuilder setTitle(String title);

	/**
	 * Set the text of the attachment body.
	 * <p>
	 * Markdown enabled by default.
	 *
	 * @param text The attachment body.
	 * @return this
	 */
	AttachmentBuilder setText(String text);

	/**
	 * Set the text of the attachment body.
	 * Specify if markdown is enabled
	 *
	 * @param text            The attachment body.
	 * @param markdownEnabled Should the attachment body be parsed as markdown?
	 * @return this
	 */
	AttachmentBuilder setText(String text, boolean markdownEnabled);

	/**
	 * Set the pre text of the attachment.  This will appear below the
	 * title.
	 * Markdown enabled by default.
	 *
	 * @param preText The pre text of the attachment.
	 * @return this
	 */
	AttachmentBuilder setPreText(String preText);

	/**
	 * Set the pre text of the attachment.  This will appear below the title.
	 * Specify if markdown is enabled.
	 *
	 * @param preText         The pre text of the attachment.
	 * @param markdownEnabled Should the pre text be parsed as markdown?
	 * @return this
	 */
	AttachmentBuilder setPreText(String preText, boolean markdownEnabled);

	/**
	 * Set the color of the attachment.
	 *
	 * @param color The hex encoding of the color.
	 * @return this
	 */
	AttachmentBuilder setColor(String color);

	/**
	 * Set the author name of the attachment. This appears at the top of the
	 * attachment.
	 *
	 * @param name The hex encoding of the color.
	 * @return this
	 */
	AttachmentBuilder setAuthorName(String name);

	/**
	 * Set the url for the author name.
	 *
	 * @param url The author's url.
	 * @return this
	 */
	AttachmentBuilder setAuthorLink(String url);

	/**
	 * Set the url for the author's icon.
	 *
	 * @param url The author's icon url.
	 * @return this
	 */
	AttachmentBuilder setAuthorIcon(String url);

	/**
	 * Add a field to this attachment.
	 *
	 * @param builder A field to be included in the attachment.
	 * @return this
	 */
	AttachmentBuilder addField(FieldBuilder builder);

	/**
	 * @return the attachment as a String
	 */
	String build();
}
