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
	 * Sets an arbitrary key, value pair on the field.
	 *
	 * This should only be used in cases where the API has not been updated to
	 * support a new feature.  Try to avoid using this.
	 *
	 * @param key The key of the attribute that will be added to the field.
	 * @param value The value of the attribute that will be added to the field.
	 * @return this
	 */
	FieldBuilder setAttribute(String key, Object value);

	/**
	 * Build the current FieldBuilder state into an immutable Field object.
	 *
	 * @return an immutable Field object.
	 */
	Field build();
}
