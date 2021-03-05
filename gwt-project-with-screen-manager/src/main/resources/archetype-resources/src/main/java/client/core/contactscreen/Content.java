package ${package}.client.core.contactscreen;

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
        title.setText("CONTACT SCREEN");
        title.getElement().setClassName("title");
        this.add(title);
    }

    private void initDescription(){
        HTML html = new HTML();
        html.setHTML("<br>" +
                "<p>Developer address and contact</p> " +
                "<p>+48 666 666 666</p>" +
                "<p>info@info-mail.com</p>" +
                "<p>Wrocław</p> <br>" +
                "");
        html.getElement().setClassName("simple-centered-text");
        this.add(html);
    }
}
