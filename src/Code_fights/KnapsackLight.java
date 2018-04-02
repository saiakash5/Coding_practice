package Code_fights;

/**
 * Created by Akash on 2/8/18.
 */
public class KnapsackLight {

    public static void main(String args[])
    {
        System.out.println(knapsackLight(10, 5, 6, 4,9));
    }

    public static int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
        int result = 0;
        if (value1 > value2) {
            int temp = cal(weight1, maxW);
            result = temp*value1;
            result = result + cal(weight2, (maxW-temp*weight1))*value2;
        } else {
            int temp = cal(weight2, maxW);
            result = temp*value2;
            result = result + cal(weight1, maxW-temp*weight2)*value1;
        }
        return result;
    }

    static int cal(int weight, int maxW) {
        int sum = 0;
        int count=0;
        if (weight <= maxW) {

            count++;

        }

        return count;
    }
}