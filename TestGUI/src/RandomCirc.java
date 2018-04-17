import javax.swing.*;
import java.awt.*;

public class RandomCirc extends JPanel{
    @Override
    public void paintComponent(Graphics g) {
        g.fillRect(0, 0, this.getWidth(), this.getHeight());

        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color rdcolor = new Color(red, green, blue);

        g.setColor(rdcolor);

        g.fillOval(70, 70, 100, 100);
    }
}
