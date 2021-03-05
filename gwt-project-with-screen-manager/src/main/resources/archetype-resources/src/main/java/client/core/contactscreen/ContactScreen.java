package ${package}.client.core.contactscreen;

import ${package}.client.screenmanager.ScreenManager;
import ${package}.client.screenmanager.menu.BaseScreenWithMenu;
import ${package}.client.screenmanager.ScreenManagerInterface;
import ${package}.client.screenmanager.screencontent.BaseContent;

public class ContactScreen extends BaseScreenWithMenu implements ContactScreenInterface{

    private BaseContent content;
    private boolean isActive;

    public ContactScreen(ScreenManagerInterface screenManager) {
        super(screenManager);
        screenType = ScreenManager.ScreenType.CONTACT;
        isActive = false;
        this.content = new Content();
        this.addWidget(content);
    }

    @Override
    public ScreenManager.ScreenType getScreenType() {
        return screenType;
    }

    @Override
    public boolean isActive() {
        return isActive;
    }

    @Override
    public void setActive(boolean status) {
        isActive = status;
    }

    @Override
    public BaseContent content() {
        return content;
    }
}
