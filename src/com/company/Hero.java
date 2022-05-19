package com.company;

public abstract class Hero implements HavingSuperAbility{
    private int heroHealth;
    private int heroDamage;
    private String heroTypeOfAbility;


    public int getHeroHealth() {
        return heroHealth;
    }

    public void setHeroHealth(int heroHealth) {
        this.heroHealth = heroHealth;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public void setHeroDamage(int heroDamage) {
        this.heroDamage = heroDamage;
    }

    public String getHeroTypeOfAbility() {
        return heroTypeOfAbility;
    }

    public void setHeroTypeOfAbility(String heroTypeOfAbility) {
        this.heroTypeOfAbility = heroTypeOfAbility;
    }
    @Override
    public void applySuperAbility() {
    }
}
