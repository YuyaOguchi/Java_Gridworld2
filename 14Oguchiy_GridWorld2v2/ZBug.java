import info.gridworld.actor.*;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color; 

public class ZBug extends Bug
{
    private int steps;
    private int sideLength;
    private boolean done = false;
    /**
     * Constructs a box bug that traces a square "box" of a given side length
     * @param length the side length
     */

    public ZBug(int length)
    {
        steps = 0;
        sideLength = length;
    }

    /**
     * Moves to the next location of the square.
     */

    public void act()
    {
       
            if (done == false && canMove()){
            turn();
            turn();
            while(steps < sideLength && canMove() )
            {
                move();
                steps++;
                if (canMove() == false){
                    done = true;
                }
            }
        }
        if(done == false && canMove()){
            steps = 0;
            turn();
            turn();
            turn();
            while(steps < sideLength && canMove() )
            {
                move();
                steps++;
                if (canMove() == false){
                    done = true;
                }
            }
        }
        if(done == false && canMove()){
            steps = 0;
            turn();
            turn();
            turn();
            turn();
            turn();
            while(steps < sideLength && canMove() )
            {
                move();
                steps++;
                if (canMove() == false){
                    done = true;
                }
            }
            done = true;
        }  
    }
}
