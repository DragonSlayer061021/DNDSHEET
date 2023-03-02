package com.prog2.races.Dwarfs;

import com.prog2.races.Race;

import javax.swing.*;

public class HillDwarf extends Race {

    public HillDwarf(){
        this.raceName = ("Hill Dwarf");
        this.wisdom = 1;
        this.hp=1;
    }

    @Override
    public JPanel getSpecialUI() {
        return null;
    }
}
