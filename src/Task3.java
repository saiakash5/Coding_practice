import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Akash on 10/1/17.
 */
public class Task3 {

    public static void main(String args[])
    {


//        String a = "ABba";
//        a =a.replace("B","");
//        System.out.println(a);

//        int size = 200000;
//        int[] A = new int[size];
//        for(int i=0;i<size;i++)
//        {
//            A[i]=0;
//        }
//
//        A[0]= 4;
//        A[4]= 10000;
//        A[10000]= 199999;
//        A[199999] =-1;
//
//
//
//        System.out.println(solution(A));

        int[] A = {900,910,920};
        int[] D = {930,915,925};
        int n=3;
        System.out.println(findMinGates(A,D,n));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8


        int i=0;
        int count =1;
        while(A[i]!=-1)
        {
            count ++;
            i = A[i];
        }
        return count;
    }


    static int findMinGates(int[] arrivals, int[] departures, int flights) {

        Arrays.sort(arrivals);
        Arrays.sort(departures);

        int plat_needed = 1, result = 1;
        int i = 1, j = 0;

        // Similar to merge in merge sort to process all events
        while (i < flights)
        {
            if (arrivals[i] < departures[j])
            {
                plat_needed++;
                if(plat_needed > result)
                {
                    result = plat_needed;
                }
                i++;
//                else
//                    j++;
            }
            else // Else decrements count of platforms needed
            {
                plat_needed--;
                j++;
            }
        }

        return result;

    }


    /*    1 4 -1 3 2
          0 1  2 3 4


          4      11

     */
}
