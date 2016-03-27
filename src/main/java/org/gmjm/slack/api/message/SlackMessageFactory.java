package org.gmjm.slack.api.message;

/**
 * Use a factory implementation instance to create all instances of related
 * message building objects.  This ensures the .build methods will work as
 * intended.
 *
 */
public interface SlackMessageFactory
{
	SlackMessageBuilder createMessageBuilder();
	AttachmentBuilder createAttachmentBuilder();
}
