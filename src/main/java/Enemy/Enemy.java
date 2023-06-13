package Enemy;
import Player.Player;

public abstract class Enemy {
    private int healthPoints;
    private int damage;

    public Enemy(int healthPoints, int damage) {
        this.healthPoints = healthPoints;
        this.damage = damage;
    }

    public void takeDamage(int damageValue) {
        this.healthPoints -= damageValue;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void attackPlayer(Player player) {
        player.takeDamage(this.damage);
    }

    public int getDamage() {
        return damage;
    }
}
