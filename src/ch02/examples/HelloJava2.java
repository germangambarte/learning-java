package ch02.examples;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class HelloJava2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("HelloJava2");

        frame.add(new HelloComponent2(args[0]));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}

class HelloComponent2 extends JComponent implements MouseMotionListener {
    String messageContent;
    int messagePosX = 125, messagePosY = 95;

    public HelloComponent2(String message) {
        messageContent = message;
        addMouseMotionListener(this);
    }

    public void paintComponent(Graphics g) {
        g.drawString(messageContent, messagePosX, messagePosY);
    }

    public void mouseDragged(MouseEvent e) {
        messagePosX = e.getX();
        messagePosY = e.getY();
        repaint();
    }

    public void mouseMoved(MouseEvent e) {
        messagePosX = e.getX();
        messagePosY = e.getY();
        repaint();
    }
}
