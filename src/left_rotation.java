import java.util.Stack;

/**
 * Created by Akash on 10/4/17.
 */
public class left_rotation {
    public static  void main(String args[])
    {
        A d = new A();
        String x ="Akash";
        x.length();
//        int[] a = {5,4,3,2,1};
//        arrayLeftRotation(a,a.length,4);
        Stack<Integer> st = new Stack<>();


    }

    boolean xyz()
    {
        return true;
    }
    public static int[] arrayLeftRotation(int[] a, int n, int k) {

        for(int i=1;i<=k;i++)
        {
            a = rotateByOne(a,n);
        }
        return a;
    }
    public static int[] rotateByOne(int[] a,int n)
    {
        int temp =a[0];
        for(int i=1;i<n;i++)
        {
            a[i-1] = a[i];
        }
        a[n-1]= a[0];
        return a;
    }
}

class A
{
    int a;
    A b;
    A c;
}
