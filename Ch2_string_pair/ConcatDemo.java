//Nic Mills
//8_28_2014

public class ConcatDemo
{
    public static void main(String[] args)
    {
        String animal1 = "quick brown fox";
        String animal2 = "lazy dog";
        String article = "the ";
        String action = "jumps over";
        String space = " ";
        String sentence = "";
        sentence = sentence.concat(article+ animal1+action + article + animal2);
        System.out.println(sentence);
    }
}