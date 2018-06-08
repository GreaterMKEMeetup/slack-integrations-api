package org.gmjm.slack.api.file;

import java.io.InputStream;
import java.util.Optional;
import java.util.Set;
import java.util.function.Supplier;

import org.gmjm.slack.api.common.Channel;

public interface FileUpload {
    Optional<String> getOTitle();
    Optional<String> getOFileType();
    Optional<String> getOFileName();
    Optional<Supplier<InputStream>> getOInputStreamSupplier();
    Optional<String> getOContent();
    Optional<String> getOInitialComment();
    Set<Channel> getChannels();

}
