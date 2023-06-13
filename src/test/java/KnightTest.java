import Enemy.Orc;
import Player.Knight;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Orc orc;
    Sword sword;

    @Before
    public void before() {
        sword = new Sword(30);
        knight = new Knight("Kevin", 100, sword, true);
        orc = new Orc(100, 30);
    }

    @Test
    public void knightCanTakeHalfDamage() {
        orc.attackPlayer(knight);
        assertEquals(85, knight.getHealthPoints());
    }
}
