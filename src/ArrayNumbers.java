/**
 * Created by Akash on 9/30/17.
 */
import java.util.*;
public class ArrayNumbers {

    public static void main(String args[])
    {
//        int[] A = {9, 5, 7, 3, 2, 7, 3, 1, 10, 8};
//
//        System.out.println(solution(A));

        System.out.println(((90)/30) + " x/y");
        System.out.println(((90)%30) + " x%y");

    }


/*


    3 1 2 4 3
    sum = 13
    3 1 2 4 3

    3
    13-3 = 10    min =10

    1
    9-4 = 5      min=5


 */

    public static  int solution(int[] A) {
        // write your code in Java SE 8
        long pro1 = 1;
        for(int i : A)
        {
            pro1 = pro1*i;
        }
        return  1;
    }
    public static int solution4(int[] A ) {

        int sum =0;
        int min = Integer.MAX_VALUE;
        for(int i : A)
        {
            sum =sum+i;
        }
        int j=0;
        for(int i=1;i<A.length ; i++ )
        {
            j=j+A[i-1];
            sum = sum-(A[i-1]);
            int diff = Math.abs(sum-j);
            if(diff<min) {
                min = diff;
            }

//
//            if(sum-j<min)
//            {
//                min = sum-j;
//            }
//            sum = sum -j;

        }
        return min;
    }




    public static int solution1(int[] A) {
        // write your code in Java SE 8
        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int i: A)
        {
            if(!hm.containsKey(i))
            {
                hm.put(i,1);
            }
            else
            {
                int k = hm.get(i);
                k++;
                hm.replace(i,k);
            }
        }
        int result =0;
        for( int i : hm.keySet())
        {
            if(hm.get(i)%2!=0)
            {
                result = i;
            }
        }
        return result;
    }

    public static int[] solution2(int[] A, int k) {
        // write your code in Java SE 8
        if(A.length>0) {
            for (int i = 1; i <= k; i++) {
                A = rotateByOne(A);
            }
            return A;
        }
        else
            return A;

    }
    public static int[] rotateByOne(int[] A)
    {
        int temp=A[A.length-1],t;

        for (int i=A.length-2;i>=0;i--)
        {
            A[i+1]= A[i];

        }
        A[0]=temp;
        return A;
    }




    public static int solution3(int X, int Y, int D) {
        // write your code in Java SE 8
//        int count=0;
//        long sum=X;
//        do
//        {
//            sum = sum + D;
//            count++;
//
//        }while(sum<Y);
//
//        return count;

        int diff = Y-X;

        if(diff>0)
        {
            if(diff%D==0)
                return diff/D;
            else
                return (diff/D)+1;

        }
        else
        {
            return 0;
        }
    }

}
