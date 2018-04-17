import javax.swing.*;
import java.awt.*;

public class PanelPicTest extends JPanel{

    @Override
    public void paintComponent(Graphics g) {
        Image pic = new ImageIcon("testpic.jpg").getImage();

        g.drawImage(pic, 3, 4, this);
    }
}
