import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Write a description of class MyHelloApp here.
 *
 * @author (2017210105 김민수, 2019315066 사사키야스오)
 * @version (2020.11.23)
 */
public class MyHelloPanelListener extends JPanel implements MouseListener, MouseMotionListener, KeyListener
{
    JLabel ml;
    public MyHelloPanelListener()
    {
        ml = new JLabel("HELLO");
        this.setLayout(null);
        ml.setLocation(50, 50);
        ml.setSize(100, 20);
        this.add(ml);

        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        this.addKeyListener(this);
    }

    public void mouseEntered(MouseEvent e)
    {
        ml.setText("Start");
        this.setBackground(Color.YELLOW);
    }

    public void mouseExited(MouseEvent e)
    {
        ml.setText("End");
        this.setBackground(Color.GRAY);
    }

    public void keyPressed(KeyEvent e)
    {
        int keyCode = e.getKeyCode();
        switch(keyCode)
        {
            case KeyEvent.VK_UP:
            ml.setLocation(ml.getX(), ml.getY() - 10);
            break;
            case KeyEvent.VK_DOWN:
            ml.setLocation(ml.getX(), ml.getY() + 10);
            break;
            case KeyEvent.VK_LEFT:
            ml.setLocation(ml.getX() - 10, ml.getY());            
            break;
            case KeyEvent.VK_RIGHT:
            ml.setLocation(ml.getX() + 10, ml.getY());            
            break;
        }
    }

    public void keyReleased(KeyEvent e){}

    public void keyTyped(KeyEvent e){}

    public void mouseMoved(MouseEvent e){}

    public void mouseDragged(MouseEvent e){}

    public void mouseReleased(MouseEvent e){}

    public void mousePressed(MouseEvent e){}

    public void mouseClicked(MouseEvent e){}
}
