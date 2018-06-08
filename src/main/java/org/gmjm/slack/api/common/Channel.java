package org.gmjm.slack.api.common;

import java.util.Optional;

/**
 * Channels in Slack can be referenced by name, or ID.  In some cases, the ID is required.
 */
public interface Channel {

    /**
     * The name of the Channel.
     *
     * @return an optional that may contain the name of a channel.
     */
    Optional<String> getOName();

    /**
     * The ID of the Channel.
     *
     * @return an optional that may contain the ID of a channel.
     */
    Optional<String> getOId();

    /**
     * If channel ID is available, it will be returned, else the channel name will be returned.
     *
     * This method will always return a value.
     *
     * @return The channel ID if available, otherwise the channel name.
     */
    String getIdentifier();
}
