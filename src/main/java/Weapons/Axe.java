package Weapons;

import Behaviours.IWeapon;
import Enemy.Enemy;

public class Axe extends Weapon implements IWeapon {
    Enemy enemy;

    public Axe(int weaponDamage) {
        super(weaponDamage);
    }

    @Override
    public void attack(Enemy enemy) {
        enemy.takeDamage(this.getWeaponDamage());
    }
}
