package London;

/**
 * Created by Akash on 10/12/17.
 */
public class Synch {

    public synchronized void methodA(int i, String msg)
    {
        System.out.println(Integer.toString(i));
        System.out.println(msg);
    }

    public void methpdB(int i,String msg){
        synchronized (this)
        {
            System.out.println(Integer.toString(i));
            System.out.println(msg);
        }
    }


    public static void main(String args[])
    {
        Synch a = new Synch();
        long timeA1 = System.nanoTime();
        a.methodA(1,"A");
        long timeA2 = System.nanoTime();
        System.out.println(timeA2-timeA1);
        a.methpdB(2,"B");
        long timeA3 = System.nanoTime();
        System.out.println(timeA3-timeA2);
    }
}
