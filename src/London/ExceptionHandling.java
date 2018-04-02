package London;

import java.io.IOException;

/**
 * Created by Akash on 10/12/17.
 */
public class ExceptionHandling {
    public static void main(String args[])
    {
        try {
            new AirJet();
        }catch (IOException e){
            System.out.println("pppplllo");
        }
    }
}

 class AirPlane {
    public AirPlane() throws IOException {
        System.out.println("AirPlane");
        throw new IOException();
    }
}

class AirJet extends AirPlane{

    public AirJet() throws IOException{

//        try {
////            super();
//        }
//        catch (IOException e)
//        {
//            System.out.println("lllo");
//        }
    }
}
