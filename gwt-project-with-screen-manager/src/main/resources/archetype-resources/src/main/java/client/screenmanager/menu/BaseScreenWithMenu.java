package ${package}.client.screenmanager.menu;

import com.google.gwt.user.client.ui.VerticalPanel;
import ${package}.client.screenmanager.BaseScreen;
import ${package}.client.screenmanager.ScreenManagerInterface;

import java.util.LinkedList;
import java.util.List;

public abstract class BaseScreenWithMenu extends BaseScreen {


    private VerticalPanel menuPanel;
    private List<MenuButton> widgets;

    public BaseScreenWithMenu(ScreenManagerInterface screenManager) {
        super(screenManager);
        initialize();
    }

    private void initialize() {
        widgets = new LinkedList<>();
        widgets.add(new HomeButton(screenManager));
        widgets.add(new OrdersButton(screenManager));
        widgets.add(new AboutButton(screenManager));
        widgets.add(new ContactButton(screenManager));
        menuPanel = new VerticalPanel();
        addButtons();
        menuPanel.getElement().setClassName("menu-bar buttons-bar");
        addWidget(menuPanel);
    }

    protected void addButtons() {
        widgets.forEach(x -> {
            menuPanel.add(x);
            if (x.isSelected(screenManager.screenType())) {
                x.getElement().setClassName("button selected");
            }
        });
    }


}
