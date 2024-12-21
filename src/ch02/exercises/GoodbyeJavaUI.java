package ch02.exercises;

import javax.swing.*;
import java.awt.*;

public class GoodbyeJavaUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Goodbye Java!");
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(new GoodbyeJavaPainter());
    }
}

class GoodbyeJavaPainter extends JComponent {
    public void paintComponent(Graphics g) {
        g.drawString("Goodbye, Java! :P", 100, 120);
    }
}
