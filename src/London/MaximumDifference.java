package London;

/**
 * Created by Akash on 10/12/17.
 */
class MaximumDiffrence
{
    /* The function assumes that there are at least two
       elements in array.
       The function returns a negative value if the array is
       sorted in decreasing order.
       Returns 0 if elements are equal  */
    int maxDiff(int arr[], int arr_size)
    {
        int max_diff = arr[1] - arr[0];
        int min_element = arr[0];
        int i;
        for (i = 1; i < arr_size; i++)
        {
            if (arr[i] - min_element > max_diff)
                max_diff = arr[i] - min_element;
            if (arr[i] < min_element)
                min_element = arr[i];
        }
        return max_diff;
    }

    /* Driver program to test above functions */
    public static void main(String[] args)
    {
        MaximumDiffrence maxdif = new MaximumDiffrence();
//        int arr[] = {2, 3, 10, 2, 4, 8, 1};
        int arr[] = {7, 9, 5, 6, 3, 2};
        int size = arr.length;
        System.out.println("MaximumDifference is " +
                maxdif.maxDiff(arr, size));
    }
}