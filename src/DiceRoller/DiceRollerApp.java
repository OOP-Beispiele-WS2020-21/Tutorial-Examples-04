package DiceRoller;

import de.ur.mi.oop.app.GraphicsApp;
import de.ur.mi.oop.colors.Color;
import de.ur.mi.oop.colors.Colors;
import de.ur.mi.oop.launcher.GraphicsAppLauncher;

public class DiceRollerApp extends GraphicsApp {

    // Width, height and background color for canvas
    private static final int CANVAS_WIDTH = 950;
    private static final int CANVAS_HEIGHT = 200;
    private static final Color CANVAS_BACKGROUND = Colors.WHITE;

    @Override
    public void initialize() {
        setCanvasSize(CANVAS_WIDTH, CANVAS_HEIGHT);
    }


    @Override
    public void draw() {
        drawBackground(CANVAS_BACKGROUND);
    }


    public static void main(String[] args) {
        GraphicsAppLauncher.launch();
    }
}
