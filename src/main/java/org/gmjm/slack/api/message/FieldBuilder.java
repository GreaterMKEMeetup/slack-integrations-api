package org.gmjm.slack.api.message;

/**
 * FieldBuilder can be used to build up a list of fields on a message.
 * <p>
 *     https://api.slack.com/docs/formatting
 * </p>
 */
public interface FieldBuilder {

	/**
	 * This object is not threadsafe, or reusable.
	 *
	 * @param title The title for the field.
	 * @return this
	 */
	FieldBuilder setTitle(String title);

	/**
	 * This object is not threadsafe, or reusable.
	 *
	 * @param text The text for the field.
	 * @return this
	 */
	FieldBuilder setValue(String text);

	/**
	 * This object is not threadsafe, or reusable.
	 *
	 * @param isShort Whether the field should be presented in short form.
	 * @return this
	 */
	FieldBuilder setShort(boolean isShort);

	/**
	 * @return the attachment as a String
	 */
	String build();
}
