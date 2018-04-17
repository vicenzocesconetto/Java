import javax.swing.*;
import java.awt.event.*;

public class SecondGUI /*implements ActionListener */{
    private JButton button;
    RandGradCircle test = new RandGradCircle();
//    PanelPicTest picture = new PanelPicTest();

    public static void main(String[] args) {
        SecondGUI gui = new SecondGUI();
        gui.start();
    }

    public void start() {
        JFrame frame = new JFrame("This is the title, mah boy");
//        button = new JButton("clicky McClickface");

//        button.addActionListener(this);

        frame.getContentPane().add(test);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        frame.setVisible(true);
    }


//    public void actionPerformed(ActionEvent event) {
//        button.setText("Whoa, you pressed me!");
//    }


}
