import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class MyHelloApp here.
 *
 * @author (2017210105 김민수, 2019315066 사사키야스오)
 * @version (2020.11.23)
 */
public class MyHelloFrame extends JFrame
{
    public MyHelloFrame()
    {
        this.setTitle("(2020.11.23)");
        this.setSize(400, 300);
        
        MyHelloPanelListener mhpl = new MyHelloPanelListener();
        this.add(mhpl);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
