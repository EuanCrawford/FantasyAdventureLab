package Player;

import Behaviours.IDefend;

public abstract class Mage extends Player{

    IDefend defender;

    public Mage(String name, int healthPoints, IDefend defender) {
        super(name, healthPoints);
        this.defender = defender;
    }
}
