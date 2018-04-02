package Code_fights;



import static java.lang.System.*;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by Akash on 1/5/18.
 */
public class TradeDesk {
    static int x =4;
    public static void main(String args[])
    {
        int x =10;
//        for(int x=8;x<90;x++)
        x++;
        System.out.println(x--);
//        System.out.println(question1(new String[]{"greeneggs","ham","sam","i","am"}));
//        System.out.println(question2(new String[]{"greeneggs","ham","sam","i","am"}));
//        System.out.println(PI);
//        System.out.println( (2*'c'));
//        System.out.println(question3());

    }

    public static String question1(String[] strings)
    {
        TreeMap<Character,Integer> ordered_characters = new TreeMap<>();
        String cancatenated_string = "";
        String result = "";
        for(String value : strings)
        {
            cancatenated_string+=value;
        }

        for(int i=0;i<cancatenated_string.length();i++)
        {
            Character key = cancatenated_string.charAt(i);
           if(ordered_characters.containsKey(cancatenated_string.charAt(i)))
           {
               int count = ordered_characters.get(key);
               count++;
               ordered_characters.put(key,count);
           }
           else
           {
               ordered_characters.put(key,1);
           }
        }
        for(Character i : ordered_characters.keySet())
        {
            int count = ordered_characters.get(i);
            result+=repeat(i+"",count);

        }
        return result;
    }

    public static String question2(String[] strings)
    {
        String cancatenated_string = "";
        String res="";
        int[] arr = new int[26];
        for(String value : strings)
        {
            cancatenated_string+=value;
        }

        for(int i=0;i<cancatenated_string.length();i++)
        {
            arr[(int)cancatenated_string.charAt(i)-97]++;
        }

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {

                res+= repeat(Character.toString((char) (i+97))+"",arr[i]);
            }
        }
        return res;
    }
    public static String repeat(String str, int times) {
        StringBuilder sb = new StringBuilder(str.length() * times);
        for (int i = 0; i < times; i++)
            sb.append(str);
        return sb.toString();
    }

    public static String question3()
    {
        return "works3";
    }
}
