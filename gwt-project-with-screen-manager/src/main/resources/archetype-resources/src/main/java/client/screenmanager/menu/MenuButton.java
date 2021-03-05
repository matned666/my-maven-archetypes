package ${package}.client.screenmanager.menu;

import com.google.gwt.user.client.ui.Button;
import ${package}.client.screenmanager.ScreenManager;
import ${package}.client.screenmanager.ScreenManagerInterface;

public abstract class MenuButton extends Button {

    private ScreenManagerInterface screenManager;

    public abstract boolean isSelected(ScreenManager.ScreenType screenType);

    public MenuButton(ScreenManagerInterface screenManager) {
        this.screenManager = screenManager;
    }

    protected void initButton(ScreenManager.ScreenType screenType){
        this.getElement().setClassName("button not-selected");
        this.addClickHandler(x-> screenManager.initializeScreen(screenType));
    }

}
