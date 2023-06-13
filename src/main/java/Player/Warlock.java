package Player;


import Behaviours.IDefend;
import Defenders.Defender;
import Enemy.Enemy;

public class Warlock extends Mage implements IDefend {

    Defender defender;

    public Warlock(String name, int healthPoints, IDefend defender) {
        super(name, healthPoints, defender);
    }

    @Override
    public void defendMage(Enemy enemy) {
        if(this.getHealthPoints()<20){
            this.defender.defendMage(enemy);
        }
    }
}
