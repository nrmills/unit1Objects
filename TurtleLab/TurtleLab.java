//Nic Mills
//Mr. Shmidt

import java.awt.Color;
import java.util.concurrent.TimeUnit ;

public class TurtleLab
{
    public static void main(String[] args)
    {
        World turtleWorld = new World();
        Turtle t1 = new Turtle(turtleWorld);
        Turtle t2 = new Turtle(turtleWorld);
        //set counter variables
        int loop_counter = 0;
        int travel_distance = 30;
        //Turtle1 methods
        //Set Turtle attributes
        t1.setShellColor(Color.BLACK);
        t1.setBodyColor(Color.BLUE);
        t1.setPenColor(Color.RED);
        t1.setPenWidth(2);
        t1.penUp();
        t1.forward(100);
        t1.penDown();
        
        
        // 1st Pattern While Loop
        while (loop_counter != -1)
        {
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
            }
            t1.turn(loop_counter);
            t1.forward(travel_distance);
            loop_counter += 1;
            travel_distance += 1;
        }
                    
        //Turtle2 methods
        t2.setShellColor(Color.ORANGE);
        t2.setBodyColor(Color.YELLOW);
        t2.setPenColor(Color.BLUE);
        t2.setPenWidth(2);

        
        //1st Pattern While Loop

    }
}
        
 


