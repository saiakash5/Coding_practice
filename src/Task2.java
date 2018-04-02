/**
 * Created by Akash on 10/1/17.
 */
public class Task2 {

    public static void main(String args[])
    {
        solution(8);
    }


    public static void solution(int N) {
        // write your code in Java SE 8
        boolean three = false, five= false, seven=false;
        int i =1;
        while (i<=N)
        {


            if (i % 3 == 0) {
                three = true;
            }
            if (i % 5 == 0) {
                five = true;
            }
            if (i % 7 == 0) {
                seven = true;
            }

            if(three && five && seven)
            {
                System.out.println("FizzBuzzWoof");
            }
            else if (three && five)
            {
                System.out.println("FizzBuzz");
            }
            else if(three && seven)
            {
                System.out.println("FizzWoof");
            }
            else if(five && seven)
            {
                System.out.println("BuzzWoof");
            }
            else if (three)
                {
                    System.out.println("Fizz");
                }
            else if(five)
            {
                System.out.println("Buzz");
            }
            else if (seven)
            {
                System.out.println("Woof");
            }

            if(!three && !five && !seven) {
                System.out.println(i);
            }
            i++;
            three =false;
            five=false;
            seven=false;
        }
    }
}


/*


1
2
Fizz
4
Buzz
Fizz
Woof
8
Fizz
Buzz
11
Fizz
13
Woof
FizzBuzz
16
17
Fizz
19
Buzz
FizzWoof
22
23
Fizz


 */