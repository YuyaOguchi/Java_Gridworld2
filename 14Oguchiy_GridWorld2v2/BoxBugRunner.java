import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * This class runs a world that contains box bugs.
 * This class is not tested on the AP CS A and AB exams.
 */

public class BoxBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        
        /*
         * Normal Bug
         */
        BoxBug alice = new BoxBug(6);
        alice.setColor(Color.ORANGE);
        BoxBug bob = new BoxBug(3);
        world.add(new Location(7,8), alice);
        world.add(new Location(5,5), bob);
        
        /*
         * Circle Bug
         */
        CircleBug john = new CircleBug(6);
        CircleBug nick = new CircleBug(3);
        //world.add(new Location(7,8), john);
        //world.add(new Location(5,5), nick);
        
        
        
        
        /*
         * Spiral Bug
         */
        SpiralBug matt = new SpiralBug(6);
        SpiralBug sean = new SpiralBug(3);
        //world.add(new Location(7,8), matt);
        //world.add(new Location(5,5), sean);
        
        /*
         * Z Bug
         */
        ZBug chisei = new ZBug(6);
        ZBug ethan = new ZBug(3);
        world.add(new Location(2,4), chisei);
        world.add(new Location(5,5), ethan);
        
        world.show();
    }
}
