import java.io.*;
import java.util.*;

class Solution {

    static int deletionDistance(String str1, String str2) {
        // your code goes here

        int str1_len = str1.length();
        int str2_len = str2.length();

        Integer memo[][] = new Integer[str1_len + 1][str2_len + 1];

        for(int i=0;i<str1_len+1;i++)
        {
            for(int j=0;j<str2_len+1;j++)
            {
                if(i==0)
                {
                    memo[i][j]=j;
                }
                else if(j==0)
                {
                    memo[i][j] = i;
                }
                else if(str1.charAt(i-1)==str2.charAt(j-1))
                {
                    memo[i][j] = memo[i-1][j-1];
                }
                else
                {
                    memo[i][j] = 1 + Math.min(memo[i-1][j],memo[i][j-1]);
                }
            }
        }
        return memo[str1_len][str2_len];
    }

    public static void main(String[] args) {

        String s1 = "heat";
        String s2 = "hit";
        System.out.print(deletionDistance(s1,s2));

    }

}