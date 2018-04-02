/**
 * Created by Akash on 10/5/17.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Anagrams {
//    public static int numberNeeded(String first, String second) {
//
//        /*
//            a b c
//          0 1 2 3
//        c 1 2 3 2
//        d 2 3 4 3
//        e 3 4 5 4
//
//            b a c d c
//          0 1 2 3 4 5
//        d 1 2 3 4 3 4
//        c 2 3 4 3 4 3
//        b 3
//        a 4
//        c 5
//        */
//
//        int[][] res = new int[first.length()+1][second.length()+1];
//        for(int i=0;i<=first.length();i++)
//        {
//            for(int j=0;j<=second.length();j++)
//            {
//
//                if(i==0 || j==0)
//                {
//                    if(i==0 && j==0)
//                    {
//                        res[0][0] = 0;
//                    }
//                    else if(j==0)
//                    {
//                        res[i][j] = i;
//                    }
//                    else if(i==0)
//                    {
//                        res[i][j] = j;
//                    }
//
//                }
//                else if(first.charAt(i-1)==second.charAt(j-1))
//                {
//                    res[i][j] = res[i-1][j-1];
//                }
//                else
//                {
//                    res[i][j] = Math.min(res[i][j-1],res[i-1][j])+1;
//                }
//            }
//        }
//
//        return res[first.length()][second.length()];
//
//    }





    private static final int NUM_LETTERS = 26;
    public static int numberNeeded(String first, String second) {
        /* For each string, create an array of the count of each character */
        int [] array1 = createFilledArray(first);
        int [] array2 = createFilledArray(second);

        /* Count number of deletions we need to make the Strings anagrams of each other */
        int deletions = 0;
        for (int i = 0; i < NUM_LETTERS; i++) {
            deletions += Math.abs(array1[i] - array2[i]);
        }
        return deletions;
    }

    /* Creates an array with the count of each character */
    private static int [] createFilledArray(String str) {
        int [] array = new int[NUM_LETTERS];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            array[ch - 'a']++;
        }
        return array;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}

