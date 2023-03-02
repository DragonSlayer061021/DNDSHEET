package com.prog2.races.Dwarfs;

import com.prog2.races.Race;

import javax.swing.*;

public class MountainDwarf extends Race {

    public MountainDwarf() {
        this.raceName = ("Mountain Dwarf");
        this.strength = 2;

        this.proficiencies.add("Light and Medium Armor");
    }

    @Override
    public JPanel getSpecialUI() {
        return null;
    }

}
