package gui.ptimoGUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class PanelDialogue extends JPanel {

    private final PtimoGUI gui;

    private final JTextArea dialogue;

    public PanelDialogue(PtimoGUI ptimoGui) {
        gui = ptimoGui;

        setSize(gui.getWindowDims().width, gui.getWindowDims().height-200);

        //setBackground(new Color(200, 130, 145, 125));
        setBackground(Color.black);

        Border lowerBevel = BorderFactory.createLoweredBevelBorder();
        Border border = BorderFactory.createBevelBorder(5, Color.white, Color.black);
        setBorder(lowerBevel);

        dialogue = new JTextArea();

        dialogue.setOpaque(false);
        dialogue.setSize(getWidth()-10, getHeight()-10);
        dialogue.setLocation(10,10);
        dialogue.setWrapStyleWord(true);
        dialogue.setLineWrap(true);
        dialogue.setFont(new Font("Serif", Font.BOLD, 40));
        dialogue.setForeground(Color.white);
        dialogue.setEditable(false);
        add(dialogue);

    }

    public void changeDialogue(String text) {
        dialogue.setText(text);
    }

}
