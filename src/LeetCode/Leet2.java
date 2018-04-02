package LeetCode;

import Algorithms_And_DataStructures.LinkedList;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Akash on 3/23/18.
 */

/*
    a b c a b c b b
a   1
b
c
a
b
c
b
b
 */
public class Leet2
{
    public static void main(String args[])
    {


        String s = "abcabcbb";
//        System.out.println(new Solution().lengthOfLongestSubstring(s));
//        System.out.print(new Solution().findMedianSortedArrays(new int[]{1,2},new int[]{3,4}));

//        System.out.println(new Solution().egg_dropping(2,4));
//        new Solution().sortWave(new int[]{10,2,4,60,3,6,5});
//        System.out.println(new Solution().findBusiestPeriod(new int[][]{{1487799425,14,1},{1487799425,4,0},{1487799425,2,0},{1487800378,10,1},{1487801478,18,0},{1487801478,18,1},{1487901013,1,0},{1487901211,7,1},{1487901211,7,0}}));

        new Solution().printSpiral(new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}});
    }
}

//efinition for singly-linked list.


  class Solution {



//      public  int findBusiestPeriod(int[][] data) {
//          // your code goes here
//
////          int sum = 0;
////          int temp = 0;
////          int res = 0;
////          for(int i=0;i<data.length-1;i++)
////          {
////              if(data[i+1][0]==data[i][0])
////              {
////                  if(data[i+1][2] == 1)
////                  {
////                      sum+=data[i+1][1];
////                  }
////                  else
////                  {
////                      sum-=data[i+1][1];
////                  }
////                  if(data[i][2] == 1)
////                  {
////                      sum+=data[i][1];
////                  }
////                  else
////                  {
////                      sum-=data[i][1];
////                  }
////              }
////              else
////              {
////                  if(data[i][2] == 1)
////                  {
////                      sum+=data[i][1];
////                  }
////                  else
////                  {
////                      sum-=data[i][1];
////                  }
////              }
////
////              if(sum>=res)
////              {
////                  res = sum;
////                  temp = data[i][0];
////              }
////          }
////          return temp;
//
//             /*
//    {1487799425,14,1}
//    {1487799425,4,0},
//    {1487799425,2,0},
//    {1487800378,10,1},
//    {1487801478,18,0},
//    {1487801478,18,1},
//    {1487901013,1,0},
//    {1487901211,7,1},
//    {1487901211,7,0}
//     */
//
//          int time = 0;
//          int buffer  = 0;
//          int res = 0;
//          int i=0;
//          while(data[i][0]==data[1][0])
//          return time;
//
//      }

     public int lengthOfLongestSubstring(String s) {
         int n = s.length();
         Set<Character> set = new HashSet<>();
         int ans = 0, i = 0, j = 0;
         while (i < n && j < n) {
             char c = s.charAt(j);
             // try to extend the range [i, j]
             if (!set.contains(c)){
                 set.add(s.charAt(j++));
                 ans = Math.max(ans, j - i);
             }
             else {
                 set.remove(s.charAt(i++));
             }
         }
         return ans;
     }


     public void printSpiral(int[][] arr)
     {
         int m = arr.length-1;
         int n = arr[0].length-1;

         int T = 0, B = m,L=0,R=n;
         int dir = 0;

         while(T <= B && L <= R)
         {
             if(dir==0) {
                 for (int i = L; i <= R; i++) {
                     System.out.println(arr[T][i]);

                 }
//                 dir = 1;
                 T++;
             }
             else if (dir==1) {
                 for (int i = T; i<=B;i++) {
                     System.out.println(arr[i][R]);

                 }
//                 dir = 2;
                 R--;
             }
             else if (dir == 2) {
                 for (int i = R ; i >= L ; i-- ) {
                     System.out.println(arr[B][i]);

                 }
                 B--;
//                 dir = 3;
             }
             else if (dir == 3) {
                 for (int i = B;i>=T;i--) {
                     System.out.println(arr[i][L]);
                 }
                 L++;
//                 dir = 0;
             }
             dir = (dir+1)%4;

         }
     }


//     public String longestPalindrome(String s) {
//
//         /*
//       babad
//
//          */
//         int i=0,j=0,n =s.length();
//         String res="";
//         int len = 0;
//         Set<String> st = new HashSet<>();
//         while(i<n||j<n)
//         {
//             String t = s.substring(i,j);
//             if(check_Palin(t) && t.length()>len )
//             {
//                 res = s.substring(i,j);
//                 j++;
//             }
//             {
//
//             }
//
//
//         }
//     }

//     public boolean check_Palin(String s)
//     {
//
//     }


     public double findMedianSortedArrays(int[] nums1, int[] nums2) {

         /*

         1,2,4,5,6--->5
         3,7,8------->3

         7===1--->

         9/2

          */
         int l1 = nums1.length-1;
         int l2 = nums2.length-1;
         int sum = 0;
         while(l1>0 || l2>0)
         {

         }

         return sum/((double)l1+(double)l2);

     }


     public int egg_dropping(int n,int k)
     {
         /*
                 0 1 2 3 4 5 6 7
               0
               1 1 2 3 4 5 6 7
               2 1

               min(1+max(0,1),1+max(1,0)) = min(2,2) = 2
          */
         int[][] egg_floor = new int[n+1][k+1];
         int res;
         for(int i=1;i<n+1;i++)
         {
             egg_floor[i][1] = 1;
             egg_floor[i][0] = 0;
         }

         for (int i=1;i<k+1;i++)
         {
             egg_floor[1][i] = i;
         }

         for(int i=2;i<n+1;i++)
         {
             for(int j=2;j<k+1;j++)
             {
                 egg_floor[i][j] = Integer.MAX_VALUE;
                 for (int x=1;x<j+1;x++)
                 {
                     res = 1 + Math.max(egg_floor[i-1][x-1],egg_floor[i][j-x]);
                     if(res<egg_floor[i][j])
                     {
                         egg_floor[i][j] = res;
                     }
                 }
             }
         }
         return egg_floor[n][k];
     }


     public void sortWave(int[] arr)
     {
         Arrays.sort(arr);
         for(int i=2;i<arr.length;i = i+2)
         {
             arr = swap(arr,i,i-2);
         }
         arr = swap(arr,arr.length-2,arr.length-1);

         System.out.println(arr);
     }
     public int[] swap(int[] arr,int i,int j)
     {
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
         return arr;

     }

     public void buy_sell(int[] input)
     {
         for(int i=0;i<input.length;i++)
         {

         }
     }





     /*
         a b c a b c b b
                   i
                       j
         set = {a,b}
         i=0,j=0
         ans = 0

         loop1:

         {a}
         j=0+1
         ans = max(0,j-i) = (0,1) = 1

         loop2:




      */

}