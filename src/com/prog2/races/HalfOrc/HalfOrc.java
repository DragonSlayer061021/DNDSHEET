package com.prog2.races.HalfOrc;

import com.prog2.races.Race;
import com.prog2.info.CreatureSize;

public abstract class HalfOrc extends Race {

    public HalfOrc(){
        this.raceName = "Half-Orc";
        this.size = CreatureSize.MEDIUM;
        this.speed = 30;

        this.strength = 2;
        this.constitution = 1;

        this.traits.add("DarkVision:60ft (Shades of grey only)");
        this.traits.add("Savage Attacks");
        this.traits.add("Relentless Endurance");
        this.proficiencies.add("Menacing, Intimidation skill");
        this.languages.add("Orc");
        this.languages.add("Common");
    }

}
