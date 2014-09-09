//Nic Mills
//Mr. Shmidt

import java.util.Random;
import java.awt.Color;
import java.util.concurrent.TimeUnit ;

public class TurtleLab
{
    public static void main(String[] args)
    {
        World turtleWorld = new World(1720,1080);
        Turtle t1 = new Turtle(turtleWorld);
        Turtle t2 = new Turtle(turtleWorld);
        t1.hide();
        t2.hide();
        //set counter/random variables
        int travel_distance = 30;
        Random generator = new Random();
        int rand_num = generator.nextInt(5);
        int rand_num2 = rand_num;
        int atr_change = generator.nextInt(6+2);
        int it_count = 0;
        

        //While Loop
        while (rand_num2 != -101)
        {
            try {
                TimeUnit.MILLISECONDS.sleep(1);
            } catch (InterruptedException e) {
            }
            //t1
            rand_num = generator.nextInt(360);
            t1.turn(rand_num);
            t1.forward(travel_distance);
            travel_distance += 1;
            Color t1_color = new Color(generator.nextInt(255), generator.nextInt(255), generator.nextInt(255));
            Color t2_color = new Color(generator.nextInt(255), generator.nextInt(255), generator.nextInt(255));
            //change colors Delete Comment Marks in if structures to change pen widths while running
            if (atr_change == 2)
            {
                t2.setPenColor(t2_color);
                //t2.setPenWidth(atr_change*15);
                t1.setPenColor(t1_color);
                //t1.setPenWidth(atr_change*15);
            }
            if (atr_change == 3)
            {
                t2.setPenColor(t2_color);
                //t2.setPenWidth(atr_change*15);
                t1.setPenColor(t1_color);
                //t1.setPenWidth(atr_change*15);
            }
            if (atr_change == 4)
            {
                t2.setPenColor(t2_color);
                //t2.setPenWidth(atr_change*15);
                t1.setPenColor(t1_color);
                //t1.setPenWidth(atr_change*15);
            }
            if (atr_change == 5)
            {
                t2.setPenColor(t2_color);
                //t2.setPenWidth(atr_change*15);
                t1.setPenColor(t1_color);
                //t1.setPenWidth(atr_change*15);
            }
            if (atr_change == 6)
            {
                t2.setPenColor(t2_color);
                //t2.setPenWidth(atr_change*15);
                t1.setPenColor(t1_color);
                //t1.setPenWidth(atr_change*15);
            }
            if (atr_change == 7)
            {
                t2.setPenColor(t2_color);
                //t2.setPenWidth(atr_change*15);
                t1.setPenColor(t1_color);
                //t1.setPenWidth(atr_change*15);
            }
            
            //t2
            rand_num2 = generator.nextInt(360);
            t2.turn(rand_num2 *= -1);
            t2.forward(travel_distance);
            if (travel_distance > 100) 
            {
                travel_distance *= .625;
            }
            atr_change = generator.nextInt(6);
            it_count += 1;
            if ((rand_num2 == -101)&&(it_count < 5000)) //change comparison number to force program to run longer or shorter
            {
                rand_num2 = -100;
            }
        }  
        System.out.println("This program executed a total of "+it_count+" iterations"); 
    }
}

