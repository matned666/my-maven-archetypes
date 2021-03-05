package ${package}.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Text;
import com.google.gwt.user.client.ui.RootPanel;
import ${package}.client.screenmanager.ScreenManager;
import ${package}.client.screenmanager.ScreenManagerInterface;


public class App implements EntryPoint
{

    @Override
    public void onModuleLoad() {
        ScreenManagerInterface sm = new ScreenManager();
        sm.start();
    }
}
