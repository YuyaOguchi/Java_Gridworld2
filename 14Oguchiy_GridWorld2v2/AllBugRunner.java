/*
 * Yuya Oguchi          2/26/14
 * 
 * Did you know answers:
 * 
 * 1.What is the role of the instance variable sideLength? 
 * The variable sidelength is the variable that defines how many steps the bug can take.
 * 
 * 2. What is the role of the instance variable steps? 
 * The variable steps count how many times the variable moved so far.
 * 
 * 3. Why is the turn method called twice when steps becomes equal to ?sideLength? 
 * You use turn twice because using turn once turns the bug by 45 degrees, 
 * so in order to turn 90 degrees; you need to use turn twice.
 * 
 * 4. Why can the move method be called in the BoxBug class when there is no ?move method in the BoxBug code? 
 * Because the move in BoxBugRunner is extended to BoxBug so even though 
 * the move is not in the same class, it still works.
 * 
 * 5. After a BoxBug is constructed, will the size of its square pattern always be the ?same? Why or why not? 
 * No it is not the same. If the bug hit a wall, it has to turn automatically, so it does not always 
 * have the same path. If it doesn’t hit the wall or after it hit the wall completely and if the 
 * grid is bigger than the decided square size to move, then it will always have a same route and 
 * same size of rectangle.
 * 
 * 6. Can the path a BoxBug travels ever change? Why or why not? 
 * Yes it is possible for the Box bug to travel different path according to what 
 * lies on the path of the Box bug. The path will always change whenever there is a wall 
 * or object like rocks for example. 
 * 
 * 7. When will the value of steps be zero? 
 * Whenever the bug has to turn, its steps will be reset to 0, also the BoxBug 
 * will also have 0 steps when the bug is first set into the grid. There is a special 
 * case when the BoxBug hit objects or a wall, then it will also reset the steps to 0.
 * 
 */

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * This class runs a world that contains box bugs.
 * This class is not tested on the AP CS A and AB exams.
 */

public class AllBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();

        /*
         * Normal Bug (red)
         */
        BoxBug bob = new BoxBug(3);

        world.add(new Location(5,5), bob);

        /*
         * Circle Bug (blue)
         */
        CircleBug john = new CircleBug(6);
        john.setColor(Color.BLUE);
        world.add(new Location(7,8), john);

        
        /*
         * Spiral Bug (yellow)
         */
        SpiralBug sean = new SpiralBug(3);
        sean.setColor(Color.YELLOW);
        world.add(new Location(2,2), sean);

        /*
         * Z Bug
         */
        ZBug chisei = new ZBug(4);
        chisei.setColor(Color.GREEN);
        world.add(new Location(2,4), chisei);

        
        /*
         * Dance Bug (orange)
         */
        DancingBug alice = new DancingBug(6,2);
        alice.add(2);
        alice.add(3);
        alice.add(2);
        alice.add(2);
        alice.add(3);
        alice.add(3);

        alice.setColor(Color.ORANGE);

        world.add(new Location(6,5), alice);

        world.show();
    }
}
