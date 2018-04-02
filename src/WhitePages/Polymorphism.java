package WhitePages;

/**
 * Created by Akash on 12/1/17.
 */
public class Polymorphism {

    public  int ab =9;

    public static void main(String args[])
    {
        
        Human h = new Human();
        System.out.println(h.hello);
//        ab =70;
//        Polymorphism p = new Polymorphism();
//        Polymorphism p1 = new Polymorphism();
//        p.ab=70;
//        System.out.print(p.ab);
//        System.out.print(p1.ab);

    }
}

interface MyInterface {

     String hello = "Hello";

      void sayHello();
}

interface MyOtherInterface {

    String Bye = "Bye";

    void sayGoodBye();
}

 class Human implements MyInterface
{

    String hello="hama";

    @Override
    public void sayHello() {

    }
}

 class Child extends Human {



//     @Override
     public void eat() {

     }

     @Override
     public void sayHello() {

     }
 }

 class MyInterfaceImpl
        implements MyInterface, MyOtherInterface {


     @Override
     public void sayHello() {
         System.out.println("Hello");
     }

     @Override
     public void sayGoodBye() {
         System.out.println("Good Bye");
     }
 }
