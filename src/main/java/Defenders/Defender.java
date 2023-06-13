package Defenders;

import Behaviours.IDefend;
import Enemy.Enemy;

public class Defender implements IDefend {
        Enemy enemy;
        private int damage;

    public Defender(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public void defendMage(Enemy enemy) {
        enemy.takeDamage(this.damage);
    }
}
