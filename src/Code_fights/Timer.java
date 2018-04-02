package Code_fights;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Akash on 1/14/18.
 */
public class Timer {


    public static void main(String[] args)
    {
        A a1 = new B();
        B b1 = new B();
        String s = "ab";
        String b = "ab";
        int arr[] = new int[]{1,2,3};
        System.out.println(a1.run()+" "+ a1.si()+" "+ b1.run()+" "+b1.si());
        System.out.println(s.equals(b));
        System.out.println(s==b);



//
//        new Timer().ascii_deletion_distance("xyz","rty");
//        System.out.println(Arrays.binarySearch(ints[1],-1));
////        System.out.print(bracket_match("((())"));
////        System.out.println("aaa"+ a+b);

    }
    static abstract class a
    {
        abstract void aVoid();
    }
    public static int phoneCall(int min1, int min2_10, int min11, int s) {

        int mins=0;
        if(s>=min1)
        {
            s = s-min1;
            mins = mins+1;

        }
        for(int i=2;i<=10 && s>=min2_10;i++)
        {

            s = s - min2_10;
            mins = mins+1;

        }

        while(s>=min11)
        {
            s =s -min11;
            mins = mins+1;
        }

        return mins;

    }


    public static int almost_palindromes(String str) {

        StringBuilder sb = new StringBuilder(str);
        String temp = sb.reverse().toString();
        int score = 0;
        for(int i =0;i<str.length();i++)
        {
            if(str.charAt(i)!=temp.charAt(i))
            {
                score++;
            }
        }
        return score;

    }

    public  int ascii_deletion_distance(String str1, String str2) {

        System.out.print("hi");
        TreeSet<Character> ts1 = new TreeSet<>();
        TreeSet<Character> ts2 = new TreeSet<>();
        int score = 0;
        for(int i=0;i<str1.length();i++)
        {
            ts1.add(str1.charAt(i));
        }

        for(int i=0;i<str2.length();i++)
        {
            ts2.add(str2.charAt(i));
        }

        for(int i=0;i<str2.length();i++)
        {
            char temp = str2.charAt(i);
            if(!ts1.contains(temp))
            {
                score += (int)temp;
            }
        }

        for(int i=0;i<str1.length();i++)
        {
            char temp = str1.charAt(i);
            if(!ts2.contains(temp))
            {
                score += (int)temp;
            }
        }

        return score;

    }

    public static int four_letter_words(String sentence) {

        StringTokenizer st = new StringTokenizer(sentence," ");
        int result =0;
        while(st.hasMoreTokens())
        {
            String token = st.nextToken();
            if(token.length()==4)
            {
                result+=1;
            }
        }

        return result;
    }

    //"thought", "sloughs"  t h o g u    s l o u g h   t s l

    public static int bracket_match(String bracket_string) {

        Stack<Character> st = new Stack<>();
        int count = 0;
        for(int i=0;i<bracket_string.length();i++)
        {
            if(bracket_string.charAt(i)=='(')
            {
                st.push('(');
            }
            else
            {
                if(st.empty())
                {
                    count++;
                }
                else if(st.peek()=='(')
                {
                    st.pop();
                }
            }
        }
        count = count + st.size();
        return count;
    }

    abstract static class A
    {
        String run()
        {
            return "run from A";
        }
        String si()
        {
            return ("si from A");
        }
    }
    static class B extends A{


        String run()
        {
            return "run from B";
        }
        String si()
        {
            return ("si from B");
        }
    }

}
