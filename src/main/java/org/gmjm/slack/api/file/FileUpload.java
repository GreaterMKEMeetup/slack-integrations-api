package org.gmjm.slack.api.file;

import java.io.InputStream;
import java.util.Optional;
import java.util.Set;
import java.util.function.Supplier;

import org.gmjm.slack.api.common.Channel;

public interface FileUpload {
    Optional<FileType> getFileType();
    Optional<String> getFileName();
    Optional<Supplier<InputStream>> getInputStreamSupplier();
    Optional<String> getContent();
    Optional<String> getInitialComment();
    Set<Channel> getChannels();

}
