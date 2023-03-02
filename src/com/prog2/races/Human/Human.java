package com.prog2.races.Human;

import com.prog2.races.Race;
import com.prog2.info.CreatureSize;

public abstract class Human extends Race {

    public Human(){
        this.raceName = "Human";
        this.size = CreatureSize.MEDIUM;
        this.speed = 30;

        this.strength = 1;
        this.dexterity = 1;
        this.constitution = 1;
        this.intelligence = 1;
        this.wisdom = 1;
        this.charisma = 1;


        this.languages.add("Goldfish");
        this.languages.add("Common");
    }

}
