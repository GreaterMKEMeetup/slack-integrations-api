package org.gmjm.slack.api.file;

public interface FileUploadResponse {

	/**
	 *
	 * The status denoting if the upload request was successful.
	 *
	 * @return a Status enumeration denoting if the upload request was successful.
	 */
	Status getStatus();

	enum Status {SUCCESS, FAILED}
}
