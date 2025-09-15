import javax.swing.*;
import java.awt.*;

public class Main {
    static Window window;
    static JFrame frame;
    public static void main(String[] args) {
        window = new Window(new Library(100));
        frame = new JFrame();
        frame.setContentPane(window.getContentPane());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(600, 300));
        frame.pack();
        frame.setVisible(true);
    }
}
