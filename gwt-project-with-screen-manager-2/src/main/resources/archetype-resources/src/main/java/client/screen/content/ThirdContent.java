package ${package}.client.screen.content;

import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.user.client.ui.HTML;
import ${package}.client.screen.ContentType;

public class ThirdContent extends BaseContent {

    public ThirdContent() {
        super(ContentType.THIRD);
        initDescription();
    }

    private void initDescription(){
        HTML html = new HTML();
        html.setHTML("<br>" +
                "<p></p> " +
                "<p></p>" +
                "<br>" +
                "<p></p> <br>" +
                "");
        this.add(html);
    }

    @Override
    public void onKeyPressed(KeyPressEvent event) {
        logger.info("Key on ThirdContent panel pressed: " + event.getCharCode());
    }
}
