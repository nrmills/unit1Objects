
//Nic Mills
//Random

import java.util.Random;
public class Diesimulator
{
    public static void main(String[] args)
    {
        Random random_object = new Random();
        int random_num = random_object.nextInt(6);
        System.out.println(random_num);
    }
}