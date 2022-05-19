package com.company;

public class Main {

    public static void main(String[] args) {
        Magic magic = new Magic();
        Medic medic = new Medic();
        Warrior warrior = new Warrior();
        Hero [] heroes = {magic,medic,warrior};
        for (int i = 0; i < heroes.length; i++) {
            applyAll(heroes[i]);
            if(heroes[i]instanceof Medic){
                ((Medic)heroes[i]).increaseExperience();
            }
        }
    }
    public static void applyAll(Hero hero) {
        hero.applySuperAbility();
    }
}
