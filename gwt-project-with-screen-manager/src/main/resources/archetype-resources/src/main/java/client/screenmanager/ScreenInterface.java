package ${package}.client.screenmanager;

import ${package}.client.screenmanager.screencontent.BaseContent;

public interface ScreenInterface {

    void show();
    void hide();
    ScreenManager.ScreenType getScreenType();
    boolean isActive();
    void setActive(boolean status);
    BaseContent content();

}
