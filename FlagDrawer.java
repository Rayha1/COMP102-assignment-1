// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a COMP102 assignment.
// You may not distribute it in any other way without permission.

/* Code for COMP102 - 2024T1, Assignment 1
 * Name:
 * Username:
 * ID:
 */

import ecs100.*;
import java.awt.Color;

/**
 * Draws various flags
 *
 * You can find lots of flag details (including the correct dimensions and colours)
 * from  http://www.crwflags.com/fotw/flags/
 */

public class FlagDrawer{

    public static final double LEFT = 100;  // the left side of the flags
    public static final double TOP = 50;    // the top of the flags


    /**
     * Draw the flag of the United Arab Emirates.
     * The flag has a vertical red stripe on the left, and
     * three horizontal stripes (green, white, black) on the right.
     * See the assignment for dimensions and details.
     */
    public void drawUAEFlag() {
        UI.clearGraphics();
        UI.println("UAE Flag");
        double width = UI.askDouble("How wide: ");
        double height = width/2;
        //horizontal stripes
        UI.setColor(new Color(0, 151, 57));// green
        UI.fillRect(LEFT, TOP, width, height/3);
        UI.setColor(Color.black);
        UI.fillRect(LEFT, TOP + height * 2/3, width, height/3);
        //vertical stripe
        UI.setColor(Color.red);
        UI.fillRect(LEFT, TOP, width/4, height);
        //outline
        UI.setColor(Color.black);
        UI.drawRect(LEFT, TOP, width, height);
    }

    /**
     * Draw the flag of Greenland.
     * The top half of the flag is white, and the bottom half is red.
     * There is a circle in the middle (off-set to left) which is
     * also half white/red but on the opposite sides.
     * The flag is 2/3 as high as it is wide (ratio 2:3).
     */
    public void drawGreenlandFlag() {
        UI.clearGraphics();
        UI.println("Greenland Flag");
        double width = UI.askDouble("How wide: ");
        double height = width * 2/3;
        double circWidth = width * 4/9; //width of circle
        //horizontal stripe
        UI.setColor(Color.red);
        UI.fillRect(LEFT, TOP + height/2, width, height/2);
        //middle circle
        UI.setColor(Color.red);// bottom
        UI.fillOval(LEFT + width * 3/18, TOP + width * 2/18, circWidth, circWidth);
        UI.setColor(Color.white);//top
        UI.fillArc(LEFT + width * 3/18, TOP + width * 2/18, circWidth, circWidth, 180, 180);
        //outline
        UI.setColor(Color.black);
        UI.drawRect(LEFT, TOP, width, height);
    }
    
    /**
     *  The Czech flag
     *  The flag is 2/3 as high as it is wide (ratio 2:3).
     *  Two horizontal stripes (white and red) with a blue isoceles triangle on the left side.
     *  Note: there is no fillTriangle method in the UI class! Maybe you could use arcs?
     */
    public  void drawCzechFlag(){
        UI.clearGraphics();  
        UI.println("Czech Flag");
        double width = UI.askDouble("How wide: ");
        double height = width * 2/3;
        //left blue bit
        UI.setColor(new Color(17, 69, 126));//blue
        UI.fillRect(LEFT, TOP, width/2, height);
        //bottom red
        UI.setColor(Color.red);
        UI.fillArc(LEFT - width, TOP - height/2, width * 2, width * 2, 0, 33.69);
        //top white
        UI.setColor(Color.white);
        UI.fillArc(LEFT - width, TOP - width, width * 2, width * 2, 326.31, 33.69);
        // bottom red pt2
        UI.setColor(Color.red);
        UI.fillRect(LEFT + width/2, TOP + height/2, width/2, height/2);
        //outline
        UI.setColor(Color.black);
        UI.drawRect(LEFT, TOP, width, height);
    }
    
    /**   CHALLENGE
     * DO NOT DO THIS IF YOU HAVE NOT DONE THE PREVIOUS METHODS
     * Draw the Misubishi Logo.
     */
    public void drawMitsubishiLogo() {
        /*# YOUR CODE HERE */

    }

    /**   CHALLENGE
     * DO NOT DO THIS IF YOU HAVE NOT DONE THE PREVIOUS METHODS
     * Draw the Koru Flag.
     * It was one of the new flag designs for the 2016 referendum,
     * designed by Sven Baker from Wellington
     * The flag is 1/2 as high as it is wide (ratio 1:2).
     */
    public void drawKoruFlag() {
        /*# YOUR CODE HERE */

    }

    public void setupGUI(){
        UI.addButton("Clear", UI::clearPanes);
        UI.addButton("Flag of UAE", this::drawUAEFlag);
        UI.addButton("Flag of Greenland", this::drawGreenlandFlag);
        UI.addButton("Czech Flag", this::drawCzechFlag);        
        UI.addButton("CHALLENGE: Mitsubishi logo", this::drawMitsubishiLogo);        
        UI.addButton("CHALLENGE: Koru Flag", this::drawKoruFlag);
        UI.addButton("Quit", UI::quit);

        UI.setDivider(0.3);
    }

    public static void main(String[] arguments){
        FlagDrawer fd = new FlagDrawer();
        fd.setupGUI();
    }

}
