package org.gmjm.slack.api.file;

public interface FileUploadRequest {
	FileUploadResponse upload(FileUploadBuilder fileUploadBuilder);
}
