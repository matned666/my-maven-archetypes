package ${package}.client.screen.widget;

import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import ${package}.client.screen.ContentManager;
import ${package}.client.screen.ContentType;
import ${package}.client.screen.MenuButton;
import ${package}.client.screen.Screen;
import ${package}.client.screen.content.Content;

import java.util.HashMap;
import java.util.Map;

public class ScreenWidget extends Composite implements Screen {

    private final VerticalPanel grid = new VerticalPanel();
    private final HorizontalPanel mainGrid;
    private final Map<ContentType, MenuButton> buttonsMap = new HashMap<>();
    private final ContentManager screenManager;
    private Content content;
    private HorizontalPanel menuPanel;

    public ScreenWidget(ContentManager screenManager, Content initContent) {
        this.screenManager = screenManager;
        this.content = initContent;
        mainGrid = new HorizontalPanel();
        mainGrid.getElement().setClassName("menu-bar left");
        initButtons();
        mainGrid.add(menuPanel);
        grid.add(mainGrid);
        grid.add(content.getWidget());
        initWidget(grid);
        addDomHandler(event -> content.onKeyPressed(event), KeyPressEvent.getType());
    }

    private void initButtons() {
        menuPanel = new HorizontalPanel();
        menuPanel.getElement().setClassName("menu-bar buttons-bar");
        for (ContentType contentType : ContentType.values()) {
            MenuButton button = contentType.createMenuButton(screenManager);
            if (content.getContentType() == contentType) {
                button.select();
            }
            menuPanel.add(button.getWidget());
            buttonsMap.put(contentType, button);
        }
    }

    @Override
    public void setContent(Content content) {
        grid.remove(this.content.getWidget());
        this.content = content;
        grid.add(this.content.getWidget());
    }

    @Override
    public Widget getWidget() {
        return this;
    }

    @Override
    public void setSelectedButton(ContentType contentType) {
        buttonsMap.values().forEach(MenuButton::deselect);
        buttonsMap.get(contentType).select();
    }

    @Override
    public void showErrorMessage(String message) {
        Window.alert(message);
    }

    @Override
    public void startLoading() {
        content.startLoading();
    }

    @Override
    public void stopLoading() {
        content.stopLoading();
    }

}
