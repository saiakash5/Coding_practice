package Pramp;


import java.io.*;
import java.util.*;


class Sentence_reverse
{
    public static void main(String args[])
    {
//       System.out.println(reverseWords(new char[]{' ',' '}));
        System.out.println(arithmeticExpression(8,3,2));
    }

    static boolean arithmeticExpression(int a, int b, int c) {

        return ((a+b==c)||(a-b==c)||(a/b==c)||(a*b==c)?true:false);

    }



    static char[] reverseWords ( char[] arr)
    {
        // your code goes here
        
        char res[] = new char[arr.length];
        String s = "";
        String rev = "";
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }
        String arrS[] = s.split(" ");
        if(arrS.length>0) {
            for (int i = arrS.length - 1; i >= 0; i--) {
                if (i != 0)
                    rev += arrS[i] + " ";
                else
                    rev += arrS[i];
            }

            for (int i = 0; i < arr.length; i++) {
                res[i] = rev.charAt(i);
            }
        }
        else
        {
            return arr;
        }
        return res;
    }

//    static char[] reverse_words(char arr[])
//    {
//        arr = mirror(arr,0,arr.length);
//        int check=0;
//        for (int i =0;i<arr.length;i++)
//        {
//            if(arr[i]==' ')
//            {
//                arr=mirror(arr,check,i-1);
////                check=
//            }
//        }
//
//
////    }

    static char[] mirror(char arr[],int start,int end)
    {
        char tmp;
        while(start<end)
        {
            tmp=arr[start];
            arr[start]= arr[end];
            arr[end]=tmp;
            start++;
            end--;
        }
        return arr;
    }



}


