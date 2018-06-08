package org.gmjm.slack.api.rtm;

import java.util.Objects;

/**
 * EXPERIMENTAL: This feature is still in development, and the interfaces may change upon official release.
 *
 *
 */
public class EventConsumerID {

	private final String id;

	public EventConsumerID(String id) {
		if(id == null || id.trim().isEmpty()) {
			throw new RuntimeException("id cannot be null or empty");
		}
		this.id = id.trim();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		EventConsumerID that = (EventConsumerID) o;
		return Objects.equals(id, that.id);
	}

	@Override
	public int hashCode() {

		return Objects.hash(id);
	}
}
