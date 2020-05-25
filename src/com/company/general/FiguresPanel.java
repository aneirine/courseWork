package com.company.general;

import javax.swing.*;
import java.awt.*;

public class FiguresPanel extends JPanel {

    private int panelWidth;

    private int panelHeight;

    public FiguresPanel(int panelWidth, int panelHeight) {
        this.panelWidth = panelWidth;
        this.panelHeight = panelHeight;
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
