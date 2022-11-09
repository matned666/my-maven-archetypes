package ${package}.client.screen;

import ${package}.client.screen.content.SecondContent;
import ${package}.client.screen.content.ThirdContent;
import ${package}.client.screen.content.Content;
import ${package}.client.screen.widget.MenuButtonWidget;

/**
 * Content type displayed on a screen
 */
public enum ContentType {
    MAIN(),
    SECOND(),
    THIRD();

    public MenuButtonWidget createMenuButton(ContentManager screenManager) {
        switch (this) {
            case SECOND: return new MenuButtonWidget(screenManager, SECOND);
            case MAIN: return new MenuButtonWidget(screenManager, MAIN);
            default: return new MenuButtonWidget(screenManager, THIRD);
        }
    }

    public Content createNewContent(Content initContent) {
        switch (this) {
            case SECOND:
                return new SecondContent();
            case THIRD:
                return new ThirdContent();
            default:
                return initContent;
        }
    }


}
