package ${package}.client.screen.content;

import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.user.client.ui.Widget;
import ${package}.client.screen.ContentType;

/**
 * Screen content Interface
 */
public interface Content {

    Widget getWidget();

    ContentType getContentType();

    void startLoading();

    void stopLoading();

    void onKeyPressed(KeyPressEvent event);
}
