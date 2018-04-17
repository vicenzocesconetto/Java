import javax.swing.*;

public class FirstGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("I'm a button");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); /*Without this line, the app doesn't finish when the window is closed*/

//        System.out.println(JFrame.EXIT_ON_CLOSE); /*Looks like there is a internal code and 3 is for exit on close*/

        frame.getContentPane().add(button);

        frame.setSize(300, 300); /*The default is obviously set to 0 by 0*/

        frame.setVisible(true); /*If we don't do this, the app just starts and finishes doing "nothing"*/

    }
}
