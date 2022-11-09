package ${package}.client.screen;

import com.google.gwt.user.client.ui.RootPanel;
import ${package}.client.model.Model;
import ${package}.client.model.ModelImpl;
import ${package}.client.screen.content.Content;
import ${package}.client.screen.content.MainContent;
import ${package}.client.screen.widget.ScreenWidget;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class ContentManagerImpl implements ContentManager {

    private final Logger logger = Logger.getLogger(ContentManager.class.getName());

    private final Map<ContentType, Content> contentMapByType = new HashMap<>();
    private final Screen screen;
    private final Content initContent;

    public ContentManagerImpl() {
        Model model = new ModelImpl();
        initContent = new MainContent(model);
        contentMapByType.put(ContentType.MAIN, initContent);
        screen = new ScreenWidget(this, initContent);
        model.setScreen(screen);
    }

    @Override
    public void start(){
        RootPanel.get().add(screen.getWidget());
        logger.info("Start");
    }

    @Override
    public void setContent(ContentType contentType) {
        Content content = contentMapByType.get(contentType);
        if (content == null) {
            content = contentType.createNewContent(initContent);
        }
        screen.setContent(content);
    }

    @Override
    public Screen getScreen() {
        return screen;
    }

}

