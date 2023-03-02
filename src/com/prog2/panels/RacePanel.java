package com.prog2.panels;

import com.prog2.races.Dwarfs.HillDwarf;
import com.prog2.races.Race;
import com.prog2.races.RaceUI.Dwarf;

import javax.swing.*;

public class RacePanel extends JPanel {

    private final JPanel raceChoicePanel;
    private JComboBox<Dwarf> raceCombo;
    private final JComboBox<Race> subCombo;
    private final JLabel raceChoiceLabel;
    private final JLabel subChoiceLabel;

    public RacePanel() {
        raceChoicePanel = new JPanel();


        raceCombo = new JComboBox<Dwarf>();
        subCombo = new JComboBox<Race>();
        raceChoiceLabel = new JLabel("Choose your Race ");
        subChoiceLabel = new JLabel("Choose a Sub-Race");

        raceChoicePanel.add(raceChoiceLabel);
        raceChoicePanel.add(raceCombo);
        raceChoicePanel.add(subChoiceLabel);


        this.add(raceChoicePanel);

        onRaceSelected();
    }


/*
 raceCombo.addItem("DragonBorn");
        raceCombo.addItem("Dwarf");
        raceCombo.addItem("Elf");
        raceCombo.addItem("Gnome");
        raceCombo.addItem("Half-Elf");
        raceCombo.addItem("Halflings");
        raceCombo.addItem("Half-orc");
        raceCombo.addItem("Human");
        raceCombo.addItem("Tieflings");
 */
private void onRaceSelected(){
    //clear the sub combo
    subCombo.removeAllItems();
    //store the chosen race into a local variable
    Race chosen = (Race) subCombo.getSelectedItem();
    //add all the subraces of the chosen race to the sub combo
    for (Race sub: chosen.subRaces) {
        subCombo.addItem(sub);
    }
    //add the chosen subrace's special UI
    initRaceCombo();
}
    private void initRaceCombo(){
        raceCombo = new JComboBox<Dwarf>();

        raceCombo.addItem(new Dwarf());
        //
        raceCombo.addActionListener(e -> onRaceSelected());
    }

}
