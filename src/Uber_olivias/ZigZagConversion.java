package Uber_olivias;

/**
 * Created by Akash on 10/11/17.
 */
public class ZigZagConversion {


    public static void main(String args[])
    {
        System.out.println(convert("UBERMPISHIRING",3));
    }

    public static String convert(String s, int nRows)
    {
        if(nRows==1) {
            return s;
        }
        int dis=2*nRows-2;
        int len=s.length();
        String result="";
        for(int i=0;i<nRows;i++)
        {
            for(int j=i;j<len;j+=dis)
            {
                result+=s.charAt(j);
                if(i>0 && i<nRows-1 && j+dis-2*i<len)
                {
                    result += s.charAt(j + dis - 2 * i);
                }
            }
        }
        return result;
    }
}