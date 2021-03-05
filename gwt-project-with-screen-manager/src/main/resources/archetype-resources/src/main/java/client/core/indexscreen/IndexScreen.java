package ${package}.client.core.indexscreen;

import ${package}.client.screenmanager.ScreenManager;
import ${package}.client.screenmanager.menu.BaseScreenWithMenu;
import ${package}.client.screenmanager.ScreenManagerInterface;
import ${package}.client.screenmanager.screencontent.BaseContent;

public class IndexScreen extends BaseScreenWithMenu implements IndexScreenInterface{

    private BaseContent content;
    private boolean isActive;

    public IndexScreen(ScreenManagerInterface screenManager) {
        super(screenManager);
        screenType = ScreenManager.ScreenType.INDEX;
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
