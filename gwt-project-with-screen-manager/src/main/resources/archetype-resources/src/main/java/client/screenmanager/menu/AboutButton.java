package ${package}.client.screenmanager.menu;

import ${package}.client.screenmanager.ScreenManager;
import ${package}.client.screenmanager.ScreenManagerInterface;

public class AboutButton extends MenuButton {

    @Override
    public boolean isSelected(ScreenManager.ScreenType screenType) {
        return screenType == ScreenManager.ScreenType.ABOUT;
    }

    public AboutButton(ScreenManagerInterface screenManager) {
        super(screenManager);
        this.setText("ABOUT");
        initButton(ScreenManager.ScreenType.ABOUT);
    }
}
