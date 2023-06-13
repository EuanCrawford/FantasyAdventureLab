package Weapons;

import Behaviours.IWeapon;
import Enemy.Enemy;

public class Axe implements IWeapon {
    private int weaponDamage;
    Enemy enemy;

    public Axe(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    @Override
    public void attack(Enemy enemy) {
        enemy.takeDamage(weaponDamage);
    }
}
