package org.gmjm.slack.api.hook;

/**
 * Use a factory implementation instance to create all instances of related
 * HookRequest objects.  This ensures the .send method will work as
 * intended.
 * <p>
 *     Implementations of this factory are intended to be thread safe.
 * </p>
 */
public interface HookRequestFactory {

	/**
	 *
	 * @param url The target URL used by the HookRequest.
	 * @return A HookRequest object
	 */
	HookRequest createHookRequest(String url);

	/**
	 *
	 * @param url The target URL used by the HookRequest.
	 * @return An AsyncHookRequest object
	 */
	AsyncHookRequest createAsyncHookRequest(String url);

}
