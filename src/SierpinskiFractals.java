import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Scanner;

import static java.lang.Math.cos;
import static java.lang.Math.sqrt;
import static java.lang.Math.toRadians;

/**
 * Created by michal on 21.05.17.
 */

public class SierpinskiFractals extends JPanel //implements Cloneable
{

    protected final int dimension = 600;
    protected final int margin = 20;
    protected final double degrees072 = toRadians(72);
    protected final double scaleFactor = 1 / (2 + cos(degrees072) * 2);
    protected int limit = dimension;


    public SierpinskiFractals()
    {
        setPreferredSize(new Dimension(dimension + 2 * margin, dimension + 2 * margin));
        setBackground(Color.black);
        setForeground(Color.orange);

        new Timer(1000, (ActionEvent e) -> {
            limit /= 2;
            if (limit <= 3)
                limit = dimension;
            repaint();
        }).start();
    }

    /*public SierpinskiFractals clone() throws CloneNotSupportedException
    {
        return (SierpinskiFractals) super.clone();
    }*/

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("If you want to see Sierpinski's Triangle choice: 1.");
        System.out.println("If you want to see Sierpinski's Carpet choice: 2.");
        System.out.println("If you want to both Sierpinski's fractals choice: 3.");
        //System.out.println("If you want to see Sierpinski's Pentagon choice: 4.");

        int choice = in.nextInt();

        /*SwingUtilities.invokeLater(() -> {
            JFrame f =  new JFrame();
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setTitle("Choice");
            f.setResizable(false);
            f.add(new SierpinskiFractalChoice(), BorderLayout.WEST);
            f.setLocation(300,800);
            //f.setLocationRelativeTo(null);
            f.setSize(400, 200);
            f.pack();
            f.setVisible(true);
        });*/

        switch (choice) {
            case 1: {
                SwingUtilities.invokeLater(() -> {
                    JFrame f = new JFrame();
                    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    f.setTitle("Sierpinski's triangle");
                    f.setResizable(false);
                    f.add(new SierpinskiTriangle(), BorderLayout.CENTER);
                    f.pack();
                    //f.setLocation(200, 200);
                    f.setLocationRelativeTo(null);
                    f.setVisible(true);
                });
                break;
            }
            case 2: {
                SwingUtilities.invokeLater(() -> {
                    JFrame f = new JFrame();
                    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    f.setTitle("Sierpinski's carpet");
                    f.setResizable(false);
                    f.add(new SierpinskiCarpet(), BorderLayout.CENTER);
                    f.pack();
                    //f.setLocation(1000,200);
                    f.setLocationRelativeTo(null);
                    f.setVisible(true);
                });
                break;
            }

            case 3: {
                SwingUtilities.invokeLater(() -> {
                    JFrame f = new JFrame();
                    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    f.setTitle("Sierpinski's fractals");
                    f.setResizable(false);
                    f.add(new SierpinskiTriangle(), BorderLayout.WEST);
                    f.add(new SierpinskiCarpet(), BorderLayout.EAST);
                    f.pack();
                    f.setLocation(300,200);
                    f.setSize(1275,675);
                    f.setVisible(true);
                });
                break;
            }

            /*case 4: {
                SwingUtilities.invokeLater(() -> {
                    JFrame f = new JFrame();
                    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    f.setTitle("Sierpinski Pentagon");
                    f.setResizable(true);
                    f.add(new SierpinskiPentagon(), BorderLayout.CENTER);
                    f.pack();
                    f.setLocationRelativeTo(null);
                    f.setVisible(true);
                });
                break;
            }*/
        }
    }
}

/*class RandomColor
{
    final static double goldenRatioConjugate = (sqrt(5) - 1) / 2;
    private static double hue = Math.random();

    static Color next() {
        hue = (hue + goldenRatioConjugate) % 1;
        return Color.getHSBColor((float) hue, 1, 1);
    }
}*/
