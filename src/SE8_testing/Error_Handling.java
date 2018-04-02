package SE8_testing;


import java.io.IOException;
import java.lang.reflect.Array;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAmount;
import java.util.function.Predicate;
import java.util.*;
import static java.lang.Math.pow;
/**
 * Created by Akash on 2/17/18.
 */


 class A {


     int A_1 =1;
   int A_2 = 2;
   public void display()
   {
       System.out.println("Inside A");
   }


}
interface exapmle
{
    double test_lambda(int n);
}
 class B extends A{

     int B_1 =1;
     int B_2=2;
    public void display(int a)
    {
        System.out.println("Inside B");
    }
}
class C extends B{

     private C(String s)
     {
         System.out.println("Constructor C");
     }
     int C_1 =1;
     int C_2 = 2;
    public void display()
    {
         System.out.println("Inside C");
    }



}

 interface I{
     default void print(){};
}

class Second {

    static float f=10;
    public static void main(String[] args) throws RuntimeException
    {
        B a = new B();
        B b = a;
        B c = new B();

    }


}
