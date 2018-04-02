package Algorithms_And_DataStructures;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Akash on 3/6/18.
 */
public class Sorting {

    public static void main(String args[]) throws IOException {
        int[] arr = {9,4,2,6,8,7};
        Sorting_algorithms obj1 = new Sorting_algorithms();
//        System.out

//        int[] op = obj1.selection_sort(arr);
//        System.out.println(Arrays.toString(op));

//        System.out.println(obj1.binary_search(op,10));

//        System.out.println(Arrays.toString(obj1.bubble_sort(arr)));

//        System.out.println(Arrays.toString(obj1.merge_sort(arr)));

//        System.out.println(1%2);
//        int[] op = (obj1.merge_sort(arr));
//        System.out.println(obj1.Binary_search(op,0,op.length-1,4));

        int[] o_p = obj1.quick_d_c(arr,0,arr.length-1);
    }


}

class Sorting_algorithms
{
    public int[] selection_sort(int[] input)
    {
        for(int i=0;i<input.length;i++)
        {
            int smallest = input[i];
            int index = i;
            for(int j=i;j<input.length;j++)
            {
                if(input[j]<smallest)
                {
                    smallest = input[j];
                    index = j;
                }
            }
            int temp = input[index];
            input[index] = input[i];
            input[i] = temp;
        }
        return input;
    }

    public String binary_search(int[] input, int key)
    {
        for(int i=0;i<input.length;i++)
        {
            if(input[i]==key)
            {
                return "found at "+i;

            }
        }
        return "not found";
    }

    public int[] bubble_sort(int[] input)
    {
        for(int i=0;i<input.length;i++)
        {
            for(int j =0;j<input.length-1;j++)
            {
                if(input[j]>input[j+1])
                {
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
            }
        }
        return input;
    }
// Merge Sort
    public int[] merge_sort(int[] input)
    {

        return sort(input,0,input.length-1);

    }

    int[] sort(int[] arr, int l,int r)
    {
        if(l<r)
        {
            int m = (l+r)/2;
            sort(arr,l,m);
            sort(arr,m+1,r);
            merge(arr,l,m,r);
        }
        return arr;
    }

    void merge(int[] arr, int l, int m, int r)
    {
        int n1 = m-l+1;
        int n2 = r-m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i =0;i<n1;i++)
        {
            L[i] = arr[l+i];
        }
        for(int i = 0;i<n2;i++)
            R[i] = arr[m+1+i];

        int i=0,j=0,k=l;

        while(i<n1 && j<n2)
        {
            if(L[i]<=R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while(i<n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
//End Merge Sort

    public String Binary_search(int[] input,int l, int r,int key)
    {
        int m=0;
        if(r-l>=2)
            m = l+((r-l)/2);
        else
            m=l+((r-l)%2);
        if(key == input[m])
        {
            return "found at "+m;
        }
        else if(key<input[m])
        {
            return Binary_search(input,l,m-1,key);
        }
        else
            return Binary_search(input,m+1,r,key);



    }

    public static int[] quick_d_c(int[] arr,int low,int high)
    {
        if(low<high) {
            int pi = quick_sort(arr, 0, high);
            quick_d_c(arr, low, pi - 1);
            quick_d_c(arr, pi+1, high);
        }

        return arr;
    }

    public static int quick_sort(int[] arr, int low,int high)
    {
        int i = low-1;
        int pivot = arr[high];
        for (int j=low;j<high-1;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

}
