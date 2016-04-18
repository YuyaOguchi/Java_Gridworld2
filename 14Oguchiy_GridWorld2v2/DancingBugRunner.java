import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * This class runs a world that contains box bugs.
 * This class is not tested on the AP CS A and AB exams.
 */

public class DancingBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();

        //Here is the array for which the bug to move//

        DancingBug alice = new DancingBug(6,2);
        alice.add(2);
        alice.add(3);
        alice.add(2);
        alice.add(2);
        alice.add(3);
        alice.add(3);

        
        /*
         * Dance Bug
         */
        
        alice.setColor(Color.ORANGE);

        world.add(new Location(5,5), alice);

        world.show();
    }
}
