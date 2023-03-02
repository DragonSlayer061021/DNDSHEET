import com.prog2.panels.*;

import javax.swing.*;
import javax.swing.JSplitPane;
import java.awt.*;

public class SheetBuilderViewer extends JFrame {

    private  JPanel raceTab, classTab, infoTab, abilityTab;

    private JTabbedPane tabs;



    public SheetBuilderViewer(){


        tabs = new JTabbedPane();

        raceTab = new RacePanel();
        classTab = new ClassPanel();
        infoTab = new InfoPanel();
        abilityTab = new AbilityPanel();

        tabs.add("Choose a Race",raceTab);
        tabs.add("Choose a Class",classTab);
        tabs.add("View your Information",infoTab);
        tabs.add("Roll Your Abilities", abilityTab);

        this.add(tabs, BorderLayout.CENTER);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(950,1000);
        setVisible(true);
    }

}
