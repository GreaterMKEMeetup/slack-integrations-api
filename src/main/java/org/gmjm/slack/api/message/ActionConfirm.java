package org.gmjm.slack.api.message;

public class ActionConfirm implements Confirm {

  private final String title;
  private final String text;
  private final String ok_text;
  private final String dismiss_text;

  public ActionConfirm(String title, String text, String ok_text, String dismiss_text) {
    this.title = title;
    this.text = text;
    this.ok_text = ok_text;
    this.dismiss_text = dismiss_text;
  }

  @Override
  public String getTitle() {
    return title;
  }

  @Override
  public String getText() {
    return text;
  }

  @Override
  public String getOkText() {
    return ok_text;
  }

  @Override
  public String getDismissText() {
    return dismiss_text;
  }
}
