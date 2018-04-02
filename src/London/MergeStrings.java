package London;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.*;
/**
 * Created by Akash on 10/12/17.
 */

interface abc1
{
    public default int get()
    {
        return 1;
    }
}

interface abc2
{
    public default int get()
    {
        return 2 ;
    }
}


public  abstract class MergeStrings extends A {


    MergeStrings()
    {

    }
    static String mergeStrings(String a, String b) {

        StringBuilder sb = new StringBuilder();

        if(a.length()==1)
        {
            return a.concat(b);
        }

        int count = 0;
        for(int i=0;i<a.length();i++)
        {
            if(i<b.length())
            {
                sb.append(a.charAt(i));
                sb.append(b.charAt(i));
            }
            else
            {
                sb.append(b.substring(i+1,b.length()-1));
                break;
            }
            count =i;
        }

        if(a.length()<b.length())
        {
            sb.append(b.substring(a.length(),b.length()));
        }

        return sb.toString();
    }



    public static void main(String[] args) throws IOException, InterruptedException {

        TimeUnit j = TimeUnit.MICROSECONDS;
        Thread.sleep(2000);
//        StringBuilder sb = new StringBuilder("JAVA");
//        StringBuilder sb0 = new StringBuilder("JAVA");
//        String s = new String("JAVA");
//
//        System.out.println(s.equals(sb0));

//        int y = 5;
//        int c = 9;
//
//        if (true || --y == 4) {
//            System.out.println(y + c + " ");
//        }
//        try {
//            String s = "ggg";
//            int d = Integer.parseInt(s);
//        }
//        catch (IllegalArgumentException e)
//        {
//            System.out.println(e);
//        }
//        System.out.println(mergeStrings("ab","ZSD"));


//        String s1 = "r";
////        String s2 = "r";
//        String s2 = new String("r");
//        System.out.println("s1:"+s1.hashCode()+"s2:"+s2.hashCode()+s1.equals(s2));
//
//        System.out.println(s1==s2);

//        A a = new B();
//        a.method();
//        MergeStrings ms = new MergeStrings();
//        ms.go(22);

}

//    int x =013;
//    void go(final int i)
//    {
//        int p = i/x;
//        System.out.println(p);
//    }
}


class A
{
    protected static void method()
    {
        System.out.println("from A");
    }
}
class B extends A
{
    protected static void method()
    {
        System.out.println("from B");
    }
}
