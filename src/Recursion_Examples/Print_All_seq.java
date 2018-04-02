package Recursion_Examples;

/**
 * Created by Akash on 3/27/18.
 */
public class Print_All_seq {
    public static void main(String[] args){

    }

    public void print_all(int n,int s,int k)
    {
        if(s ==  1)
        {
             System.out.print(n);
        }
        else
        {
            print_all(n-1,s-1, k);
        }

    }


    /*

    n =5,s =3, k = 2

    5 5 5
    5 5 4
    5 4 5
    5 4 3
    5 4 4
    5 6 7
    5 5 6
    5 6 5
    5 6 6


     */
}
