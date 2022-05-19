package com.company;

public class Medic extends Hero implements HavingSuperAbility{
    @Override
    public void applySuperAbility() {
        super.applySuperAbility();
        System.out.println("Medic применил суперспособность CRITICAL DAMAGE");
    }
    private double healPoints=15.0;

    public double getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(double healPoints) {
        this.healPoints = healPoints;
    }

    public void increaseExperience(){
        for (int i = 0; i < healPoints; i+=1.5) {
            System.out.println("Medic experience was increased by "+i);
        }
    }

}
