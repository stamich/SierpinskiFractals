import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created by michal on 07.06.17.
 */
public class SierpinskiFractals extends JPanel
{

    protected final int dimension = 600;
    protected final int margin = 20;
    protected int limit = dimension;

    public SierpinskiFractals()
    {
        setPreferredSize(new Dimension(dimension + 2 * margin, dimension+ 2 * margin));
        setBackground(Color.black);
        setForeground(Color.orange);

        new Timer(1000, (ActionEvent e) -> {
            limit /= 2;
            if (limit <= 2)
                limit = dimension;
            repaint();
        }).start();
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() -> {
            JFrame f = new JFrame();
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setTitle("Sierpinski triangle");
            f.setResizable(false);
            f.add(new SierpinskiTriangle(), BorderLayout.CENTER);
            f.pack();
            f.setLocationRelativeTo(null);
            f.setVisible(true);
        });

        SwingUtilities.invokeLater(() ->{
            JFrame f = new JFrame();
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setTitle("Sierpinski carpet");
            f.setResizable(false);
            f.add(new SierpinskiCarpet(), BorderLayout.CENTER);
            f.pack();
            f.setLocationRelativeTo(null);
            f.setVisible(true);
        });
    }
}
