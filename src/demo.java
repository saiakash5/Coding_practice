import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Akash on 9/30/17.
 */
public class demo {

    public static void main(String args[])
    {
        int[] A = {3,9};
//        System.out.println(solution(A));
        int i = 10;
        int j = 2;

        System.out.println("i is " + i);
        System.out.println("j is " + j);

        int k = i % j;
        int z = i/j;
        System.out.println("i%j is " + k);
        System.out.println("i/j is " + z);
//        Integer[] a = {1,1,2,3,4,4};
//        ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(a));
//
//        System.out.println(al);
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        int max =  Integer.MIN_VALUE;
        int min =  Integer.MAX_VALUE;
        int min_value = max;
        ArrayList<Integer> al = new ArrayList<>();

        for(int i= 0;i<A.length;i++)
        {
            if(!al.contains(A[i]))
            {
                al.add(A[i]);
                if(A[i]>max)
                {
                    max = A[i];
                }
                if(A[i]<min)
                {
                    min = A[i];
                }
            }

        }
        boolean c = false;

        if(max<0)
        {
            min_value =  1;
        }
        else if(min>1)
        {
            min_value=1;
        }
        else /*if(min<0 ||al.size()==1)*/
        {
//            c= true;
            min = 1;
            for(;al.contains(min);)
                min = min+1;
            min_value = min;
        }

//        if(c)
//        {
//            min = 0;
//            while(true)
//            {
//                min = min+1;
//                if(!al.contains(min))
//                    break;
//            }
//            min_value = min;
//        }



        return min_value;
    }
}
