import Defenders.Dragon;
import Enemy.Orc;
import Player.Warlock;
import org.junit.Before;
import org.junit.Test;

public class WarlockTest {

    Warlock warlock;
    Orc orc;
    Dragon dragon;

    @Before
    public void before(){
        dragon = new Dragon(50);
        orc = new Orc(100, 30);
        warlock = new Warlock("Wally", 100, dragon);
    }

    @Test
    public void
}
