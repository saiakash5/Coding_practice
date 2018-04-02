package Code_fights;

/**
 * Created by Akash on 3/28/18.
 */
public class climbing_steps {
    public static void main(String[] args)
    {
        System.out.println(composeRanges(new int[]{0, 1}));
    }
    public static int climbingStairs(int n) {

        if(n==1)
        {
            return 1;
        }
        else if(n==2)
        {
            return 2;
        }
        else
        {
            return climbingStairs(n-1)+climbingStairs(n-2);
        }

    }

    public static int climbingStairsDP(int n)
    {
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 2;

        if(n==1)
        {
            return arr[n-1];
        }
        else if(n==2)
        {
            return arr[n-1];
        }
        else
        {
            for(int i=2;i<n;i++)
            {
                arr[i] = arr[i-1]+arr[i-2];
            }
        }

        return arr[n-1];

    }


    public static String[] composeRanges(int[] nums) {

        if(nums.length==0)
        {
            return new String[]{};
        }
        else if(nums.length==1)
        {
            return new String[]{""+nums[0]};
        }
        String res ="";
        int count = 0;


        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]+1 != nums[i])
            {
                if(count>0)
                {
                    res = res + nums[i-count-1] +"->"+nums[i-1]+",";
                    count=0;
                }
                else{
                    res +=nums[i]+",";
                }
            }
            else{
                count++;
            }
        }

        if(count==0)
        {
            res+=nums[nums.length-1];
        }
        else if(count ==1)
        {
            res = nums[0]+"->"+nums[1];
        }
        return res.split(",");
    }

    /*
    n =5



     */

}
