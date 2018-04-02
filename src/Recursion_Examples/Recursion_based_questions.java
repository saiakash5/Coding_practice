package Recursion_Examples;

/**
 * Created by Akash on 4/2/18.
 */
public class Recursion_based_questions {
    public static void main(String[] args)
    {
        Recursion r_obj = new Recursion();
        System.out.println(r_obj.factorial(5));
    }
}

class  Recursion
{
    public int factorial(int n)
    {
        if (n ==1)
        {
            return 1;
        }
        else
        {
            return n * factorial(n-1);
        }
    }
}
