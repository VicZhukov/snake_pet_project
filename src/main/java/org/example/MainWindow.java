package org.example;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    public MainWindow(){
        setTitle("Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320, 340);
        setLocation(490, 180);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {
        MainWindow mw = new MainWindow();
    }
}
