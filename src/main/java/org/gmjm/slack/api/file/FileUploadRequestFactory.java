package org.gmjm.slack.api.file;

public interface FileUploadRequestFactory {
	FileUploadRequest createFileUploadRequest();
	FileUploadBuilder createFileUploadBuilder();
}
