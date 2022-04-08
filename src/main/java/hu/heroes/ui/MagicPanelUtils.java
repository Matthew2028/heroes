package hu.heroes.ui;

import hu.heroes.model.Magic;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MagicPanelUtils {
    private static final JPanel[] magicPanels = new JPanel[5];

    public static JPanel[] initializeMagicPanels(List<Magic> magics) {
        var startYPosition = 30;
        for (int i = 0; i < magics.size(); i++) {
            var panel = new JPanel();
            panel.setBounds(30, startYPosition, 40, 40);
            panel.setBackground(Color.YELLOW);
            magicPanels[i] = panel;
            startYPosition += 50;
        }

        return magicPanels;
    }
}
