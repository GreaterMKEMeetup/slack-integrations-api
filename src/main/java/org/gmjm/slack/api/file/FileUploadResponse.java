package org.gmjm.slack.api.file;

public interface FileUploadResponse {

	/**
	 * Returns the sent FileUpload object.
	 *
	 * @return the sent FileUpload object.
	 */
	FileUpload getFileUpload();

	/**
	 * Implementations should never return null.
	 *
	 * @return a success or error message.
	 */
	String getMessage();

	/**
	 * @return The HTTP status code of the response.
	 */
	int getStatusCode();

	/**
	 *
	 * The status denoting if the upload request was successful.
	 *
	 * @return a Status enumeration denoting if the upload request was successful.
	 */
	Status getStatus();

	/**
	 * Should return null in most cases.
	 *
	 * @return null if no exception captured, throwable if an exception occurred.
	 */
	Throwable getThrowable();

	enum Status {SUCCESS, FAILED}
}
