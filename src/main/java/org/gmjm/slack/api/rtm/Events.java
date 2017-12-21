package org.gmjm.slack.api.rtm;

public enum Events implements Event {

	ACCOUNTS_CHANGED("accounts_changed",true,false,"The list of accounts a user is signed into has changed"),
	APP_UNINSTALLED("app_uninstalled",false,true,"Your Slack app was uninstalled."),
	BOT_ADDED("bot_added",true,false,"An bot user was added"),
	BOT_CHANGED("bot_changed",true,false,"An bot user was changed"),
	CHANNEL_ARCHIVE("channel_archive",true,true,"A channel was archived"),
	CHANNEL_CREATED("channel_created",true,true,"A channel was created"),
	CHANNEL_DELETED("channel_deleted",true,true,"A channel was deleted"),
	CHANNEL_HISTORY_CHANGED("channel_history_changed",true,true,"Bulk updates were made to a channel's history"),
	CHANNEL_JOINED("channel_joined",true,false,"You joined a channel"),
	CHANNEL_LEFT("channel_left",true,false,"You left a channel"),
	CHANNEL_MARKED("channel_marked",true,false,"Your channel read marker was updated"),
	CHANNEL_RENAME("channel_rename",true,true,"A channel was renamed"),
	CHANNEL_UNARCHIVE("channel_unarchive",true,true,"A channel was unarchived"),
	COMMANDS_CHANGED("commands_changed",true,false,"A slash command has been added or changed"),
	DND_UPDATED("dnd_updated",true,true,"Do not Disturb settings changed for the current user"),
	DND_UPDATED_USER("dnd_updated_user",true,true,"Do not Disturb settings changed for a member"),
	EMAIL_DOMAIN_CHANGED("email_domain_changed",true,true,"The workspace email domain has changed"),
	EMOJI_CHANGED("emoji_changed",true,true,"A custom emoji has been added or changed"),
	FILE_CHANGE("file_change",true,true,"A file was changed"),
	FILE_COMMENT_ADDED("file_comment_added",true,true,"A file comment was added"),
	FILE_COMMENT_DELETED("file_comment_deleted",true,true,"A file comment was deleted"),
	FILE_COMMENT_EDITED("file_comment_edited",true,true,"A file comment was edited"),
	FILE_CREATED("file_created",true,true,"A file was created"),
	FILE_DELETED("file_deleted",true,true,"A file was deleted"),
	FILE_PUBLIC("file_public",true,true,"A file was made public"),
	FILE_SHARED("file_shared",true,true,"A file was shared"),
	FILE_UNSHARED("file_unshared",true,true,"A file was unshared"),
	GOODBYE("goodbye",true,false,"The server intends to close the connection soon."),
	GRID_MIGRATION_FINISHED("grid_migration_finished",false,true,"An enterprise grid migration has finished on this workspace."),
	GRID_MIGRATION_STARTED("grid_migration_started",false,true,"An enterprise grid migration has started on this workspace."),
	GROUP_ARCHIVE("group_archive",true,true,"A private channel was archived"),
	GROUP_CLOSE("group_close",true,true,"You closed a private channel"),
	GROUP_HISTORY_CHANGED("group_history_changed",true,true,"Bulk updates were made to a private channel's history"),
	GROUP_JOINED("group_joined",true,false,"You joined a private channel"),
	GROUP_LEFT("group_left",true,false,"You left a private channel"),
	GROUP_MARKED("group_marked",true,false,"A private channel read marker was updated"),
	GROUP_OPEN("group_open",true,true,"You opened a private channel"),
	GROUP_RENAME("group_rename",true,true,"A private channel was renamed"),
	GROUP_UNARCHIVE("group_unarchive",true,true,"A private channel was unarchived"),
	HELLO("hello",true,false,"The client has successfully connected to the server"),
	IM_CLOSE("im_close",true,true,"You closed a DM"),
	IM_CREATED("im_created",true,true,"A DM was created"),
	IM_HISTORY_CHANGED("im_history_changed",true,true,"Bulk updates were made to a DM's history"),
	IM_MARKED("im_marked",true,false,"A direct message read marker was updated"),
	IM_OPEN("im_open",true,true,"You opened a DM"),
	LINK_SHARED("link_shared",false,true,"A message was posted containing one or more links relevant to your application"),
	MANUAL_PRESENCE_CHANGE("manual_presence_change",true,false,"You manually updated your presence"),
	MEMBER_JOINED_CHANNEL("member_joined_channel",true,true,"A user joined a public or private channel"),
	MEMBER_LEFT_CHANNEL("member_left_channel",true,true,"A user left a public or private channel"),
	MESSAGE("message",true,true,"A message was sent to a channel"),
	MESSAGE_CHANNELS("message.channels",false,true,"A message was posted to a channel"),
	MESSAGE_GROUPS("message.groups",false,true,"A message was posted to a private channel"),
	MESSAGE_IM("message.im",false,true,"A message was posted in a direct message channel"),
	MESSAGE_MPIM("message.mpim",false,true,"A message was posted in a multiparty direct message channel"),
	PIN_ADDED("pin_added",true,true,"A pin was added to a channel"),
	PIN_REMOVED("pin_removed",true,true,"A pin was removed from a channel"),
	PREF_CHANGE("pref_change",true,false,"You have updated your preferences"),
	PRESENCE_CHANGE("presence_change",true,false,"A member's presence changed"),
	PRESENCE_SUB("presence_sub",true,false,"Subscribe to presence events for the specified users"),
	REACTION_ADDED("reaction_added",true,true,"A member has added an emoji reaction to an item"),
	REACTION_REMOVED("reaction_removed",true,true,"A member removed an emoji reaction"),
	RECONNECT_URL("reconnect_url",true,false,"Experimental"),
	RESOURCES_ADDED("resources_added",false,true,"Access to a set of resources was granted for your app"),
	RESOURCES_REMOVED("resources_removed",false,true,"Access to a set of resources was removed for your app"),
	SCOPE_DENIED("scope_denied",false,true,"OAuth scopes were denied to your app"),
	SCOPE_GRANTED("scope_granted",false,true,"OAuth scopes were granted to your app"),
	STAR_ADDED("star_added",true,true,"A member has starred an item"),
	STAR_REMOVED("star_removed",true,true,"A member removed a star"),
	SUBTEAM_CREATED("subteam_created",true,true,"A User Group has been added to the workspace"),
	SUBTEAM_MEMBERS_CHANGED("subteam_members_changed",true,true,"The membership of an existing User Group has changed"),
	SUBTEAM_SELF_ADDED("subteam_self_added",true,true,"You have been added to a User Group"),
	SUBTEAM_SELF_REMOVED("subteam_self_removed",true,true,"You have been removed from a User Group"),
	SUBTEAM_UPDATED("subteam_updated",true,true,"An existing User Group has been updated or its members changed"),
	TEAM_DOMAIN_CHANGE("team_domain_change",true,true,"The workspace domain has changed"),
	TEAM_JOIN("team_join",true,true,"A new member has joined"),
	TEAM_MIGRATION_STARTED("team_migration_started",true,false,"The workspace is being migrated between servers"),
	TEAM_PLAN_CHANGE("team_plan_change",true,false,"The account billing plan has changed"),
	TEAM_PREF_CHANGE("team_pref_change",true,false,"A preference has been updated"),
	TEAM_PROFILE_CHANGE("team_profile_change",true,false,"The workspace profile fields have been updated"),
	TEAM_PROFILE_DELETE("team_profile_delete",true,false,"The workspace profile fields have been deleted"),
	TEAM_PROFILE_REORDER("team_profile_reorder",true,false,"The workspace profile fields have been reordered"),
	TEAM_RENAME("team_rename",true,true,"The workspace name has changed"),
	TOKENS_REVOKED("tokens_revoked",false,true,"API tokens for your app were revoked."),
	URL_VERIFICATION("url_verification",false,true,"Verifies ownership of an"),
	USER_CHANGE("user_change",true,true,"A member's data has changed"),
	USER_TYPING("user_typing",true,false,"A channel member is typing a message");

	private final String eventType;
	private final boolean rtm;
	private final boolean eventsApi;
	private final String description;

	Events(String eventType, boolean rtm, boolean eventsApi, String description) {
		this.eventType = eventType;
		this.rtm = rtm;
		this.eventsApi = eventsApi;
		this.description = description;
	}

	@Override
	public String getType() {
		return eventType;
	}

	@Override
	public String getDescription() {
		return description;
	}
}
