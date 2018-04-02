package Code_fights;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Stream;

/**
 * Created by Akash on 3/9/18.
 */
public class Interview_Practise {

    public static void main(String[] args)
    {




/*   for image rotation
        int[][] a = {{10,9,6,3,7},
                     {6,10,2,9,7},
                     {7,6,3,8,2},
                     {8,9,7,9,9},
                     {6,8,6,8,2}};
       System.out.println(rotate_image(a));


*/

        /*

 [[".",".","4",".",".",".","6","3","."],
  [".",".",".",".",".",".",".",".","."],
  ["5",".",".",".",".",".",".","9","."],
  [".",".",".","5","6",".",".",".","."],
  ["4",".","3",".",".",".",".",".","1"],
  [".",".",".","7",".",".",".",".","."],
  [".",".",".","5",".",".",".",".","."],
  [".",".",".",".",".",".",".",".","."],
  [".",".",".",".",".",".",".",".","."]]

         */

/*For sudoku prb

char[][] grid = {{'.', '.', '.', '1', '4', '.', '.', '2', '.'},
                         {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                         {'.', '.', '6', '.', '.', '.', '.', '.', '.'},
                         {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                         {'.', '.', '1', '.', '.', '.', '.', '.', '.'},
                         {'.', '6', '7', '.', '.', '.', '.', '.', '9'},
                         {'.', '.', '.', '.', '.', '.', '8', '1', '.'},
                         {'.', '.', '.', '.', '.', '7', '.', '.', '.'},
                         {'.', '.', '.', '5', '.', '.', '.', '7', '.'}};
       System.out.println(sudoku2(grid));
*/
//        String[] cr = {"AAAAAAAAAAAAA","BBBBBBBBBBBBBB","CCCCCCCCCCCCCC"};
//        char[][] sol = {{'A', '1'},{'B','2'},{'C','3'}
//};
//
//        System.out.println();
//        System.out.println(isCryptSolution(cr,sol));


        ListNode<Integer> l = new ListNode<>(3);



    }
//image rotation
    public static int[][] rotate_image(int[][] a)
    {
        int[][] b = new int[a[0].length][a[0].length];

        for(int i=0;i<a[0].length;i++)
        {
            int count=a[0].length-1;
            for(int j=0;j<a[0].length;j++)
            {
                b[i][j] = a[count--][i];
            }
        }

        return b;
    }
//Sudoku
    public static boolean sudoku2(char[][] grid) {
        ArrayList<Integer> al_r = new ArrayList<>();


        if (bulk_block_checker(grid) && bulk_column_checker(grid) && bulk_row_checker(grid)) {
            return true;
        }
        else
            return false;
    }


    public static boolean bulk_block_checker(char[][] grid)
    {
        for(int i=0;i<grid[0].length;i+=3)
        {
            for(int j=0;j<grid[0].length;j+=3)
            {
                if(!sudoku_block_check(i,j,grid))
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean sudoku_block_check(int x,int y,char[][] grid)
    {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=x;i<x+3;i++ )
        {
            for(int j=y;j<y+3;j++)
            {
                if(!(grid[i][j]=='.')) {
                    int temp = Integer.parseInt(""+grid[i][j]);
                    if (!al.contains(temp)) {
                        al.add(temp);
                    } else {
                        return false;
                    }
                }
            }

        }

        return true;
    }

    public static boolean column_check(int y,char[][] grid)
    {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<9;i++)
        {
            if(!(grid[i][y] =='.')) {
                int temp = Integer.parseInt(""+grid[i][y]);
                if (!al.contains(temp))
                {
                    al.add(temp);
                }
                else
                    return false;
            }
        }
        return true;
    }



    public static boolean bulk_column_checker(char[][] grid)
    {
        for(int i=0;i<grid[0].length;i++)
        {
            if( !column_check(i,grid))
            {
                return false;
            }
        }
        return true;
    }

    public static boolean bulk_row_checker(char[][] grid)
    {
        for(int i=0;i<grid[0].length;i++)
        {
            if( !row_check(i,grid))
            {
                return false;
            }
        }
        return true;
    }

    public static boolean row_check(int x,char[][] grid)
    {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<9;i++)
        {
            if(!(grid[x][i]=='.')) {
                int temp = Integer.parseInt(""+grid[x][i]);
                if (!al.contains(temp))
                {
                    al.add(temp);
                }
                else
                    return false;
            }
        }
        return true;
    }
//End


    //Crypt

    public static boolean isCryptSolution(String[] crypt, char[][] solution) {

        HashMap<String,Integer> hm = new HashMap<>();

        for(int i=0;i<solution.length;i++)
        {
            if(!hm.containsKey(""+solution[i][0]))
            {
                hm.put(""+solution[i][0],Integer.parseInt(""+solution[i][1]));
            }
        }

        String get_val1 = get_value(crypt[0],hm);
        String get_val2 = get_value(crypt[1],hm);
        String res = get_value(crypt[2],hm);

        if((get_val1.charAt(0)=='0'||get_val2.charAt(0)=='0'||res.charAt(0)=='0')&&(get_val1.length()>1&&get_val2.length()>1&&res.length()>1))
        {
            return false;
        }
        else {

            long left = Long.parseLong(get_val1) + Long.parseLong(get_val2);

            if (left == (Long.parseLong(res))) {
                return true;
            }
        }

        return false;


    }

    public static String get_value(String s,HashMap<String,Integer> table) {

        String res = "";
        for(int i=0;i<s.length();i++)
        {
            res+=table.get(""+s.charAt(i));
        }
        return res;
    }

    //Definition for singly-linked list:
    static class ListNode<T> {
   ListNode(T x) {
     value = x;
   }
   T value;
   ListNode<T> next;
 }

    ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {
        ListNode<Integer> prev = null;
        while(l.next!=null)
        {
            if(l.value==k)
            {
                if(prev==null)
                {
                    l = l.next;
                }
                else
                {
                    prev.next = l.next;
                }
            }
            prev = l.next;
        }
        return l;
    }




}
