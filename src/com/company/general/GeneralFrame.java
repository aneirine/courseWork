package com.company.general;

import com.company.panels.ControlsPanel;
import com.company.panels.FiguresPanel;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class GeneralFrame extends JFrame {

    public GeneralFrame() {
        setSize(850, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        setTitle("Course-project, v1, by Anna Shypilova 2020");
        setLayout(new FlowLayout());


        FiguresPanel figuresPanel = new FiguresPanel(500, 600);
        ControlsPanel controlsPanel = new ControlsPanel(300, 600);

        Border border = new LineBorder(new Color(105, 105, 105), 1);
        figuresPanel.setBorder(border);
        controlsPanel.setBorder(border);

        add(figuresPanel);
        add(controlsPanel);

    }

    public static void main(String[] args) {
        GeneralFrame window = new GeneralFrame();
        window.setVisible(true);
    }
}
