import Player.Barbarian;
import Weapons.Axe;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    Barbarian barbarian;
    Sword sword;
    Axe axe;

    @Before
    public void before() {
        sword = new Sword(30);
        axe = new Axe(40);
        barbarian = new Barbarian("Barry", 100, axe, 100);
    }

    @Test
    public void canChangeWeapon() {
        barbarian.setWeapon(sword);
        assertEquals(sword, barbarian.getWeapon());
    }
}
