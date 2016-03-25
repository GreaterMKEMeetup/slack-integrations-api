package org.gmjm.slack.api.message;

public interface AttachmentBuilder
{
	AttachmentBuilder setTitle(String title, String link);

	AttachmentBuilder setTitle(String title);

	AttachmentBuilder setText(String text);

	AttachmentBuilder setText(String text, boolean markdownEnabled);

	AttachmentBuilder setPreText(String preText);

	AttachmentBuilder setPreText(String preText, boolean markdownEnabled);

	String build();
}
