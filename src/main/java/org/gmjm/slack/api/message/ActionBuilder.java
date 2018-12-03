package org.gmjm.slack.api.message;

import java.util.List;

/**
 * ActionBuilder is used to build up an Action for inclusion in a AttachmentBuilder.
 * <p>
 *     https://api.slack.com/docs/message-buttons
 *     https://api.slack.com/docs/interactive-message-field-guide
 * </p>
 */
public interface ActionBuilder {

  enum ActionType { BUTTON, SELECT}

  enum Style { DEFAULT, PRIMARY, DANGER }

  enum DataSource { STATIC, USERS, CHANNELS, CONVERSATIONS, EXTERNAL}

  /**
   * Provide a string to give this specific action a name. The name will be returned to your Action
   * URL along with the message's callback_id when this action is invoked. Use it to identify this
   * particular response path. If multiple actions share the same name, only one of them can be in
   * a triggered state.
   *
   * @param name The name to set.
   * @return this
   */
  ActionBuilder setName(String name);

  /**
   *
   * Used only with message buttons, this decorates buttons with extra visual importance, which is
   * especially useful when providing logical default action or highlighting a destructive activity.
   *
   * DEFAULT — Yes, it's the default. Buttons will look simple.<br>
   *
   * PRIMARY — Use this sparingly, when the button represents a key action to accomplish. You should
   *  probably only ever have one primary button within a set.<br>
   *
   * DANGER — Use this when the consequence of the button click will result in the destruction of
   *  something, like a piece of data stored on your servers. Use even more sparingly than primary.<br>
   *
   * @param style The style enum to set.
   * @return this
   */
  ActionBuilder setStyle(Style style);

  /**
   *
   * Used only with message buttons, this decorates buttons with extra visual importance, which is
   * especially useful when providing logical default action or highlighting a destructive activity.
   *
   * default — Yes, it's the default. Buttons will look simple.<br>
   *
   * primary — Use this sparingly, when the button represents a key action to accomplish. You should
   *  probably only ever have one primary button within a set.<br>
   *
   * danger — Use this when the consequence of the button click will result in the destruction of
   *  something, like a piece of data stored on your servers. Use even more sparingly than primary.<br>
   *
   * @param style The style to set.
   * @return this
   */
  ActionBuilder setStyle(String style);

  /**
   * The user-facing label for the message button or menu representing this action. Cannot contain
   * markup. Best to keep these short and decisive. Use a maximum of 30 characters or so for best
   * results across form factors.
   *
   * @param text The text to set.
   * @return this
   */
  ActionBuilder setText(String text);

  /**
   * Provide button when this action is a message button or provide select when the action is a
   * message menu.
   *
   * @param type The type to set.
   * @return this
   */
  ActionBuilder setType(ActionType type);

  /**
   * Provide a string identifying this specific action. It will be sent to your Action URL along
   * with the name and attachment's callback_id. If providing multiple actions with the same name,
   * value can be strategically used to differentiate intent. Your value may contain up to 2000
   * characters.
   *
   * @param value The value to set.
   * @return this
   */
  ActionBuilder setValue(String value);

  ActionBuilder setConfirm(
      String title,
      String text,
      String okText,
      String dismissText);

  /**
   * Adds an option to the action builder.
   *
   * Used only with message menus. The individual options to appear in this menu, provided as an
   * array of option fields. Required when data_source is static or otherwise unspecified. A maximum
   * of 100 options can be provided in each menu.
   *
   * @param option The option to add.
   * @return this
   */
  ActionBuilder addOption(Option option);

  /**
   * Adds one or more options to the action builder.
   *
   * Used only with message menus. The individual options to appear in this menu, provided as an
   * array of option fields. Required when data_source is static or otherwise unspecified. A maximum
   * of 100 options can be provided in each menu.
   *
   * @param options The options to add.
   * @return this
   */
  ActionBuilder addOptions(Option ... options);

  /**
   * Adds one or more options to the action builder.
   *
   * Used only with message menus. The individual options to appear in this menu, provided as an
   * array of option fields. Required when data_source is static or otherwise unspecified. A maximum
   * of 100 options can be provided in each menu.
   *
   * @param options The options to add.
   * @return this
   */
  ActionBuilder addOptions(List<Option> options);

  /**
   * Sets one or more options on this action.  This will override any previous options set on this
   * action.
   *
   * Used only with message menus. The individual options to appear in this menu, provided as an
   * array of option fields. Required when data_source is static or otherwise unspecified. A maximum
   * of 100 options can be provided in each menu.
   *
   * @param options The option to set.
   * @return this
   */
  ActionBuilder setOptions(List<Option> options);

  /**
   * Sets the Options using the Options interface so that options can be dynamically supplied.
   *
   * Used only with message menus. The individual options to appear in this menu, provided as an
   * array of option fields. Required when data_source is static or otherwise unspecified. A maximum
   * of 100 options can be provided in each menu.
   *
   * @param options The option to set.
   * @return this
   */
  ActionBuilder setOptions(Options options);

  /**
   * If provided, this option will be set as the pre-selected option.
   *
   * @param options The preselected options.
   * @return this
   */
  ActionBuilder setSelectedOptions(Options options);

  /**
   * Sets the OptionGroups on this action.  Will replace any Options that have been set.
   *
   * Used only with message menus. An alternate, semi-hierarchal way to list available options.
   * Provide an array of option group definitions. This replaces and supersedes the options array.
   *
   * @param optionGroups The optionGroups to set.
   * @return this
   */
  ActionBuilder setOptionGroups(List<OptionGroup> optionGroups);

  /**
   * Accepts STATIC, USERS, CHANNELS, CONVERSATIONS, or EXTERNAL. Our clever default behavior is
   * default, which means the menu's options are provided directly in the posted message under
   * options. Defaults to STATIC.
   *
   * @param dataSource The data source
   * @return this
   */
  ActionBuilder setDataSource(DataSource dataSource);

  /**
   * Accepts static, users, channels, conversations, or external. Our clever default behavior is
   * default, which means the menu's options are provided directly in the posted message under
   * options. Defaults to static. Example: "channels"
   *
   * @param dataSource The data source
   * @return this
   */
  ActionBuilder setDataSource(String dataSource);

  /**
   * Only applies when data_source is set to external. If present, Slack will wait till the
   * specified number of characters are entered before sending a request to your app's external
   * suggestions API endpoint. Defaults to 1.
   *
   * @param minQueryLength The minimum query length
   * @return this
   */
  ActionBuilder setMinQueryLength(int minQueryLength);

  /**
   * Sets an arbitrary key, value pair on the action.
   *
   * This should only be used in cases where the API has not been updated to
   * support a new feature.  Try to avoid using this.
   *
   * @param key The key of the attribute that will be added to the action.
   * @param value The value of the attribute that will be added to the action.
   * @return this
   */
  ActionBuilder setAttribute(String key, Object value);

  /**
   * Build the current ActionBuilder state into an immutable Action object.
   *
   * @return an immutable Action object.
   */
  Action build();

}
