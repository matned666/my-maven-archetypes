package ${package}.client.screen.widget;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Widget;
import ${package}.client.screen.ContentManager;
import ${package}.client.screen.ContentType;
import ${package}.client.screen.MenuButton;

public class MenuButtonWidget extends Button implements MenuButton {


    public MenuButtonWidget(ContentManager screenManager, ContentType contentType) {
        getElement().setInnerText(contentType.name());
        getElement().setClassName("button not-selected");
        addClickHandler(event-> {
            screenManager.setContent(contentType);
            screenManager.getScreen().setSelectedButton(contentType);
        });
    }

    @Override
    public void select() {
        getElement().setClassName("button selected");
    }

    @Override
    public void deselect() {
        getElement().setClassName("button not-selected");
    }

    @Override
    public Widget getWidget(){
        return this;
    }
}
