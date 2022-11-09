package ${package}.client.model;

import ${package}.client.screen.Screen;

import java.util.logging.Logger;

public class ModelImpl implements Model {
    private static final Logger logger = Logger.getLogger("ModelImpl");

    private Screen screen;

    public ModelImpl() {
    }


    @Override
    public void setScreen(Screen screen) {
        this.screen = screen;
    }
}
