package org.gmjm.slack.api.message;

import java.util.Optional;

public interface Button {
  String getName();
  String getText();
  String getValue();

  Optional<Confirm> getOConfirm();
}
