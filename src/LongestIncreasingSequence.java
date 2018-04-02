import java.util.StringTokenizer;

/**
 * Created by Akash on 9/26/17.
 */
public class LongestIncreasingSequence {
    public static void main(String args[])
    {

//        System.out.print(findComplement(5));
        int[] ar = {1,2,4,3};
        int[] ra = {1,3,};
        int[] p = getMaxElementIndices(ar,ra);
        int k = 10;
        System.out.print(findNumber(ar,5));
//        int[] min_hop =  new int[ar.length];
//
//        min_hop[0] = 0;
//        for(int i=1;i<min_hop.length;i++)
//        {
//            min_hop[i] = Integer.MAX_VALUE-1;
//        }
//
//        for(int i=1;i<ar.length;i++)
//        {
//            for(int j=0;j<i;j++)
//            {
//                if(ar[j]+j>=i)
//                {
//                    if(min_hop[j]+1<min_hop[i])
//                    {
//                        min_hop[i] = min_hop[j]+1;
//                    }
//                }
//            }
//        }
//
//        System.out.print(min_hop[min_hop.length-1]);


/*          M A R C H
          0 1 2 3 4 5
        C 1
        A 2
        R 3
        T 4

        if(ar1[i] = ar2[j])
        {
            mr[i][j] = mr[i-1][j-1]
        }
        else if(ar1[])
        {
            mr[i][j] = Math.max(mr[i-1][j],mr[i][j-1]);
        }

         */
//        int[] arr1 = {1,2,3,4};
//        int arr2[] = {1,2,3,5};
//
//        for(int i=0;i<arr1.length;i++)
//        {
//            arr1[i] = arr1[i]<<arr2[i];
//
//            System.out.println(arr1[i]);
//        }
    }

    public static int findComplement(int num) {
        int ans = 0;//the count of the num's bits 0 1
        int temp = num;//copy of the num          5
        while(temp != 0){
            ans++;
            temp /= 2;
        }
        int x = num ^ (int)(Math.pow(2,ans)-1);
        return x;
    }



    static String findNumber(int[] arr, int k) {
        String result = "";
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == k)
                result =  "YES";
            else
                result =  "NO";
        }
        return result;
    }


    static String search(int arr[], int x)
    {
        int n = arr.length;
        // 1st comparison
        if (arr[n-1] == x)
            return "Found";

        int backup = arr[n-1];
        arr[n-1] = x;

        // no termination condition and thus
        // no comparison
        for (int i = 0; ;i++)
        {
            // this would be executed at-most n times
            // and therefore at-most n comparisons
            if (arr[i] == x)
            {
                // replace arr[n-1] with its actual element
                // as in original 'arr[]'
                arr[n-1] = backup;

                // if 'x' is found before the '(n-1)th'
                // index, then it is present in the array
                // final comparison
                if (i < n-1)
                    return "Found";

                // else not present in the array
                return "Not Found";
            }
        }
    }




    static int[] getMaxElementIndices(int[] a, int[] rotate) {
        int[] result = new int[rotate.length];
        for(int i=0;i<rotate.length;i++)
        {
            if(rotate[i]>0)
            {
                for(int j=0;j< rotate[i];j++)
                {
                    a = rotateByOne(a);
                }
                result[i] = indexOfMax(a);
            }
            else
            {
                result[i] = indexOfMax(a);
            }
        }
        return result;
    }

    static int[] rotateByOne(int[] arr)
    {
        int i, temp;
        temp = arr[0];
        for(i=0;i<arr.length-1;i++)
        {
            arr[i] = arr[i+1];
        }
        arr[i] = temp;
        return arr;
    }

    static int indexOfMax(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }

        int max = arr[0];
        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                maxIndex = i;
                max = arr[i];
            }
        }

        return maxIndex;
    }



}
