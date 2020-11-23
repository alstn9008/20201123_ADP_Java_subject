import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Write a description of class MyHelloApp here.
 *
 * @author (2017210105 김민수, 2019315066 사사키야스오)
 * @version (2020.11.23)
 */
public class MyHelloPanelListener extends JPanel implements MouseListener, MouseMotionListener
{
    JLabel ml;
    public MyHelloPanelListener()
    {
        ml = new JLabel("No Mouse Event");
        this.add(ml);

        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    public void mouseEntered(MouseEvent e)
    {
        ml.setText("mouseEntered(" + e.getX() + ", " + e.getY() + ")");
        this.setBackground(Color.YELLOW);
    }

    public void mouseExited(MouseEvent e)
    {
        ml.setText("mouseExited(" + e.getX() + ", " + e.getY() + ")");
        this.setBackground(Color.GRAY);
    }

    public void mouseMoved(MouseEvent e)
    {
        ml.setText("mouseMoved(" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseDragged(MouseEvent e)
    {
        ml.setText("mouseDragged(" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseReleased(MouseEvent e)
    {
        ml.setText("mouseReleased(" + e.getX() + ", " + e.getY() + ")");
    }

    public void mousePressed(MouseEvent e){}
    
    public void mouseClicked(MouseEvent e){}
}
