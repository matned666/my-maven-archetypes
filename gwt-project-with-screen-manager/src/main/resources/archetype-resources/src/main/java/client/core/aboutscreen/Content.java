package ${package}.client.core.aboutscreen;

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
        title.setText("ABOUT SCREEN");
        title.getElement().setClassName("title");
        this.add(title);
    }

    private void initDescription(){
        HTML html = new HTML();
        html.setHTML("<br>" +
                "<p>Developer matned666</p> " +
                "<p>Sample archetype for menu based programs</p>" +
                "<br>" +
                "<p></p> <br>" +
                "");
        html.getElement().setClassName("simple-centered-text");
        this.add(html);
    }
}
