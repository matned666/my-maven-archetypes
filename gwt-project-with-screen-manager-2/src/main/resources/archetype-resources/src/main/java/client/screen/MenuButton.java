package ${package}.client.screen;

import com.google.gwt.user.client.ui.Widget;

/**
 * Main menu buttons listed in {@link ContentType}
 */
public interface MenuButton {

    void select();

    void deselect();

    Widget getWidget();
}
