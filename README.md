# slack-integrations-api

This Java based API is designed to make adding new slack integrations into your Java applications simple.  
The minimal API allows you to:
* Get info from incoming slack commands.
* Build Slack messages with attachemtns.
* Easily send a response to a Slack command, or Incoming Webhook.

This API is currently implemented by https://github.com/GreaterMKEMeetup/slack-integrations-core
For an example of how to use the API in a SpringBoot app to create custom integrations, see https://github.com/GreaterMKEMeetup/springboot-slack-integrations

## Overview
### org.gmjm.slack.api.model.SlackMessage
use SlackCommand to obtain information from an incoming Slack Command.

### org.gmjm.slack.api.message.SlackMessageFactory
Use this interface to obtain instances of SlackMessageBuilder, and AttachmentBuilder.

### org.gmjm.slack.api.message.SlackMessageBuilder
Use this interface to build up a Slack message, the call .build() to obtain a message string.  Depending on the implementation of SlackMessageFactory you use will determine if the returned message string is plain text, or JSON.

[Slack screenshot of basic SlackMessageBuilder example.](http://imgur.com/jM2Qa39)

```java
  // SlackMessageFactory implementations provided by slack-integrations-core.
  SlackMessageBuilder messageBuilder = slackMessageFactory.createMessageBuilder(); 
  
  messageBuilder.setUsername("doughnut-overlord");
  messageBuilder.setIconEmoji("doughnut");
  messageBuilder.setText("Eat me, I'm a *delicious* doughnut!"); //Markdown is enabled by default
  messageBuilder.setChannel("doughnut-lovers");
  
  System.out.println(messageBuilder.build());
```

### org.gmjm.slack.api.message.AttachmentBuilder
Use this interface to build up attachments that you can add to a SlackMessageBuilder.  Not all Slack response types support attachments, but most do.

[Slack screenshot of AttachmentBuilder example.](http://imgur.com/61S01vb)

```java
  SlackMessageBuilder messageBuilder = slackMessageFactory.createMessageBuilder(); 
  
  messageBuilder.setUsername("doughnut-overlord");
  messageBuilder.setIconEmoji("doughnut");
  messageBuilder.setText("Here are your _amazing_ doughtnut options!"); //Markdown is enabled by default
  messageBuilder.setChannel("doughnut-lovers");
  
  {
    AttachmentBuilder attachmentBuilder = slackMessageFactory.createAttachmentBuilder();
    attachmentBuilder.setTitle("Sprinkles");
    attachmentBuilder.setText("Red, white, and blue, *MURICA*!");
    messageBuilder.addAttachment(attachmentBuilder);
  }
  {
    AttachmentBuilder attachmentBuilder = slackMessageFactory.createAttachmentBuilder();
    attachmentBuilder.setTitle("Jelly","https://en.wikipedia.org/wiki/Jelly_doughnut");
    attachmentBuilder.setText("Delicious cherry filling.");
    messageBuilder.addAttachment(attachmentBuilder);
  }
  
  System.out.println(messageBuilder.build());
```

### org.gmjm.slack.api.hook.HookRequesetFactory
### org.gmjm.slack.api.hook.HookRequest
### org.gmjm.slack.api.hook.HookResponse
