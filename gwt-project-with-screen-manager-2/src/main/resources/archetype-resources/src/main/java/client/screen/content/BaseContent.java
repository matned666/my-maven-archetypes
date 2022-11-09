package ${package}.client.screen.content;

import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Widget;
import ${package}.client.screen.ContentType;

import java.util.logging.Logger;

public abstract class BaseContent extends FlowPanel implements Content{
    protected static final Logger logger = java.util.logging.Logger.getLogger("Content");

    protected ContentType contentType;

    public BaseContent(ContentType contentType) {
        this.contentType = contentType;
        initTitle();
    }

    private void initTitle(){
        HTML html = new HTML();
        html.setHTML("<h3>"+contentType.name()+"</h3>");
        add(html);
    }

    @Override
    public ContentType getContentType() {
        return contentType;
    }

    @Override
    public Widget getWidget() {
        return this;
    }

    @Override
    public void startLoading() {

    }

    @Override
    public void stopLoading() {

    }

    @Override
    public void onKeyPressed(KeyPressEvent event) {

    }
}
