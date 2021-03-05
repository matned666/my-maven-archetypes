package ${package}.client.screenmanager.screencontent;

import com.google.gwt.user.client.ui.FlowPanel;

public abstract class BaseContent extends FlowPanel {

    public BaseContent() {
        this.getElement().setClassName("content");
    }
}
