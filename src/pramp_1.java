import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Akash on 10/9/17.
 */
public class pramp_1 {
    public static void main(String args[])
    {
        StringBuilder sb1 = new StringBuilder("  8274");
        StringBuilder sb2 = new StringBuilder("ewuey");
        sb1.append(sb2).toString();
        System.out.println(convert("UBERMPISHIRING",4));
//
//        ConcurrentHashMap<>
//        //UMHNBRPSIIGEIR
    }


    static String convert(String s, int numRows) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();

        for(int i=1;i<=s.length();i++)
        {
            if(i%numRows==1&& i<=s.length())
            {
                sb1.append(s.charAt(i-1));
                i++;
            }
            if(i%numRows==2 && i<=s.length())
            {
                sb2.append(s.charAt(i-1));
                i++;
            }
            if(i%numRows==0 && i<=s.length())
            {
                sb3.append(s.charAt(i-1));
                i++;
                if(i<=s.length())
                {
                    sb2.append(s.charAt(i-1));
                    i++;
                }
            }

        }
        return sb1.append(sb2).append(sb3).toString();

    }
}
