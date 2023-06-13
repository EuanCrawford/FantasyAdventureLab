import Enemy.Orc;
import Player.Barbarian;
import Weapons.Axe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {
    Barbarian barbarian;
    Axe axe;
    Orc orc;

    @Before
    public void before() {
        axe = new Axe(30);
        orc = new Orc(100, 30);
        barbarian = new Barbarian("Barry", 100, axe, 100);
    }

    @Test
    public void canUseAnger() {
        barbarian.useAnger(axe);
        axe.attack(orc);
        assertEquals(40, orc.getHealthPoints());
    }
}
