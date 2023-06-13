import Enemy.Orc;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Orc orc;
    Sword sword;

    @Before
    public void before() {
        sword = new Sword(30);
        orc = new Orc(100);
    }

    @Test
    public void canTakeDamage() {
        sword.attack(orc);
        assertEquals(70, orc.getHealthPoints());
    }
}
