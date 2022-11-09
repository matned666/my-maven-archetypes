package ${package}.client.screen;

import com.google.gwt.user.client.ui.Widget;
import ${package}.client.screen.content.Content;

/**
 * Main screen Interface
 */
public interface Screen {

    void setContent(Content content);

    Widget getWidget();

    void setSelectedButton(ContentType contentType);

    void showErrorMessage(String message);

    void startLoading();

    void stopLoading();
}
