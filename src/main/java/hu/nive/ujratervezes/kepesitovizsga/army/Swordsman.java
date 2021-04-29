package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit {

    private int round;
    private boolean isArmorDamaged = false;

    public Swordsman(boolean armor) {
        this.vitalityPoints = 100;
        this.attackDamage = 10;
        this.armor = armor;
    }

    @Override
    public int doDamage() {
        return attackDamage;
    }

    @Override
    public void sufferDamage(int damage) {
        round++;
        if (round == 1) {
            isArmorDamaged = true;
        } else {
            if (armor) {
                vitalityPoints -= damage / 2;
            } else {
                vitalityPoints -= damage;
            }
        }
    }

    @Override
    public int getHitPoints() {
        return vitalityPoints;
    }
}
