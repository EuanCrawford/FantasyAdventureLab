package Weapons;

import Behaviours.IWeapon;
import Enemy.Enemy;

public class Sword extends Weapon implements IWeapon {
    Enemy enemy;

    public Sword(int weaponDamage) {
        super(weaponDamage);
    }

    @Override
    public void attack(Enemy enemy) {
        enemy.takeDamage(this.getWeaponDamage());
    }
}
