package org.gmjm.slack.api.message;

/**
 * Use a factory implementation instance to create all instances of related
 * message building objects.  This ensures the .build methods will work as
 * intended.
 * <p>
 *     Implementations of this factory are intended to be thread safe.
 * </p>
 */
public interface SlackMessageFactory {

	/**
	 * The returned object is not threadsafe.
	 *
	 * @return A new instance of SlackMessageBuilder.
	 */
	SlackMessageBuilder createMessageBuilder();

	/**
	 * This returned is not threadsafe.
	 *
	 * @return A new instance of AttachmentBuilder.
	 */
	AttachmentBuilder createAttachmentBuilder();

	/**
	 * This returned is not threadsafe.
	 *
	 * @return A new instance of AttachmentBuilder.
	 */
	FieldBuilder createFieldBuilder();

	/**
	 * This returned is not threadsafe.
	 *
	 * @return A new instance of ActionBuilder.
	 */
	ActionBuilder createActionBuilder();


}
