package ${package}.client.screenmanager.menu;

import ${package}.client.screenmanager.ScreenManager;
import ${package}.client.screenmanager.ScreenManagerInterface;

public class HomeButton extends MenuButton {



    @Override
    public boolean isSelected(ScreenManager.ScreenType screenType) {
        return screenType == ScreenManager.ScreenType.INDEX;
    }

    public HomeButton(ScreenManagerInterface screenManager) {
        super(screenManager);
        this.setText("HOME");
        initButton(ScreenManager.ScreenType.INDEX);
    }
}
