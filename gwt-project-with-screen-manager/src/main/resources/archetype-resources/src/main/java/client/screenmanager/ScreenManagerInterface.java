package ${package}.client.screenmanager;

public interface ScreenManagerInterface {

    void start();
    void initializeScreen(ScreenManager.ScreenType screenType);
    ScreenManager.ScreenType screenType();
}
