package WhitePages;

import com.sun.tools.corba.se.idl.InterfaceGen;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Akash on 10/20/17.
 */
public class ArrayHopper {
    public static void main(String args[])
    {
        int[] ar = {2,3,1,1,2,4,2,0,1,1};
//        System.out.println(hops(ar));
//        Scanner in = new Scanner(System.in);
        String result = "";
        String v = null;
        try {
            try {
                result += "before";
                v.length();
                result += "after";
            } catch (NullPointerException e) {
                result += "catch";
//                throw new RuntimeException();
            } finally {
                result += "finally";
                throw new Exception();
            }
        }

        catch (Exception e) {
                 result += "done";
        }



        System.out.println(result);



//        ArrayList<Integer> al = new ArrayList<>();
//        al.add(5);
//        al.add(6);
//        al.add(0);
//        al.add(4);
//        al.add(2);
//        al.add(4);
//        al.add(1);
//        al.add(0);
//        al.add(0);
//        al.add(4);
//        while(in.hasNext())
//        {
////            al.add(in.nextInt());
//            System.out.println((Integer.parseInt(in.nextLine())));
//        }
//        System.out.println(al);
//        Integer[] arr = new Integer[al.size()];
//        arr = al.toArray(arr);
//        System.out.println(hops(arr)+"   "+hop(arr));

//        System.out.println(findMinNoOfHops(arr));
//
//        System.out.println(minHops(arr));
    }

    public static int hops
            (Integer[] arr)
    {
        StringBuilder sb = new StringBuilder();
        int [] position = new int[arr.length];
        int[] jumps = new int[arr.length];
        jumps[0]= 0;

        sb.append(0);

        for(int i=1; i<jumps.length;i++)
        {
            jumps[i] = Integer.MAX_VALUE-1;
        }

        for(int i = 1;i< arr.length;i++)
        {
            for (int j=0;j<i;j++)
            {
                if(j+arr[j]>=i)
                {
                    if(jumps[i]>jumps[j]+1) {
                        jumps[i] = jumps[j] + 1;
//                        sb.append(arr[j]);
//                        System.out.println(i);
                    }
                }

                sb.append(i);
            }
        }

        return jumps[jumps.length-1];
    }

    public static int  hop(Integer[] arr)
    {


        if(arr.length<=1)
        {
            return 0;
        }
        int ladder = arr[0];
        int stairs = arr[0];
        int jump = 1;
        for(int level = 1;level< arr.length; level++ )
        {
            if(level == arr.length-1)
            {
                return jump;
            }

            if(level+arr[level]>arr[ladder])
            {
                ladder = level+arr[level];
            }
            stairs--;
            if(stairs==0)
            {
                jump++;
                stairs = ladder-level;
            }
        }
        return jump;

    }



    public static String findMinNoOfHops(Integer[] inArray) {

        if (inArray == null) {
            throw new IllegalArgumentException("No input array");
        } else if (inArray.length == 0) {
            throw new IllegalArgumentException("Input array is empty");
        }

        int[] interNextHop = new int[inArray.length];
        // calculate intermediate next hops
        for (int i = 0; i < inArray.length; i++) {
            interNextHop[i] = i + inArray[i];
        }

        StringBuilder hopsResult = new StringBuilder();
        String comma = new String(", ");
        int current = 0;
        hopsResult.append(current).append(comma);
        // Start searching for best next hop from position 0
        for (int i = 0; i < inArray.length; i++) {
            int arrayValue = inArray[current];
            int balanceToTraverse = inArray.length - 1 - current;

            if (arrayValue == balanceToTraverse) {
                hopsResult.append(inArray.length - 1).append(comma);
                current = inArray.length - 1;

            } else if (arrayValue < balanceToTraverse) {
                int bestNextHop = current;
                // check for the best next hop from current to (current + value)
                for (int j = current; j <= current + arrayValue; j++) {
                    if (interNextHop[j] > interNextHop[bestNextHop]) {
                        bestNextHop = j;
                    }
                }
                // if search is unsuccessful then return failure
                if (bestNextHop == current) {
                    hopsResult = new StringBuilder("failure\n");
                    break;
                }
                hopsResult.append(bestNextHop).append(comma);
                current = bestNextHop;
            } else {
                hopsResult.append("out");
                break;
            }
        }
//        System.out.println(hopsResult.toString());
        return hopsResult.toString();

    }


    public static String minHops(Integer[] array)
    {
        int[]  jumps = new int[array.length];

        for(int i=0;i<array.length;i++)
        {
            jumps[i] = i + array[i];
        }

        StringBuilder result = new StringBuilder();
        String comma = ",";
        int current_position = 0;

        result.append(current_position).append(", ");

        for(int i=0;i<array.length;i++)
        {
            int value = array[current_position];
            int balance_value = array.length - 1 - current_position;

            if(value == balance_value)
            {
                result.append(array.length-1).append(", ");
                current_position = array.length - 1;
            }
            else if(value < balance_value)
            {
                int next_hop = current_position;

                for(int j=current_position;j<=current_position+value;j++)
                {
                    if(jumps[j]>jumps[next_hop]){
                        next_hop = j;
                    }
                }

                if(next_hop == current_position)
                {
                    result = new StringBuilder("failure\n");
                    break;
                }

                result.append(next_hop).append(", ");
                current_position = next_hop;
            }
            else
            {
                result.append("out");
                break;
            }


        }
        return result.toString();
    }
}
