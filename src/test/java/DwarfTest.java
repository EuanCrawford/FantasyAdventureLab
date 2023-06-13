import Enemy.Troll;
import Player.Dwarf;
import Weapons.Hammer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
    Troll troll;
    Hammer hammer;

    @Before
    public void before() {
        hammer = new Hammer(50);
        troll = new Troll(100, 40);
        dwarf = new Dwarf("Derek", 100, hammer);
    }

    @Test
    public void canDodgeAttack() {
        troll.attackPlayer(dwarf);
        dwarf.dodgeAttack(troll);
        assertEquals(100, dwarf.getHealthPoints());
    }
}
