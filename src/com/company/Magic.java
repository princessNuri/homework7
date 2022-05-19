package com.company;

public class Magic extends Hero implements HavingSuperAbility{
    @Override
    public void applySuperAbility() {
        super.applySuperAbility();
        System.out.println("Magic применил суперспособность CRITICAL DAMAGE");
    }
}
