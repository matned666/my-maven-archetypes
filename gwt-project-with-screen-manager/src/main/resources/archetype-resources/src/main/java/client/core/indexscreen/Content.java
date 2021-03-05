package ${package}.client.core.indexscreen;

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
        title.setText("HOME SCREEN");
        title.getElement().setClassName("title");
        this.add(title);
    }

    private void initDescription(){
        HTML html = new HTML();
        html.setHTML("" +
                "<p>This a sample Home page</p>" +
                "<p>Change whatever you wish.</p>" +
                "<br>" +
                "<p>Enjoy.</p> <br>" +
                "");
        html.getElement().setClassName("simple-centered-text");
        this.add(html);
    }
}
