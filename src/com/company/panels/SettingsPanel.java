package com.company.panels;

import javax.swing.*;
import java.awt.*;

public class SettingsPanel extends JPanel {

    private int panelWidth;

    private int panelHeight;

    public SettingsPanel(int panelWidth, int panelHeight) {
        this.panelWidth = panelWidth;
        this.panelHeight = panelHeight;
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(this.panelWidth, this.panelHeight);
    }

    public void setParametersForPanelFirst(){
        FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT, 5, 5);
        setLayout(flowLayout);

        add(setJPanelForFigures("Квадрати"));
        add(setJPanelForFigures("Трикутники"));
        add(setJPanelForFigures("Кола"));
    }

    public void setParametersForPanelSecond() {
    }

    public void setParametersForPanelThird() {
    }

    public JPanel setJPanelForFigures(String name){
        JPanel jpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 3));
        jpanel.add(new JLabel(name));

        JCheckBox jCheckBox = new JCheckBox();
        jpanel.add(jCheckBox);
        jCheckBox.setSelected(true);

        jpanel.add(new JLabel("кількість"));
        JTextField amount = new JTextField(5);
        jpanel.add(amount);
        amount.setText("5");

        return jpanel;
    }

    public int getPanelWidth() {
        return panelWidth;
    }

    public int getPanelHeight() {
        return panelHeight;
    }

    public void setPanelWidth(int panelWidth) {
        this.panelWidth = panelWidth;
    }

    public void setPanelHeight(int panelHeight) {
        this.panelHeight = panelHeight;
    }



}
