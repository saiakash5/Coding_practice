package Code_fights;

import java.util.*;

/**
 * Created by Akash on 12/18/17.
 */
public class DeleteDigit {

    public static void main(String args[])
    {
        ArrayList<Integer> al = new ArrayList<>();
        HashMap<String,Integer> hm = new HashMap<>();

//        HashSet<Integer> hs = new HashSet<>();
//        List<Integer> l = new ArrayList<>();
//
//        int n = 1001;
//        StringTokenizer st = new StringTokenizer("abcdcef ,ashdb"," ,");
//
//        int sum = Integer.MIN_VALUE;
//
//        int len = Integer.toString(n).length();
//        int count = len;
//        String number = Integer.toString(n);
//        String temp = "";
//        int i=0;
//        while(count>0) {
//            for (int j = 0; j < len; j++) {
//                if(j != i)
//                    temp += number.charAt(j);
//            }
//            int v = Integer.parseInt(temp);
//            if (v > sum)
//                sum = v;
//            i++;
//            temp="";
//            count--;
//        }
//
////        while(count>0)
////        {
////            for(;i<len && i!=len-1;i++)
////            {
////                temp+=number.charAt(i);
////            }
////            int v = Integer.parseInt(temp);
////            if(v>sum)
////                sum = v;
////            count--;
////            temp = "";
////            i++;
////
////        }
//
//        System.out.println(sum);

//        System.out.println(digitsProduct(12));

//        System.out.println(fileNaming(new String[]{"a(1)",
//                "a(6)",
//                "a",
//                "a",
//                "a",
//                "a",
//                "a",
//                "a",
//                "a",
//                "a",
//                "a",
//                "a"}));

//        System.out.println(messageFromBinaryCode("010010000110010101101100011011000110111100100001"));

//        System.out.println(spiralNumbers(3));
        System.out.println(sudoku(new int[][]{
                {1,3,2,5,4,6,9,8,7},
                {4,6,5,8,7,9,3,2,1},
                {7,9,8,2,1,3,6,5,4},
                {9,2,1,4,3,5,8,7,6},
                {3,5,4,7,6,8,2,1,9},
                {6,8,7,1,9,2,5,4,3},
                {5,7,6,9,8,1,4,3,2},
                {2,4,3,6,5,7,1,9,8},
                {8,1,9,3,2,4,7,6,5}}));
//        System.out.println(sudoku(new int[][]{{
//            {1,3,2,5,4,6,9,8,7},
//            {4,6,5,8,7,9,3,2,1},
//            {7,9,8,2,1,3,6,5,4},
//            {9,2,1,4,3,5,8,7,6},
//            {3,5,4,7,6,8,2,1,9},
//            {6,8,7,1,9,2,5,4,3},
//            {5,7,6,9,8,1,4,3,2},
//            {2,4,3,6,5,7,1,9,8},
//            {8,1,9,3,2,4,7,6,5}
//        }}));
    }


    public static int digitsProduct(int product) {

        List<Integer> l = new ArrayList<Integer>();
        int ans = 0;
        if(product == 0) return 10;
        if(product == 1) return 1;
        for(int d = 9; d > 1; d--){
            while(product % d == 0){
                product /= d;
                l.add(d);
            }
        }
        if(product > 1) return -1;

        for(int i = l.size() - 1; i >= 0; i--){
            ans = 10 * ans + l.get(i);
        }
        return ans;
    }

/*

1    2    3   4    5    6    7   8   9   10
36   38   39  40   41   42   43  44  45  11
35   65   66  67   68   69   70  71  46  12
34   64   85  86   87   88   89  72  47  13
33   63   84  97   98   99   90  73  48  14
32   62   83  96  101  100   91  74  49  15
31   61   82  95  94    93   92  75  50  16
30   60   81  80  79    78   77  76  51  17
29   59   58  57  56    55   54  53  52  18
28   27   26  25  24    23   22  21  20  19

*/

    public static boolean sudoku(int[][] grid) {

//        boolean check = true;
//        for(int i = 0;i<grid.length;i++)
//        {
//            ArrayList<Integer> al = new ArrayList<>();
//            for(int j=0;j<grid[0].length;j++)
//            {
//                al.add(grid[i][j]);
//            }
//
//            for(int k=1;k<10;k++)
//            {
//                if(!al.contains(k))
//                {
//                    check =  false;
//                    break;
//                }
//            }
//        }
//        int l =0;
//        int diff = 3;
//        for(int i=0;i<9;i++)
//        {
//            ArrayList<Integer> al = new ArrayList<>();
//            for(int j=l;j<diff;j++)
//            {
//                al.a
//            }
//        }


//        return check;



        if (grid == null || grid.length != 9 || grid[0].length != 9)
            return false;
        // check each column
        for (int i = 0; i < 9; i++) {
            boolean[] m = new boolean[9];
            for (int j = 0; j < 9; j++) {
                if (grid[i][j] != '.') {
                    if (m[(int) (grid[i][j] - '1')]) {
                        return false;
                    }
                    m[(int) (grid[i][j] - '1')] = true;
                }
            }
        }

        //check each row
        for (int j = 0; j < 9; j++) {
            boolean[] m = new boolean[9];
            for (int i = 0; i < 9; i++) {
                if (grid[i][j] != '.') {
                    if (m[(int) (grid[i][j] - '1')]) {
                        return false;
                    }
                    m[(int) (grid[i][j] - '1')] = true;
                }
            }
        }

        //check each 3*3 matrix
        for (int block = 0; block < 9; block++) {
            boolean[] m = new boolean[9];
            for (int i = block / 3 * 3; i < block / 3 * 3 + 3; i++) {
                for (int j = block % 3 * 3; j < block % 3 * 3 + 3; j++) {
                    if (grid[i][j] != '.') {
                        if (m[(int) (grid[i][j] - '1')]) {
                            return false;
                        }
                        m[(int) (grid[i][j] - '1')] = true;
                    }
                }
            }
        }

        return true;

    }
    public static String[] fileNaming(String[] names) {


        HashMap<String,Integer> hm = new HashMap<>();
        ArrayList<String> al = new ArrayList<>();
        for(String s : names)
        {
            if(hm.containsKey(s))
            {
                int x = hm.get(s);
                String temp = s+"("+x+")";
                while(hm.containsKey(temp))
                {
                    x++;
                    temp = s+"("+x+")";
                }
                al.add(temp);
                hm.put(temp,1);
                x++;
                hm.replace(s,x);
            }
            else
            {
                hm.put(s,1);
                al.add(s);
            }
        }
        String[] res = new String[al.size()];
        for(int i=0;i<al.size();i++)
        {
            res[i] = al.get(i);
        }

        return res;
    }

    public static String messageFromBinaryCode(String code) {

        String result = "";
        String temp = "";
        for(int i=1; i<=code.length();i++)
        {
            temp = temp+""+code.charAt(i-1);
            if(i%8==0)
            {
                result+=(char)(Integer.parseInt(temp,2));
                temp = "";
            }
        }

        return result;
    }

    public static int[][] spiralNumbers(int n)
    {
        int[][] grid = new int[n][n];
        int i, k = 0, l = 0;
        int m = n;
        /*  k - starting row index
        m - ending row index
        l - starting column index
        n - ending column index
        i - iterator
        */
        int value = 1;
        while (k < m && l < n)
        {
            // Print the first row from the remaining rows
            for (i = l; i < n; ++i)
            {
//                System.out.print(a[k][i]+" ");
                grid[k][i] = value;
                value++;
            }
            k++;

            // Print the last column from the remaining columns
            for (i = k; i < m; ++i)
            {
//                System.out.print(a[i][n-1]+" ");
                grid[i][n-1] = value;
                value++;
            }
            n--;

            // Print the last row from the remaining rows */
            if ( k < m)
            {
                for (i = n-1; i >= l; --i)
                {
//                    System.out.print(a[m-1][i]+" ");
                    grid[m-1][i] = value;
                    value++;
                }
                m--;
            }

            // Print the first column from the remaining columns */
            if (l < n)
            {
                for (i = m-1; i >= k; --i)
                {
//                    System.out.print(a[i][l]+" ");
                    grid[i][l]=value;
                    value++;
                }
                l++;
            }
        }

        return grid;
    }

}
