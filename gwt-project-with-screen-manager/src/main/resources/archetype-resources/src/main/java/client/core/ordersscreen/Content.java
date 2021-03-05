package ${package}.client.core.ordersscreen;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import ${package}.client.screenmanager.screencontent.BaseContent;

public class Content extends BaseContent {

    public Content() {
        initTitle();
        initDescription();
    }

    private void initTitle(){
        Label title = new Label();
        title.setText("ORDERS SCREEN");
        title.getElement().setClassName("title");
        this.add(title);
    }

    private void initDescription(){
        HTML html = new HTML();
        html.setHTML("<br>" +
                "<p>This is just a sample page with orders table</p> <br>" +
                "<br>" +
                "<p></p> <br>" +
                "");
        html.getElement().setClassName("simple-centered-text");
        this.add(html);
    }
}
