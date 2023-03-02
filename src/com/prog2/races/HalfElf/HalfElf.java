package com.prog2.races.HalfElf;

import com.prog2.races.Race;
import com.prog2.info.CreatureSize;

public abstract class HalfElf extends Race {

    public HalfElf(){
        this.raceName = "Half-Elf";
        this.size = CreatureSize.MEDIUM;
        this.speed = 30;

        this.charisma = 2;


        this.languages.add("Elvish");
        this.languages.add("Common");
        this.traits.add("DarkVision:60ft(only see grey)");
        this.traits.add("Fey Ancestry");
        this.traits.add("Skill Versatility");
    }

}
