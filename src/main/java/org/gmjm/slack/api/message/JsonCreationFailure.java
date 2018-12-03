package org.gmjm.slack.api.message;

public class JsonCreationFailure extends RuntimeException {

  public JsonCreationFailure() {
  }

  public JsonCreationFailure(String message) {
    super(message);
  }

  public JsonCreationFailure(String message, Throwable cause) {
    super(message, cause);
  }

  public JsonCreationFailure(Throwable cause) {
    super(cause);
  }

  public JsonCreationFailure(String message, Throwable cause, boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
