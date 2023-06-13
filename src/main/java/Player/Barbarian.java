package Player;

import Behaviours.IWeapon;
import Weapons.Weapon;

public class Barbarian extends Fighter {
    private int anger;

    public Barbarian(String name, int healthPoints, IWeapon weapon, int anger) {
        super(name, healthPoints, weapon);
        this.anger = anger;
    }

    public void useAnger(Weapon weapon) {
        if (anger > 50) {
            int newDamage = weapon.getWeaponDamage() * 2;
            weapon.setWeaponDamage(newDamage);
        }
    }
}
