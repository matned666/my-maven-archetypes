package ${package}.client.screenmanager.menu;

import ${package}.client.screenmanager.ScreenManager;
import ${package}.client.screenmanager.ScreenManagerInterface;

public class ContactButton extends MenuButton {

    @Override
    public boolean isSelected(ScreenManager.ScreenType screenType) {
        return screenType == ScreenManager.ScreenType.CONTACT;
    }

    public ContactButton(ScreenManagerInterface screenManager) {
        super(screenManager);
        this.setText("CONTACT");
        initButton(ScreenManager.ScreenType.CONTACT);
    }
}
