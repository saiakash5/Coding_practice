package Code_fights;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Akash on 10/28/17.
 */
public class Palindrome {

    public static  void main(String args[]) {

        char c = '1';


        LocalDate date = LocalDate.of(2010,10,10);
        date.lengthOfMonth();
//        System.out.print();
        System.out.println(date+":"+date.isLeapYear());
        Integer n =90;

//        System.out.println(Character.getNumericValue(c)-2);
//        int[] ar = {6, 2, 3, 8};
//
//        double departure[] = new double[]{0.0,0.2};
//        double destination[] = new double[]{7,0.5};
//
//        System.out.println(perfectCity(departure,destination));
//
        String s = "AA";
        Double d = 10.0/0.0;
        System.out.println((d.isInfinite()));
//        System.out.println(s.lastIndexOf('e'));
        System.out.println(s.matches("[A-F]"));

//        Integer.parseInt(""+'c');

//        String[] ss = new String[]{"ab", "bb", "aa"};
//
//        Arrays.sort(ss);

//        String bbb = ""+(char)((int)('c'+1));

//        System.out.println(""+(char)((int)('c'+1)));
        StringBuilder sb;
//        System.out.println((char)('a'+0));


//        System.out.println(palindromeRearranging("abbcabb"));



//        Scanner in  = new Scanner(System.in);
//
//        System.out.println("Enter String :");
//        String s = in.next();
//        System.out.println(checkPalindrome(s));

//        System.out.println(shapeArea(3));
//        System.out.println(makeArrayConsecutive2(ar));
//        int arr[][] = {{0, 1, 1, 2}, {0, 5, 0, 0}, {2, 0, 3, 3}};
//        System.out.println(matrixElementsSum(arr));

//        String[] arr = {"aba", "aa", "ad", "vcd", "aba"};
//        System.out.println(allLongestStrings(arr));

//        String s1 = "co(de(fight)s)";
//
//        System.out.println(reverseParentheses(s1));

//        System.out.println(areSimilar(new int[]{1,2,2},new int[]{2,1,1}));



//        System.out.println(commonCharacterCount(s1,s2));
//        System.out.println(isIPv4Address(".316.254.1"));
//
//        System.out.println(avoidObstacles(new int[]{5, 3, 6, 7, 9}));

//        boolean abc[][] = new boolean[][]{{true,false,false},
//                {false,true,false},
//                {false,false,false}};
//
//        System.out.println(minesweeper(abc));

//        System.out.println(chessBoardCellColor("A1","H3"));

//        System.out.println(stringsRearrangement(new String[]{"abc", /* bbc   */
//                "bef",
//                "bcc",
//                "bec",
//                "bbc",
//                "bdc"}));
//        System.out.println(arrayMaxConsecutiveSum(new int[]{1, 3, 2, 4},3));
//        System.out.println(digitDegree(5));
//        System.out.println(bishopAndPawn("h1","h3"));

//        System.out.println(isBeautifulString("aabbb"));
//        System.out.println(chessKnight("d5"));
    }

//    static int chessKnight(String cell) {
//
//        int res = 8;
//        int left = cell.charAt(0)-'a'-1;
//        int right = 'h'-cell.charAt(0)-1;
//        int diff1 = right-left;
//        int top = Character.getNumericValue(cell.charAt(1))+2;
//        int bottom = Character.getNumericValue(cell.charAt(1))-2;
//
//        int diff2 = top-bottom;
//
//
//        if(diff1<4)
//
//
//        return res;
//
//    }
    static String lineEncoding(String s) {

       String res = "";



        return res;
    }


    static boolean isMAC48Address(String inputString) {

        String arg[] = inputString.split("-");

        if(arg.length!=6)
        {
            return false;
        }

        for(String s : arg)
        {
            if(!s.matches("[A-F0-9]"))
                return false;
        }

        return true;

    }

    static boolean isBeautifulString(String inputString) {

        TreeMap<Character,Integer> hm = new TreeMap<>();
        for(int i=0;i<26;i++)
        {
            hm.put((char)('a'+i),0);
        }
        for(int i=0;i<inputString.length();i++)
        {
            char c = inputString.charAt(i);
            if(!hm.containsKey(c))
            {
                hm.put(c,1);
            }
            else
            {
                int x = hm.get(c);
                x++;
                hm.remove(c);
                hm.put(c,x);
            }
        }
        ArrayList<Integer> al = new ArrayList<>();

        Iterator it = hm.values().iterator();
        while(it.hasNext())
        {
            al.add((int)it.next());
        }

        int[] res = new int[al.size()];
        for(int i=0;i<res.length;i++)
        {
            res[i] = al.get(i);
        }

        for(int i=1;i<res.length;i++)
        {
            if(res[i]>res[i-1])
            {
                return false;
            }

        }
        return true;
    }




    static boolean bishopAndPawn(String bishop, String pawn) {

        int val1 = Math.abs(bishop.charAt(0)-bishop.charAt(0));
        int val2 = Math.abs(bishop.charAt(1)-bishop.charAt(1));

        return (Math.abs(bishop.charAt(0)-bishop.charAt(0))==Math.abs(bishop.charAt(1)-bishop.charAt(1)));
    }




    static int digitDegree(int n) {

        String num = ""+n;
        int count=0;
        do
        {
            num = sum1(num);
            count++;
//            System.out.println(num.length());
        }
        while(num.length()!=1);

        return count;

    }

    static String sum1(String num)
    {
        int n = Integer.parseInt(num);
        int res = 0;
        while(n>0)
        {
            res = res + (n%10);
            n = n/10;
        }
        return res+"";
    }
    static double perfectCity(double[] departure, double[] destination) {

        double dis1=0.0,dis2 = 0.0,dis = 0.0;


        if(departure[0] == destination[0])
        {
            return Math.abs(departure[1] -destination[1]);
        }
        else if(departure[1] == destination[1])
        {
            return Math.abs(departure[0] -destination[0]);
        }
        else if(departure[0]==0.0 || departure[1]==0.0 || destination[0]==0.0 || destination[1] == 0.0)
        {
           return Math.abs(departure[0]-destination[0])+Math.abs(departure[1]-destination[1]);
        }
        else
        {
            if(departure[0]<destination[0])
            {
                dis1 = Math.ceil(departure[0])-departure[0];
                dis2 = Math.abs(destination[0]-Math.ceil(departure[0]));
                dis = dis1+dis2+Math.abs(destination[1]-departure[1]);
            }
            else
            {
                dis1 = Math.ceil(destination[0])-destination[0];
                dis2 = Math.abs(departure[0]-Math.ceil(destination[0]));
                dis = dis1+dis2+Math.abs(destination[1]-departure[1]);
            }
        }

        return dis;
    }





    static int arrayMaxConsecutiveSum(int[] inputArray, int k) {

        int max = Integer.MIN_VALUE;
        for(int i = 0;i<=inputArray.length-k;i++)
        {
            int count = 0;
            int sum = 0;

            for(int j=0;j<k;j++)
            {
                sum = sum + inputArray[j+i];
            }
            if(sum>max)
            {
                max = sum;
            }
        }

        return max;
    }



    static boolean stringsRearrangement(String[] inputArray) {

        ArrayList<String> al = new ArrayList<>();

        for(String s : inputArray)
        {
            al.add(s);
        }
        int count = 0;

        for(int i=0;i<inputArray.length;i++)
        {


//            if(!checking(inputArray[i],al))
//            {
//                return false;
//            }


        }
        return true;

    }


    static String checking(String inputArray, ArrayList al)
    {
        String res = null;
        for(int j=0;j<inputArray.length();j++)
        {
            StringBuilder sb = new StringBuilder();
            int c = (int)inputArray.charAt(j);

            sb.append(inputArray.substring(0,j));
            sb.append("" + (char) ((int) ((char) (inputArray.charAt(j) + 1))));

            sb.append(inputArray.substring(j+1,inputArray.length()));

            if(al.contains(sb.toString()))
            {
                return res;

            }
        }
        return res;
    }

    static boolean chessBoardCellColor(String cell1, String cell2) {



            return Math.abs(cell1.charAt(0) - cell2.charAt(0)) % 2 == Math.abs(cell1.charAt(1) - cell2.charAt(1)) % 2;

    }




    static int[][] minesweeper(boolean[][] matrix) {

        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] res = new int[rows][columns];

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                if(matrix[i][j])
                {
                    if(i-1>=0)
                    {
                        res[i-1][j] = res[i-1][j]+1;
                        if(j-1>=0)
                        {
                            res[i-1][j-1] = res[i-1][j-1] + 1;
                        }
                        if(j+1<columns)
                        {
                            res[i-1][j+1] = res[i-1][j+1] + 1;
                        }
                    }
                    if(j-1>=0)
                    {
                        res[i][j-1]= res[i][j-1] +1;

                    }
                    if(i+1<rows)
                    {
                        res[i+1][j] = res[i+1][j] + 1;
                        if(j+1<columns)
                        {
                            res[i+1][j+1]=res[i+1][j+1]+1;
                        }
                        if(j-1>=0)
                        {
                            res[i+1][j-1] = res[i+1][j-1] + 1;
                        }

                    }
                    if(j+1<columns)
                    {
                        res[i][j+1] = res[i][j+1] + 1;

                    }


                }
            }
        }





        // for(int i=0;i<rows;i++)
        // {
        //     for(int j=0;j<columns;j++)
        //     {
        //         res[i][j] = 1;
        //     }
        // }

//     for(int i = 0;i< rows;i++)
//     {
//         for(int j=0;j<columns;j++)
//         {
//             if(matrix[i][j])
//             {
//                 if(i-1>=0)
//                 {
//                     res[i-1][j]=res[i-1][j]+1;
//                 }
//                 else if(i+1<rows)
//                 {
//                     res[i+1][j]=res[i+1][j]+1;
//                 }
//                 else if(j-1>=0)
//                 {
//                     res[i][j-1]= res[i][j-1]+1;
//                 }
//                 else if(j+1<columns)
//                 {
//                     res[i][j+1]= res[i][j+1]+1;
//                 }
//             }

//         }
//     }

        return res;

    }



    public static boolean checkPalindrome(String inputString) {
        boolean check = true;
        for (int i = 0, j = inputString.length() - 1; i != j && i <= j; i++, j--) {
            if (inputString.charAt(i) != inputString.charAt(j)) {
                check = false;
                break;
            }
        }

        return check;
    }


    static int shapeArea(int n) {

        return ((n) * (n)) + ((n - 1) * (n - 1));
    }

    static int makeArrayConsecutive2(int[] statues) {

        Arrays.sort(statues);
        int count = 0;
        for (int i = 1; i < statues.length; i++) {
            if (statues[i - 1] + 1 != statues[i]) {
                count = count + statues[i] - statues[i - 1] - 1;
            }
        }

        return count;

    }


    static int matrixElementsSum(int[][] matrix) {

        int rows = matrix.length;
        int columns = matrix[0].length;

        boolean check2 = true;
        int sum = 0;
        for (int i = 0; i < columns; i++) {
            boolean check1 = true;
            for (int j = 0; j < rows; j++) {
                if (matrix[j][i] == 0) {
                    check1 = false;
                }
                if (check1) {
                    sum = sum + matrix[j][i];
                }
            }
        }

        return sum;

    }


    static String[] allLongestStrings(String[] inputArray) {


        int sum = 0;
        int max_length = Integer.MIN_VALUE;
        int[] arr1 = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            arr1[i] = inputArray[i].length();
            if (inputArray[i].length() >= max_length) {

                max_length = inputArray[i].length();
            }

        }
        ArrayList<String> al = new ArrayList<>();

        for (int i = 0; i<arr1.length;i++) {
            if (max_length == arr1[i]) {
                al.add(inputArray[i]);
            }
        }
        String[] res = new String[al.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = al.get(i);
        }

        return res;
    }


    static int commonCharacterCount(String s1, String s2) {

        HashMap<Character,Integer> hm = new HashMap<>();
        int count =0;

        for(int i=0;i<s1.length();i++)
        {
            char k = s1.charAt(i);
            if(!hm.containsKey(k))
            {
                hm.put(k,1);
            }
            else
            {
                int j = hm.get(k);
                j++;
                hm.remove(k);
                hm.put(k,j);
            }
        }
        for(int i=0;i<s2.length();i++)
        {
            char k = s2.charAt(i);
            if(hm.containsKey(k))
            {
                int j = hm.get(k);
                j--;
                hm.remove(k);
                if(j>0) {
                    hm.put(k, j);
                }
                count++;
            }
        }


        return count;
    }



    static boolean isLucky(int n) {


        String s = Integer.toString(n);
        int length = s.length();
        int x1 = sum(Integer.parseInt(s.substring(0,s.length()/2)));
        int x2 = sum(Integer.parseInt(s.substring((s.length()/2),s.length())));

        if(x1==x2)
        {
            return true;
        }
        else
        {
            return false;
        }



    }

    static int sum(int n)
    {
        int sum = 0;
        while(n!=0)
        {
            sum = sum + (n%10);
            n = n /10;
        }

        return sum;
    }


    static String reverseParentheses(String s) {
        int st = s.lastIndexOf('(');
        while(st != -1) {
            int ed = s.indexOf(')', st);
            String t = s.substring(0, st);
            t += new StringBuffer(s.substring(st + 1, ed)).reverse().toString();
            t += s.substring(ed + 1);
            s = t;
            st = s.lastIndexOf('(');
        }
        return s;
    }


    static boolean areSimilar(int[] a, int[] b) {

        int count =1;
        boolean res = true;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=b[i] && count>0)
            {
                int value1 = position(a,b[i]);
                int value2 = position(b,a[i]);
                if(value1 != -1 && value2 != -1)
                {
                    int temp1 = a[value1];
                    a[value1] = a[i];
                    a[i] = temp1;

//                    int temp2 = b[value2];
//                    b[value2] = b[i];
//                    b[i] = temp2;
                }
                else
                {
                    res = false;
                    break;
                }
                count--;
            }
            else if(count==0 && a[i]!=b[i])
            {
                res = false;
                break;
            }
        }
        return res;
    }

    static int position(int[] a, int key)
    {
        int value = -1;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==key)
            {
                value = i;
                break;
            }
        }
        return value;
    }


    static boolean palindromeRearranging(String inputString) {

        boolean res = true;
        HashMap<Character,Integer> hm = new HashMap<>();

        for(int i=0;i<inputString.length();i++)
        {
            char c = inputString.charAt(i);
            if(!hm.containsKey(c))
            {
                hm.put(c,1);
            }
            else
            {
                int k = hm.get(c);
                k++;
                hm.remove(c);
                hm.put(c,k);
            }
        }

        Iterator it = hm.values().iterator();
        int count =1;
        if(hm.size()==1)
        {
            res = true;
        }
        else
        {
            while(it.hasNext())
            {
                int value = (int)it.next();
                if(value%2!=0 )
                {
                    if(count==0) {
                        res = false;
                        break;
                    }
                    else
                    {
                        count--;
                    }
                }
            }
        }
        return res;
    }


    static boolean isIPv4Address(String inputString) {


        String[] nums = inputString.split("\\.");

            for(String num : nums)
            {
                try {


                    int n = Integer.parseInt(num);
                    if (!(n >= 0 && n < 256)) {
                        return false;
                    }
                }
                catch (Exception e)
                {
                    return false;
                }
            }


        return true;
    }


    static int avoidObstacles(int[] inputArray) {

        ArrayList<Integer> al = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i : inputArray)
        {
            if(i>max)
            {
                max = i;
            }
            al.add(i);
        }
        int res = -1;
        boolean check = true;
        for(int i=2;i<max+1 && check;i++)
        {
            int k=i;
            while(k<max+1)
            {
                if(!al.contains(k)) {
                    k=k+i;
                    if(k>max) {
                        res = i;
                        check = false;
                        break;
                    }
//                    check = check && true;
                }
                else {
//                    check = false;
                    res =-1;
                    break;
                }
            }
//            if(check) {
//                res = i;
//            }
        }

        if(res == -1)
            return max+1;
        else
            return res;
    }





}
