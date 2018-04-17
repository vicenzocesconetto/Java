import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Panel extends JPanel{

    public static void main(String[] args) {

        JFrame frame = new JFrame("attempt");
        Panel panel = new Panel();

        frame.getContentPane().add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
        frame.setVisible(true);
//        frame.repaint();
    }

    public void paintComponent(Graphics g) {
//        File file = new File("testpic.jpg");
        Image image = new ImageIcon(getClass().getResource("testpic.jpg")).getImage();
//        Image image = new ImageIcon("testpic.jpg").getImage();
        g.drawImage(image, 3, 4, this);
    }
}
