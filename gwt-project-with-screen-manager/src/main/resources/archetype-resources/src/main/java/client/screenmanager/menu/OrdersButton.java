package ${package}.client.screenmanager.menu;

import ${package}.client.screenmanager.ScreenManager;
import ${package}.client.screenmanager.ScreenManagerInterface;

public class OrdersButton extends MenuButton {

    @Override
    public boolean isSelected(ScreenManager.ScreenType screenType) {
        return screenType == ScreenManager.ScreenType.ORDERS;
    }

    public OrdersButton(ScreenManagerInterface screenManager) {
        super(screenManager);
        this.setText("ORDERS");
        initButton(ScreenManager.ScreenType.ORDERS);
    }
}
