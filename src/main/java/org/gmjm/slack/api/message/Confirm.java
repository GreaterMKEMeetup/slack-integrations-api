package org.gmjm.slack.api.message;

public interface Confirm {
  String getTitle();
  String getText();
  String getOkText();
  String getDismissText();
}
