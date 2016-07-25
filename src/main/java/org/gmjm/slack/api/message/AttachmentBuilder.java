package org.gmjm.slack.api.message;

/**
 * AttachementBuilder is used to build up a complex, formatted attachment
 * for inclusion in a SlackMessageBuilder.
 *
 * https://api.slack.com/docs/attachments
 *
 */
public interface AttachmentBuilder
{
	/**
	 *
	 * Sets the title, and enables it to link to a URL.
	 *
	 * @param title The title of the Attachment.
	 * @param link The link of the attachment (URL)
	 * @return this
	 */
	AttachmentBuilder setTitle(String title, String link);

	/**
	 *
	 * Set the title of the Attachment.
	 *
	 * @param title The Title of the Attachment
	 * @return this
	 */
	AttachmentBuilder setTitle(String title);

	/**
	 *
	 * Set the text of the attachment body.
	 *
	 * Markdown enabled by default.
	 *
	 * @param text The attachment body.
	 * @return this
	 */
	AttachmentBuilder setText(String text);

	/**
	 *
	 * Set the text of the attachment body.
	 * Specify if markdown is enabled
	 *
	 * @param text  The attachment body.
	 * @param markdownEnabled Should the attachment body be parsed as markdown?
	 * @return this
	 */
	AttachmentBuilder setText(String text, boolean markdownEnabled);

	/**
	 *
	 * Set the pre text of the attachment.  This will appear below the
	 * title.
	 * Markdown enabled by default.
	 *
	 * @param preText The pre text of the attachment.
	 * @return this
	 */
	AttachmentBuilder setPreText(String preText);

	/**
	 *
	 * Set the pre text of the attachment.  This will appear below the title.
	 * Specify if markdown is enable.d
	 *
	 * @param preText The pre text of the attachment.
	 * @param markdownEnabled  Should the pre text be parsed as markdown?
	 * @return this
	 */
	AttachmentBuilder setPreText(String preText, boolean markdownEnabled);

	/**
	 *
	 * @return the attachment as a String
	 */
	String build();
}
