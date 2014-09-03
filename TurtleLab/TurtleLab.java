//Nic Mills
//Mr. Shmidt

import java.awt.Color;

public class TurtleLab
{
    public static void main(String[] args)
    {
        World turtleWorld = new World();
        Turtle t1 = new Turtle(turtleWorld);
        Turtle t2 = new Turtle(turtleWorld);
        t1.setPenColor(Color.BLUE);
        t2.setPenColor(Color.GREEN);
        t1.forward(100);
        t2.backward(100);
    }
}
        
        