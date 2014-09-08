//Nic Mills
//Mr. Shmidt

import java.util.Random;
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
        int travel_distance = 30;
        Random generator = new Random();
        int rand_num = generator.nextInt(5);
        int rand_num2 = rand_num;
        int color_change = generator.nextInt(3);
        //Turtle1 methods
        //Set Turtle attributes
        t1.setShellColor(Color.BLACK);
        t1.setBodyColor(Color.BLUE);
        t1.setPenColor(Color.RED);
        t1.setPenWidth(2);
        t1.penUp();
        t1.forward(50);
        t1.penDown();

       

        // 1st Pattern While Loop
        while (rand_num2 != -101)
        {
            try {
                TimeUnit.MILLISECONDS.sleep(50);
            } catch (InterruptedException e) {
            }
            //t1
            rand_num = generator.nextInt(360);
            t1.turn(rand_num);
            t1.forward(travel_distance);
            travel_distance += 1;
            //change colors
            if (color_change == 0)
            {
                t2.setPenColor(Color.BLUE);
                t1.setPenColor(Color.RED);
            }
            if (color_change == 1)
            {
                t2.setPenColor(Color.RED);
                t1.setPenColor(Color.BLUE);
            }
            if (color_change == 2)
            {
                t2.setPenColor(Color.GREEN);
                t1.setPenColor(Color.BLACK);
            }
            if (color_change == 3)
            {
                t2.setPenColor(Color.BLACK);
                t1.setPenColor(Color.GREEN);
            }
            if (color_change == 4)
            {
                t2.setPenColor(Color.YELLOW);
                t1.setPenColor(Color.ORANGE);
            }
            if (color_change == 5)
            {
                t2.setPenColor(Color.ORANGE);
                t1.setPenColor(Color.YELLOW);
            }
            //t2
            rand_num2 = generator.nextInt(360);
            t2.turn(rand_num2 *= -1);
            t2.forward(travel_distance);
            if (travel_distance > 100) 
            {
                travel_distance *= .625;
            }
            color_change = generator.nextInt(6);
        }  
    }
}

