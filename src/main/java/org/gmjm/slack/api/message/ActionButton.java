package org.gmjm.slack.api.message;

import java.util.Optional;

public class ActionButton implements Button {

  private final String name;
  private final String text;
  private final String value;
  private final Confirm confirm;

  public ActionButton(String name, String text, String value) {
    this.name = name;
    this.text = text;
    this.value = value;
    this.confirm = null;
  }

  public ActionButton(
      String name,
      String text,
      String value,
      Confirm confirm) {
    this.name = name;
    this.text = text;
    this.value = value;
    this.confirm = confirm;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getText() {
    return text;
  }

  @Override
  public String getValue() {
    return value;
  }

  @Override
  public Optional<Confirm> getOConfirm() {
    return Optional.ofNullable(confirm);
  }
}
