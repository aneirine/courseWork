package com.company.panels;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class ControlsPanel extends JPanel {

    private int panelWidth;

    private int panelHeight;

    public ControlsPanel(int panelWidth, int panelHeight) {
        this.panelWidth = panelWidth;
        this.panelHeight = panelHeight;
    }

    public void setParameters() {
        FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER, 0, 10);
        setLayout(flowLayout);


        //  settingsPanel.setParametersForPanelFirst();

        SettingsPanel settingsPanel2 = new SettingsPanel(290, 100);
        settingsPanel2.setBackground(Color.LIGHT_GRAY);
        settingsPanel2.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));

        SettingsPanel settingsPanel3 = new SettingsPanel(290, 100);
        settingsPanel3.setBackground(Color.LIGHT_GRAY);
        settingsPanel3.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));


        ButtonsPanel buttonsPanel = new ButtonsPanel(290, 100);
        buttonsPanel.setBackground(Color.LIGHT_GRAY);
        buttonsPanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));

        for (int i = 0; i < 2; i++) {
            add(setSettingsPanel(i));
        }

        add(setSettingsPanel().setParametersForPanelFirst());
        add(settingsPanel2);
        add(settingsPanel3);
        add(buttonsPanel);
    }

    public SettingsPanel setSettingsPanel(int index) {
        SettingsPanel settingsPanel = new SettingsPanel(290, 120);
        settingsPanel.setBackground(Color.LIGHT_GRAY);
        settingsPanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));

        switch (index) {
            case 0:
                settingsPanel.setParametersForPanelFirst();
                break;
            case 1:
                settingsPanel.setParametersForPanelSecond();
                break;
            case 2:
                settingsPanel.setParametersForPanelThird();
                break;
        }
        return settingsPanel;
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
