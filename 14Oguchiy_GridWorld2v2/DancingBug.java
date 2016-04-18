import info.gridworld.actor.*;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color; 

public class DancingBug extends Bug
{
    private int steps;
    private int sideLength;
    private int i, k;
    protected int[] list;
    protected int numElements = 0;

    /**
     * Constructs a box bug that traces a square "box" of a given side length
     * @param length the side length
     */

    public DancingBug(int size, int length)
    {
        list = new int[size];
        steps = 0;
        sideLength = length;
    }

    //------------------------------------------------------------- 
    // Adds an integer to the list.  If the list is full,
    // prints a message and does nothing.
    //------------------------------------------------------------- 
    public void add(int value)
    {
        if (numElements == list.length)
            System.out.println("Can't add, list is full");
        else
        {
            list[numElements] = value;
            numElements++;
        }
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
            for ( i = 0; i < list[k]; i++){
                turn();
            }
            if(k < list.length - 1){
                k++;
            } else if (k == list.length - 1){
                k = 0;
            }
            steps = 0;
        }

    }
}
