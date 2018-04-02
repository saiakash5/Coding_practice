package Uber_olivias;

/**
 * Created by Akash on 10/11/17.
 */
//public class NumberOfIslands {
//
//    public int[][] matrix;
//    public int mark = 1;
//    public int numIslands(char[][] grid) {
//        if (grid == null || grid.length == 0 || grid[0].length == 0) {
//            return 0;
//        }
//        matrix = new int[grid.length][grid[0].length];
//
//        for(int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[0].length; j++) {
//                mark = mark(i, j, grid)? (mark + 1) : mark;
//            }
//        }
//        return mark - 1;
//    }
//
//    public boolean mark(int i, int j, char[][] grid) {
//        if (i >= 0 && i < grid.length && j >= 0 && j < grid[0].length) {
//            if (matrix[i][j] == 0 && grid[i][j] == '1') {
//                matrix[i][j] = mark;
//                mark(i - 1, j, grid);
//                mark(i + 1, j, grid);
//                mark(i, j - 1, grid);
//                mark(i, j + 1, grid);
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public static void main(String args[])
//    {
////        NumberOfIslands I = new NumberOfIslands();
////        char[][] h = new char[][]{{'1','1','0','0','0'}, {'1','1','0','0','0'}, {'0','0','1','0','0'}, {'0','0','0','1','1'}};
////
////
////        System.out.println(I.numIslands(h));
//
//        try
//        {
//            int c = 4/0;
//        }
//        catch (Exception e)
//        {
//            System.err.println("er");
//        }
//        finally {
//            System.err.println("f");
//        }
//    }
//}




public final class NumberOfIslands
{
    private  boolean flag =true;
    class inner
    {
        void test()
        {
            if(NumberOfIslands.this.flag)
            {
                sample();
            }
        }
        public void add(int a)
        {

        }
    }


    public void add(int a)
    {

    }

    public void sample()
    {
        System.out.println("Sample");
    }
    public NumberOfIslands()
    {
        (new inner()).test();
    }


    public static void main(String args[])
    {
        double d = 10.0/ -0;

        if(d==Double.POSITIVE_INFINITY)
        {
            System.out.println("Positive");
        }
        else
        {
            System.out.println("Sample");
        }
    }

}
