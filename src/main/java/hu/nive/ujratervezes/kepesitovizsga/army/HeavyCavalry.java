package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit {

    private int round;

    public HeavyCavalry() {
        this.vitalityPoints = 150;
        this.attackDamage = 20;
        this.armor = true;
    }

    @Override
    public int doDamage() {
        round++;
        if (round == 1) {
            return 3 * attackDamage;
        } else {
            return attackDamage;
        }
    }

    @Override
    public void sufferDamage(int damage) {
        vitalityPoints -= damage / 2;
    }

    @Override
    public int getHitPoints() {
        return vitalityPoints;
    }
}
