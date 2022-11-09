package ${package}.client;

import com.google.gwt.core.client.EntryPoint;
import ${package}.client.screen.ContentManager;
import ${package}.client.screen.ContentManagerImpl;

import java.util.logging.Logger;

public class App implements EntryPoint {
    Logger logger = java.util.logging.Logger.getLogger("App");


    @Override
    public void onModuleLoad() {
        ContentManager cm = new ContentManagerImpl();
        cm.start();
        logger.info("START APP");
    }
}
