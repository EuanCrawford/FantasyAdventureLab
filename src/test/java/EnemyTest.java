import Enemy.Orc;
import Player.Barbarian;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Orc orc;
    Sword sword;
    Barbarian barbarian;

    @Before
    public void before() {
        sword = new Sword(30);
        orc = new Orc(100, 30);
        barbarian = new Barbarian("Barry", 100, sword, 100);
    }

    @Test
    public void canTakeDamage() {
        sword.attack(orc);
        assertEquals(70, orc.getHealthPoints());
    }

    @Test
    public void canAttack() {
        orc.attackPlayer(barbarian);
        assertEquals(70, barbarian.getHealthPoints());
    }
}
