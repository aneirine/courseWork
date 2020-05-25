package com.company.panels;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class ControlsPanel extends JPanel {

    private int panelWidth;

    private int panelHeight;

    public ControlsPanel(int panelWidth, int panelHeight) {
        this.panelWidth = panelWidth;
        this.panelHeight = panelHeight;

        FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER, 0, 10);
        setLayout(flowLayout);

        SettingsPanel settingsPanel = new SettingsPanel(290, 100);
        settingsPanel.setBackground(Color.LIGHT_GRAY);
        settingsPanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));

        add(settingsPanel);

    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(this.panelWidth, this.panelHeight);
    }

    public int getPanelWidth() {
        return panelWidth;
    }

    public void setPanelWidth(int panelWidth) {
        this.panelWidth = panelWidth;
    }

    public int getPanelHeight() {
        return panelHeight;
    }

    public void setPanelHeight(int panelHeight) {
        this.panelHeight = panelHeight;
    }
}
