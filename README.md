[![Build Status](https://travis-ci.org/GreaterMKEMeetup/slack-integrations-api.svg?branch=master)](https://travis-ci.org/GreaterMKEMeetup/slack-integrations-api)

# slack-integrations-api

This Java based API is designed to make adding new slack integrations into your Java applications simple.  
The minimal API allows you to:
* Get info from incoming slack commands.
* Build Slack messages with attachemtns.
* Easily send a response to a Slack command, or Incoming Webhook.

This API is currently implemented by [slack-integrations-core](https://github.com/GreaterMKEMeetup/slack-integrations-core).
For an example of how to use the API in a SpringBoot app to create custom integrations, see [springboot-slack-integrations](https://github.com/GreaterMKEMeetup/springboot-slack-integrations).

## Usage
### Maven
```xml
<dependency>
    <groupId>com.github.greatermkemeetup</groupId>
    <artifactId>slack-integrations-api</artifactId>
    <version>1.0.2</version>
</dependency>
```
### Gradle
```groovy
compile 'com.github.greatermkemeetup:slack-integrations-api:1.0.2'
```

## Packages

- [model](#orggmjmslackapimodel)
- [message](#orggmjmslackapimessage)
- [hook](#orggmjmslackapihook)

### [org.gmjm.slack.api.model](/src/main/java/org/gmjm/slack/api/model)

#### SlackCommand
use SlackCommand to obtain information from an incoming Slack Command.


### [org.gmjm.slack.api.message](/src/main/java/org/gmjm/slack/api/message)

#### SlackMessageFactory
Use this interface to obtain instances of SlackMessageBuilder, and AttachmentBuilder.

#### SlackMessageBuilder
Use this interface to build up a Slack message, the call .build() to obtain a message string.  Depending on the implementation of SlackMessageFactory you use will determine if the returned message string is plain text, or JSON.

[Slack screenshot of basic SlackMessageBuilder example.](http://imgur.com/jM2Qa39)

```java
  // SlackMessageFactory implementations provided by slack-integrations-core.
  SlackMessageBuilder messageBuilder = slackMessageFactory.createMessageBuilder()
    .setUsername("doughnut-overlord")
    .setIconEmoji("doughnut")
    .setText("Eat me, I'm a *delicious* doughnut!") //Markdown is enabled by default
    .setChannel("doughnut-lovers");
  
  System.out.println(messageBuilder.build());
```

#### AttachmentBuilder
Use this interface to build up attachments that you can add to a SlackMessageBuilder.  Not all Slack response types support attachments, but most do.

[Slack screenshot of AttachmentBuilder example.](http://imgur.com/61S01vb)

```java
  SlackMessageBuilder messageBuilder = slackMessageFactory.createMessageBuilder()
    .setUsername("doughnut-overlord")
    .setIconEmoji("doughnut")
    .setText("Here are your _amazing_ doughtnut options!") //Markdown is enabled by default
    .setChannel("doughnut-lovers");
  
  {
    AttachmentBuilder attachmentBuilder = slackMessageFactory.createAttachmentBuilder()
        .setTitle("Sprinkles")
        .setText("Red, white, and blue, *MURICA*!");
    messageBuilder.addAttachment(attachmentBuilder);
  }
  {
    AttachmentBuilder attachmentBuilder = slackMessageFactory.createAttachmentBuilder()
        .setTitle("Jelly","https://en.wikipedia.org/wiki/Jelly_doughnut")
        .setText("Delicious cherry filling.");
    messageBuilder.addAttachment(attachmentBuilder);
  }
  
  System.out.println(messageBuilder.build());
```

### [org.gmjm.slack.api.hook](/src/main/java/org/gmjm/slack/api/hook)

#### HookRequesetFactory
Use this class to create instances of HookRequest objects.  Implementations found in [slack-integrations-core](https://github.com/GreaterMKEMeetup/slack-integrations-core) project.

#### HookRequest
A reusable object that can be used to send a message to an Incoming Webhook, or a reply URL supplied by a SlackMessage object.

```java
  //Used as a reply
  HookRequest replyRequest = hookRequestFactory.create(slackCommand.getResponseUrl());
  
  SlackMessageBuilder smb = slackMessageFactory.createMessageBuilder()
    .setText("Your wish is my command.");
  
  replyRequest.send(smb.build()); 
```

#### HookResponse
An object that makes processing the response from a HookRequest easier.  You don't have to worry about wrapping requests in try/catch blocks as this information is captured and provided by the HookResponse object.  This makes collections of HookRequests much nicer to process in Java 8 streams, as one thrown exception won't prevent the whole stream from exiting.

```java
  import org.gmjm.slack.api.hook.HookResponse.Status;

  HookResponse hookResponse = hookRequest.send(messageText);
  
  if(Status.FAILED.equals(hookResponse.getStatus())) {
    logger.error("Failed to send response: " + hookResponse.getMessage());
  }
```
