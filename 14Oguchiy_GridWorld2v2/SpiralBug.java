import info.gridworld.actor.*;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color; 

public class SpiralBug extends Bug
{
    private int steps;
    private int sideLength;
    /**
     * Constructs a box bug that traces a square "box" of a given side length
     * @param length the side length
     */

    public SpiralBug(int length)
    {
        steps = 0;
        sideLength = length;
    }

    /**
     * Moves to the next location of the square.
     */

    public void act()
    {

        if(steps < sideLength && canMove())
        {
            move();
            steps++;
        }
        else
        {
            turn();
            turn();
            steps = 0;
            sideLength ++;
        }

    }
}
