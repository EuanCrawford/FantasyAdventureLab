package Enemy;

public abstract class Enemy {
    private int healthPoints;

    public Enemy(int healthPoints) {
        this.healthPoints = healthPoints;
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
}
