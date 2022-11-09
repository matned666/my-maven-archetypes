package ${package}.client.screen.content;

import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.user.client.ui.HorizontalPanel;
import ${package}.client.model.Model;
import ${package}.client.screen.ContentType;
import ${package}.client.screen.content.BaseContent;

public class MainContent extends BaseContent {

    private final Model model;

    public MainContent(Model model) {
        super(ContentType.MAIN);
        this.model = model;
        initHorizontalPanel();
        getElement().setClassName("content");
    }

    private void initHorizontalPanel() {
        HorizontalPanel horizontalPanel = new HorizontalPanel();
        add(horizontalPanel);
    }

    @Override
    public void onKeyPressed(KeyPressEvent event) {
        logger.info("Key on Game panel pressed: " + event.getCharCode());
    }
}
