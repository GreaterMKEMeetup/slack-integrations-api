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
    <version>1.1.0</version>
</dependency>
```
### Gradle
```groovy
compile 'com.github.greatermkemeetup:slack-integrations-api:1.1.0'
```

## Packages

- [command](#orggmjmslackapicommand)
- [message](#orggmjmslackapimessage)
- [hook](#orggmjmslackapihook)
- [file](#orggmjmslackapifile)
- [rtm](#orggmjmslackapirtm) - Experimental

### [org.gmjm.slack.api.command](/src/main/java/org/gmjm/slack/api/command)

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

#### AttachmentBuilder & FieldBuilder
Use this interface to build up attachments that you can add to a SlackMessageBuilder.  Not all Slack response types support attachments, but most do.

[Slack screenshot of AttachmentBuilder example.](http://imgur.com/61S01vb)

```java
String message = String message = messageFactory.createMessageBuilder()

  .setText("Eat me, I'm a *delicious* doughnut!")
  .setResponseType("ephemeral")
  .setChannel("doughnut-lovers")
  .setIconUrl("https://www.donut-lover-site.com/donut.png")

  .addAttachment(
	  messageFactory.createAttachmentBuilder()
		  .setTitle("Top Donut of the Day")
		  .setText("Bearclaw"))

  .addAttachment(
	  messageFactory.createAttachmentBuilder()
		  .setTitle("Your Favorite Donuts", "http://donut-lover-site.com/user/1234")
		  .setText("You have 16 favorite donuts.")
		  .addField(
			  .createFieldBuilder()
				  .setShort(true)
				  .setTitle("Number 1 Donut")
				  .setValue("Jelly"))
		  .addField(
			  .createFieldBuilder()
				  .setShort(true)
				  .setTitle("Number 2 Donut")
				  .setValue("Cruller")))
  .build();
```

### [org.gmjm.slack.api.hook](/src/main/java/org/gmjm/slack/api/hook)

#### HookRequesetFactory
Use this interface to create instances of HookRequest objects.  Implementations found in [slack-integrations-core](https://github.com/GreaterMKEMeetup/slack-integrations-core) project.

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
An interface that makes processing the response from a HookRequest easier.  You don't have to worry about wrapping requests in try/catch blocks as this information is captured and provided by the HookResponse object.  This makes collections of HookRequests much nicer to process in Java 8 streams, as one thrown exception won't prevent the whole stream from exiting.

```java
import org.gmjm.slack.api.hook.HookResponse.Status;

HookResponse hookResponse = hookRequest.send(messageText);

if(Status.FAILED.equals(hookResponse.getStatus())) {
logger.error("Failed to send response: " + hookResponse.getMessage());
}
```

### [org.gmjm.slack.api.file](/src/main/java/org/gmjm/slack/api/file)

#### FileUploadRequestFactory
Use this interface to create FileUploadBuilders, and FileUploadRequests. Implementations found in [slack-integrations-core](https://github.com/GreaterMKEMeetup/slack-integrations-core) project.

```java
FileUploadRequestFactory uploadRequestFactory = new HttpsFileUploadRequestFactory(token);

Supplier<InputStream> inputStreamSupplier = () -> this.getClass().getResourceAsStream("/uploads/cat.jpg");

FileUpload fileUpload =
	uploadRequestFactory.createFileUploadBuilder()
		.setChannels(withName(testChannel))
		.setTitle("Hello Cat")
		.setFiletype("jpg")
		.setFilename("hello_cat.jpg")
		.setInputStreamSupplier(inputStreamSupplier)
		.setInitialComment("It's cat time!")
		.build();

FileUploadResponse response =
	uploadRequestFactory
		.createFileUploadRequest()
		.upload(fileUpload);

if (response.getStatus() == FileUploadResponse.Status.FAILED) {
	throw response.getThrowable();
}

assertEquals(FileUploadResponse.Status.SUCCESS, response.getStatus());
assertEquals("Hello Cat", response.getFileUpload().getOTitle().get());
```

### [org.gmjm.slack.api.rtm](/src/main/java/org/gmjm/slack/api/rtm)

The RTM API is experimental.  Interfaces will change before official release.

#### RtmSessionFactory 
Use this interface to create instances of an RtmSessionFactory. Implementations found in [slack-integrations-core](https://github.com/GreaterMKEMeetup/slack-integrations-core) project.

#### RtmSession
Send and recieve messages in real time using RtmSession. Register EventConsumer objects on an RtmSession to listen for
different Events.

```java
RtmSessionFactory sessionFactory = new WebsocketSessionFactory(token);
RtmSession slackSession = sessionFactory.createSession();

String msg = slackMessageBuilder.build();

slackSession.registerConsumer(new EventConsumer<JsonNode>() {
	@Override
	public EventConsumerID getId() {
		return new EventConsumerID("console-logger");
	}

	@Override
	public void consume(Event<JsonNode> event) {
		switch (event.getEventType()) {
			case HELLO:
				System.out.println("SuccessfullyConnected");
				break;
			case RECEIPT:
				System.out.println("Your message was recieved.");
				break;
			case USER_TYPING:
				System.out.println("Someone is typing: " + event.getPayload().toString());
			case ERROR:
				throw new RuntimeException("Event type was ERROR: " + event.getPayload().toString());
			default:
				break;
		}
	}
});

slackSession.send(msg);

Thread.sleep(100000);
```
