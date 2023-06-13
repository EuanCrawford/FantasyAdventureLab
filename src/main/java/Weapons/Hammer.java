package Weapons;

import Behaviours.IWeapon;
import Enemy.Enemy;

public class Hammer implements IWeapon {
    private int weaponDamage;
    Enemy enemy;

    public Hammer(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    @Override
    public void attack(Enemy enemy) {
        enemy.takeDamage(weaponDamage);
    }
}
