package ch02.examples;

import javax.swing.*;
import java.awt.*;

public class HelloJava {
    public static void main(String[] args) {
        JFrame frame = new JFrame("HelloJava");

        frame.setSize(300, 150);
        frame.add(new HelloComponent());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

class HelloComponent extends JComponent {
    public void paintComponent(Graphics g) {
        g.drawString("Hello, Java!", 110, 55);
    }
}