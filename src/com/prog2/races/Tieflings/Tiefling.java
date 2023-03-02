package com.prog2.races.Tieflings;

import com.prog2.races.Race;
import com.prog2.info.CreatureSize;

public abstract class Tiefling extends Race {

    public Tiefling(){
        this.raceName = "Tiefling";
        this.size = CreatureSize.MEDIUM;
        this.speed = 30;
        this.intelligence = 1;
        this.charisma = 2;
        this.cantrips.add("Thaumaturgy");
        this.traits.add("Fire Resistance");
        this.traits.add("DarkVision:60ft (See Shades of Gray Only)");

        this.languages.add("Infernal");
        this.languages.add("Common");
    }
}
