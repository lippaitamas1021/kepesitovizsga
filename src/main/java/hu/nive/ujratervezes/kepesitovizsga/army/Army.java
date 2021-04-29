package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.ArrayList;
import java.util.List;

public class Army {

    List<MilitaryUnit> militaryUnits = new ArrayList<>();

    public int getArmySize() {
        return militaryUnits.size();
    }

    public void addUnit(MilitaryUnit militaryUnit) {
        militaryUnits.add(militaryUnit);
    }

    public int getArmyDamage() {
        int counter = 0;
        for (MilitaryUnit militaryUnit : militaryUnits) {
            counter += militaryUnit.doDamage();
        }
        return counter;
    }

    public void damageAll(int damage) {
        for (MilitaryUnit militaryUnit : militaryUnits) {
            militaryUnit.vitalityPoints -= damage;
            }
        militaryUnits.removeIf(militaryUnit -> militaryUnit.vitalityPoints < 25);
    }
}
