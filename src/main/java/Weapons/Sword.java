package Weapons;

import Behaviours.IWeapon;
import Enemy.Enemy;

public class Sword implements IWeapon {
    private int weaponDamage;
    Enemy enemy;

    public Sword(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    @Override
    public void attack(Enemy enemy) {
        enemy.takeDamage(weaponDamage);
    }
}
