package org.gmjm.slack.api.file;

import java.io.InputStream;
import java.util.function.Supplier;

import org.gmjm.slack.api.common.Channel;

public interface FileUploadBuilder {

	/**
	 * Optional
	 *
	 * Set the channel names or IDs where the file will be shared.
	 *
	 * @param channels The channel names or IDs
	 * @return this
	 */
	FileUploadBuilder setChannels(Channel... channels);

	/**
	 * Optional - Must be set if setFile is not called.
	 *
	 * File contents via a POST variable. If omitting this parameter, you must call setFile.
	 *
	 * @param inputStream The content InputStream.
	 * @return this
	 */
	FileUploadBuilder setContent(InputStream inputStream);

	/**
	 * Optional - Must be set if setFile is not called.
	 *
	 * File contents via a POST variable. If omitting this parameter, you must call setFile.
	 *
	 * @param content The content to upload.
	 * @return this
	 */
	FileUploadBuilder setContent(String content);

	/**
	 * Optional - Must be set if setContent is not called.
	 *
	 * File contents via multipart/form-data. If omitting this parameter, you must submit content.
	 *
	 * @param inputStream The file InputStream
	 * @return this
	 */
	FileUploadBuilder setInputStreamSupplier(Supplier<InputStream> inputStream);

	/**
	 * Optional
	 *
	 * The filename of the file.
	 *
	 * @param filename The filename of the file.
	 * @return this
	 */
	FileUploadBuilder setFilename(String filename);

	/**
	 * Optional
	 *
	 * The file type identifier of the file.
	 *
	 * @param filetype The file type identifier of the file.
	 * @return this
	 */
	FileUploadBuilder setFiletype(FileType filetype);

	/**
	 * Optional
	 *
	 * The file type identifier of the file.
	 *
	 * @param filetype The file type identifier of the file.
	 * @return this
	 */
	FileUploadBuilder setFiletype(String filetype);

	/**
	 * Optional
	 *
	 * An initial comment to add to the file.
	 *
	 * @param initialComment The initial comment to add to the file.
	 * @return this
	 */
	FileUploadBuilder setInitialComment(String initialComment);

	/**
	 * Optional
	 *
	 * The title of the file.
	 *
	 * @param title The title of the file.
	 * @return this
	 */
	FileUploadBuilder setTitle(String title);

	/**
	 * Build a FileUpload based on the current state of the builder.
	 *
	 * @return a FileUpload object.
	 */
	FileUpload build();
}
