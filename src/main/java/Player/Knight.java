package Player;

import Behaviours.IWeapon;

public class Knight extends Fighter {
    private boolean hasArmour;

    public Knight(String name, int healthPoints, IWeapon weapon, boolean hasArmour) {
        super(name, healthPoints, weapon);
        this.hasArmour = true;
    }

    public void takeDamage(int damageValue) {
        if (hasArmour == true) {
            int health = this.getHealthPoints();
            health -= damageValue / 2;
            this.setHealthPoints(health);
        } else {
            int health = this.getHealthPoints();
            health -= damageValue;
            this.setHealthPoints(health);
        }
    }

}
