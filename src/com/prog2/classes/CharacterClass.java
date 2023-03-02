package com.prog2.classes;

import com.prog2.races.Race;
import com.prog2.info.Alignment;
import com.prog2.info.Background;

import java.util.ArrayList;
import java.util.Map;

public class CharacterClass{
    public String characterName;
    public CharacterClass characterClass;

    public int level;

    public Race characterRace;
    public Background background;
    public Alignment alignment;
    public String playerName;

    public int xp;

    //* hit-points and armor
    public int armorClass;
    public int initiative;
    public int speed;

    public int maxHp;
    public int currentHp;

    public int hitDiceType;
    public int hitDiceAmount;
    public int proficiencyBonus;

    //* Ability Scores

    public int strength;

    public int dexterity;

    public int constitution;

    public int intelligence;

    public int wisdom;

    public int charisma;

    //* passives
    public int passivePerception;

    //* Features and Traits
    public ArrayList<String> traits;

    //* Skills and Saving throws
    public Map<String, Boolean> skills;
    public Map<String, Boolean> savingThrows;

    //* Proficiencies
    public ArrayList<String> languages;
    public ArrayList<String> proficiencies;

    //* Equipment
    public ArrayList<String> equipment;
    public ArrayList<String> weapons;
    public ArrayList<String> armor;
    public ArrayList<String> spells;
    public ArrayList<String> cantrips;

    //* Money
    public int copper;
    public int silver;
    public int electrum;
    public int gold;
    public int platinum;





}
