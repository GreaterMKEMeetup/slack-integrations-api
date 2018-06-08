package org.gmjm.slack.api.rtm;

/**
 * EXPERIMENTAL: This feature is still in development, and the interfaces may change upon official release.
 *
 * All the possible connection errors that could be encountered when
 * an RtmSession attempts to connect to the RTM API.
 */
public enum ConnectionErrorType {

	NOT_AUTHED("not_authed","No authentication token provided."),
	INVALID_AUTH("invalid_auth","Invalid authentication token."),
	ACCOUNT_INACTIVE("account_inactive","Authentication token is for a deleted user or workspace."),
	NO_PERMISSION("no_permission","The workspace token used in this request does not have the permissions necessary to complete the request."),
	INVALID_ARG_NAME("invalid_arg_name","The method was passed an argument whose name falls outside the bounds of accepted or expected values. This includes very long names and names with non-alphanumeric characters other than _. If you get this error, it is typically an indication that you have made a very malformed API call."),
	INVALID_ARRAY_ARG("invalid_array_arg","The method was passed a PHP-style array argument (e.g. with a name like foo[7]). These are never valid with the Slack API."),
	INVALID_CHARSET("invalid_charset","The method was called via a POST request, but the charset specified in the Content-Type header was invalid. Valid charset names are: utf-8 iso-8859-1."),
	INVALID_FORM_DATA("invalid_form_data","The method was called via a POST request with Content-Type application/x-www-form-urlencoded or multipart/form-data, but the form data was either missing or syntactically invalid."),
	INVALID_POST_TYPE("invalid_post_type","The method was called via a POST request, but the specified Content-Type was invalid. Valid types are: application/x-www-form-urlencoded multipart/form-data text/plain."),
	MISSING_POST_TYPE("missing_post_type","The method was called via a POST request and included a data payload, but the request did not include a Content-Type header."),
	TEAM_ADDED_TO_ORG("team_added_to_org","The workspace associated with your request is currently undergoing migration to an Enterprise Organization. Web API and other platform operations will be intermittently unavailable until the transition is complete."),
	REQUEST_TIMEOUT("request_timeout","The method was called via a POST request, but the POST data was either missing or truncated."),
	EXCEPTION("exception","An exception was thrown during connection attempt.");

	public final String code;
	public final String description;

	ConnectionErrorType(String code, String description) {
		this.code = code;
		this.description = description;
	}

}
