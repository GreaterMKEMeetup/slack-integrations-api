package org.gmjm.slack.api.file;

/**
 * Use a factory implementation instance to create all instances of related
 * FileUploadRequest objects.  This ensures the .upload method will work as
 * intended.
 *
 * This object is intended to be threadsafe.
 *
 * <p>
 *     https://api.slack.com/methods/files.upload
 * </p>
 *
 */
public interface FileUploadRequestFactory {

	/**
	 * Create a new FileUploadRequest object.
	 *
	 * This object is intended to be threadsafe.
	 *
	 * @return a FileUploadRequest object.
	 */
	FileUploadRequest createFileUploadRequest();

	/**
	 * Create a new FileUploadBuilder object.
	 *
	 * This object is not intended to be threadsafe, but can be used multiple times.
	 *
	 * @return a FileUploadbuilder.
	 */
	FileUploadBuilder createFileUploadBuilder();
}
