import javax.swing.*;
import java.awt.*;

public class PanelTest extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.red);

        g.fillRect(20, 50, 100, 100);
    }
}
