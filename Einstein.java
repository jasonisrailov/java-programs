/*
Einstein.java
Demononstrates a basic Applet
Page 101 in AP Java book.
*/

import java.applet.Applet;
import java.awt.*;
public class Einstein extends Applet
{
    //Draws a quotation by Albert Einstein among some shapes
    public void paint (Graphics page)
    {
        page.drawRect(50, 50, 40, 40); // square (x, y, width, height)
        page.drawRect(60, 80, 225, 30); // rectangle (x, y, width, height)
        page.drawOval(75, 65, 20, 20); // circle (x, y, width, height)
        page.drawLine(35, 60, 100, 120); // line line( x1, y1, x2, y2)
        //line(starts point [x1 and y1] and end point [x2 and y2])

        page.drawString("Out of clutter, find simplicity.", 110, 70);
        page.drawString("-- Albert Einstein", 130, 100);

    }
} // End of class
