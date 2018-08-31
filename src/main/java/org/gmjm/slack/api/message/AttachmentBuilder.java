package org.gmjm.slack.api.message;

import java.util.Collection;

/**
 * AttachementBuilder is used to build up a complex, formatted attachment
 * for inclusion in a SlackMessageBuilder.
 * <p>
 *     https://api.slack.com/docs/message-attachments
 * </p>
 */
public interface AttachmentBuilder {

	/**
	 * Sets the title, and enables it to link to a URL.
	 *
	 * @param title The title of the Attachment.
	 * @param titleLink  The titleLink of the attachment (URL)
	 * @return this
	 */
	AttachmentBuilder setTitle(String title, String titleLink);

	/**
	 * Set the title of the Attachment.
	 *
	 * @param title The Title of the Attachment
	 * @return this
	 */
	AttachmentBuilder setTitle(String title);

	/**
	 * Sets the titleLink
	 *
	 * @param link  The link of the attachment (URL)
	 * @return this
	 */
	AttachmentBuilder setTitleLink(String link);


	/**
	 * A valid URL to an image file that will be displayed inside a message attachment. We currently support the following formats: GIF, JPEG, PNG, and BMP.
	 *
	 * Large images will be resized to a maximum width of 360px or a maximum height of 500px, while still maintaining the original aspect ratio.
	 *
	 * @param imageUrl the URL to an image file
	 * @return this
	 */
	AttachmentBuilder setImageUrl(String imageUrl);

	/**
	 *
	 * A valid URL to an image file that will be displayed as a thumbnail on the right side of a message attachment. We currently support the following formats: GIF, JPEG, PNG, and BMP.
	 *
	 * The thumbnail's longest dimension will be scaled down to 75px while maintaining the aspect ratio of the image. The filesize of the image must also be less than 500 KB.
	 *
	 * For best results, please use images that are already 75px by 75px.
	 *
	 * @param thumbUrl the URL to an image file
	 * @return this
	 */
	AttachmentBuilder setThumbUrl(String thumbUrl);


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
	 * Set the text of the attachment body.  It should not contain any markdown.
	 *
	 * @param fallbackText The attachment body.
	 * @return this
	 */
	AttachmentBuilder setFallbackText(String fallbackText);


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
	 *
	 * An optional value that can either be one of good, warning, danger, or any hex color code (eg. #439FE0)
	 *
	 * @param color The name, or hex encoding of the color.
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
	 * Set the timestamp for this attachment.
	 *
	 * @param time The epoch time for the attachment.
	 * @return this
	 */
	AttachmentBuilder setTimestamp(int time);

	/**
	 * Sets the timestamp this attachment to the current time.
	 *
	 * @return this
	 */
	AttachmentBuilder setCurrentTimestamp();

	/**
	 * Add a field to this attachment.
	 *
	 * @param fieldBuilder A fieldBuilder to be included in the attachment.
	 * @return this
	 */
	AttachmentBuilder addField(FieldBuilder fieldBuilder);

	/**
	 * Add one or more fields to this attachment.
	 *
	 * @param fieldBuilders One or more fieldbuilders to be included in the attachment.
	 * @return this
	 */
	AttachmentBuilder addFields(FieldBuilder ... fieldBuilders);

	/**
	 * Add a collection of fields to this attachment.
	 *
	 * @param fieldBuilders A collection of fieldBuilders to be included in the attachment.
	 * @return this
	 */
	AttachmentBuilder addFields(Collection<FieldBuilder> fieldBuilders);

	/**
	 * Set the fields on this attachment.
	 *
	 * This will override any previously held fieldBuilders that may have been added to this
	 * Attachment.
	 *
	 * @param fieldBuilders A field to be included in the attachment.
	 * @return this
	 */
	AttachmentBuilder setFields(Collection<FieldBuilder> fieldBuilders);

	/**
	 * Add some brief text to help contextualize and identify an attachment.
	 * Limited to 300 characters, and may be truncated further when displayed to
	 * users in environments with limited screen real estate.
	 *
	 * @param footerText The footer text.
	 * @return this
	 */
	AttachmentBuilder setFooter(String footerText);

	/**
	 * To render a small icon beside your footer text, provide a publicly accessible URL string
	 * in the footer_icon field. You must also provide a footer for the field to be recognized.
	 *
	 * We'll render what you provide at 16px by 16px. It's best to use an image that is similarly
	 * sized.
	 *
	 * Example: "https://platform.slack-edge.com/img/default_application_icon.png"
	 *
	 * @param footerIconUrl The footerIcon URL.
	 * @return this
	 */
	AttachmentBuilder setFooterIcon(String footerIconUrl);

	/**
	 * Set the attachment type default value is <i>default</i>
	 *
	 * @param attachmentType The attachment type.
	 * @return this
	 */
	AttachmentBuilder setAttachmentType(String attachmentType);

	/**
	 * Add an action to this Attachment.
	 *
	 * @param actionBuilder The action to add.
	 * @return this
	 */
	AttachmentBuilder addAction(ActionBuilder actionBuilder);

	/**
	 * Add one or more actions to this Attachment.
	 *
	 * @param actionBuilders The actions to add.
	 * @return this
	 */
	AttachmentBuilder addActions(ActionBuilder ... actionBuilders);

	/**
	 * Add actions to this Attachment.
	 *
	 * @param actionBuilders The actions to add.
	 * @return this
	 */
	AttachmentBuilder addActions(Collection<ActionBuilder> actionBuilders);

	/**
	 * Set actions on this Attachment.
	 * This will override any previously held actions that may have been added
	 * to the builder.
	 *
	 * @param actionBuilders The actions to set.
	 * @return this
	 */
	AttachmentBuilder setActions(Collection<ActionBuilder> actionBuilders);

	/**
	 * Sets an arbitrary key, value pair on the attachment.
	 *
	 * This should only be used in cases where the API has not been updated to
	 * support a new feature.  Try to avoid using this.
	 *
	 * @param key The key of the attribute that will be added to the attachment.
	 * @param value The value of the attribute that will be added to the attachment.
	 * @return this
	 */
	AttachmentBuilder setAttribute(String key, String value);


	/**
	 * 	The string you provided in the original message attachment as the callback_id. Use this to
	 * 	identify the specific set of actions/buttons originally posed. If the value of an action is
	 * 	the answer, callback_id is the specific question that was asked. No more than 200 or so
	 * 	characters please.
	 *
	 * @param callbackId The Callback ID.
	 * @return this
	 */
	AttachmentBuilder setCallbackId(String callbackId);

	/**
	 * @return the attachment as a String
	 */
	String build();
}
