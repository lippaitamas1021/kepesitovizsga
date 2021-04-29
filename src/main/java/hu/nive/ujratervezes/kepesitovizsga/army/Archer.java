package hu.nive.ujratervezes.kepesitovizsga.army;

public class Archer extends MilitaryUnit {

    public Archer() {
        this.vitalityPoints = 50;
        this.attackDamage = 20;
        this.armor = false;
    }

    @Override
    public int doDamage() {
        return attackDamage;
    }

    @Override
    public void sufferDamage(int damage) {
        this.vitalityPoints -= damage;
    }

    @Override
    public int getHitPoints() {
        return vitalityPoints;
    }
}
