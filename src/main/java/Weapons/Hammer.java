package Weapons;

import Behaviours.IWeapon;
import Enemy.Enemy;

public class Hammer extends Weapon implements IWeapon {
    Enemy enemy;

    public Hammer(int weaponDamage) {
        super(weaponDamage);
    }


    @Override
    public void attack(Enemy enemy) {
        enemy.takeDamage(this.getWeaponDamage());
    }
}
