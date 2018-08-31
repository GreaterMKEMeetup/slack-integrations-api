package org.gmjm.slack.api.message;

import java.util.Optional;

public interface Option {

  String getText();

  String getValue();

  Optional<String> getDescription();
}
