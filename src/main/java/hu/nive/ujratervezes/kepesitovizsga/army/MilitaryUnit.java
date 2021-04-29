package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {

    protected int vitalityPoints;
    protected int attackDamage;
    protected boolean armor;

    public MilitaryUnit(int vitalityPoints, int attackDamage, boolean armor) {
        this.vitalityPoints = vitalityPoints;
        this.attackDamage = attackDamage;
        this.armor = armor;
    }

    public MilitaryUnit() {
    }

    public abstract int doDamage();

    public abstract void sufferDamage(int damage);

    public abstract int getHitPoints();

    @Override
    public String toString() {
        return "MilitaryUnit{" +
                "vitalityPoints=" + vitalityPoints +
                ", attackDamage=" + attackDamage +
                ", armor=" + armor +
                '}';
    }
}
