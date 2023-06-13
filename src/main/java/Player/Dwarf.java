package Player;

import Behaviours.IWeapon;
import Enemy.Enemy;

public class Dwarf extends Fighter {
    public Dwarf(String name, int healthPoints, IWeapon weapon) {
        super(name, healthPoints, weapon);
    }

    public void dodgeAttack(Enemy enemy) {
        int health = this.getHealthPoints();
        health += enemy.getDamage();
        this.setHealthPoints(health);
    }
}
