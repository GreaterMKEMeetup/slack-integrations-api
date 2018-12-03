package org.gmjm.slack.api.message;

public interface Message {
  String toJson() throws JsonCreationFailure;
}
