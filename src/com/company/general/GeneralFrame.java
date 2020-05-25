package com.company.general;

import javax.swing.*;
import java.awt.*;

public class GeneralFrame extends JFrame {

    public GeneralFrame(){
        setSize(850, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Course-project, v1, by Anna Shypilova 2020");
        setLayout(new FlowLayout());

        FiguresPanel figuresPanel = new FiguresPanel(500, 600);
    }

    public static void main(String[] args) {
        GeneralFrame window = new GeneralFrame();
        window.setVisible(true);
    }
}
