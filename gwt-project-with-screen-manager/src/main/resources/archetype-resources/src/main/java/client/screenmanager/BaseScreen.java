package ${package}.client.screenmanager;

import com.google.gwt.user.client.ui.*;

public abstract class BaseScreen  extends Composite implements ScreenInterface {

    protected ScreenManagerInterface screenManager;
    private final HorizontalPanel mainGrid;
    protected ScreenManager.ScreenType screenType;

    public BaseScreen(ScreenManagerInterface screenManager) {
        this.screenManager = screenManager;
        mainGrid = new HorizontalPanel();
        mainGrid.getElement().setClassName("menu-bar left");
        initWidget(mainGrid);
    }

    @Override
    public void show() {
        RootPanel.get().add(this);
    }

    @Override
    public void hide() {
        RootPanel.get().remove(this);
    }



    protected void addWidget(Widget widget){
        mainGrid.add(widget);
    }

}
