import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;

/**
 * Created by michal on 02.06.17.
 */

public class SierpinskiFractalChoice extends SierpinskiFractals
{

    public void paintComponent(Graphics gg)
    {
        Graphics2D g = (Graphics2D) gg;

        String message1 = "If you want to see Sierpinski's Triangle choice: 1.";
        String message2 = "If you want to see Sierpinski's Carpet choice: 2.";
        String message3 = "If you want to see Sierpinski's pentagon choice: 3.";
        String message4 = "If you want to both Sierpinski's fractals choice: 4.";

        Font f = new Font("Arial", Font.BOLD, 16);
        g.setFont(f);
        FontRenderContext context = g.getFontRenderContext();

        Rectangle2D bounds1 = f.getStringBounds(message1, context);
        Rectangle2D bounds2 = f.getStringBounds(message2, context);
        Rectangle2D bounds3 = f.getStringBounds(message3, context);
        Rectangle2D bounds4 = f.getStringBounds(message4, context);

        double x1 = (getWidth() - bounds1.getWidth() / 2 - 350);
        double y1 = (getHeight() - bounds1.getHeight() / 2 - 600);

        double x2 = (getWidth() - bounds2.getWidth() / 2 - 360);
        double y2 = (getHeight() - bounds2.getHeight() / 2 - 550);

        double x3 = (getWidth() - bounds3.getWidth() / 2 - 360);
        double y3 = (getHeight() - bounds3.getHeight() / 2 - 500);

        double x4 = (getWidth() - bounds4.getWidth() / 2 - 350);
        double y4 = (getHeight() - bounds4.getHeight() / 2 - 450);

        g.drawString(message1, (int) x1, (int) y1);
        g.drawString(message2, (int) x2, (int) y2);
        g.drawString(message3, (int) x3, (int) y3);
        g.drawString(message3, (int) x4, (int) y4);
        g.setPaint(Color.BLACK);
    }

}
