/**
 * Created by Akash on 9/30/17.
 */
public class BinaryGap {

    public static void main(String args[]) {
        int n = 74901729;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(solution(n));

        /*
      1 0 0 0 1 1 1 0 1 1  0  1  1  1  0  1  0  0  0  1  1  1  0  0  0  0  1
      0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26
         */
    }

    public static int solution(int N) {
        // write your code in Java SE 8

        String binary = Integer.toBinaryString(N);
        int t_count = 0, count = 0;
        boolean start = false, stop = false;
        for (int i = 0; i < binary.length()-1; i++) {
            if (start && binary.charAt(i) == '0') {
                t_count++;
                if (binary.charAt(i + 1) == '1') {
                    stop = true;
                }
            } else if (t_count == 0 && binary.charAt(i)=='1') {
                start = true;

            }

            if (start && stop) {
                if (t_count > count) {
                    count = t_count;


                }
                t_count = 0;
                start = false;
                stop = false;
            }
        }

        return count;

    }
}



//        int temp = N;
//        int rem =0;
//        boolean start =false;
//        boolean stop =false;
//        int count=0,t_count =0;
//
//        while (N!=0)
//        {
//            if(start && N%2==0)
//            {
//                t_count++;
//                if(N%4!=0) {
//                    stop = true;
//                }
//            }
//            else /*if(N%2==1 || N%4 ==1)*/
//            {
////                int x = N/2;
//                if(t_count==0)
//                    start=true;
////                else if(x!=0 || x%2==1)
////                {
////                    stop =true;
////                    break;
////                }
//
//            }
//
//            if(start && stop)
//            {
//                if(t_count>count)
//                {
//                    count = t_count;
//                    t_count=0;
//                }
//                start = false;
//                stop = false;
//            }
//
//            N=N/2;
//        }
//        return count;
//    }
//}
