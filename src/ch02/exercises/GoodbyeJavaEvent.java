package ch02.exercises;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class GoodbyeJavaEvent {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Goodbye Java + events");
        frame.setSize(300, 300);
        frame.add(new GoodbyeJavaCustom(args[0]));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

class GoodbyeJavaCustom extends JComponent implements MouseMotionListener {
    String messageContent;
    int posX, posY;

    public GoodbyeJavaCustom(String message) {
        messageContent = message;
        posX = 100;
        posY = 120;
        addMouseMotionListener(this);
    }

    public void paintComponent(Graphics g) {
        g.drawString(messageContent, posX, posY);
    }

    public void mouseDragged(MouseEvent e) {
        posX = e.getX();
        posY = e.getY();
        repaint();
    }

    public void mouseMoved(MouseEvent e) {
    }
}
