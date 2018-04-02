import java.util.HashMap;
import java.util.Stack;

/**
 * Created by Akash on 10/3/17.
 */
public class PureStorage {

    public static void main(String args[])
    {
        String[] str = {"ACQUIRE 364","ACQUIRE 84","ACQUIRE 364","RELEASE 364"};
        System.out.println(check_log_history(str));
    }

    static int check_log_history(String[] events) {

        HashMap<Integer,String> hm = new HashMap<>();
        int count =1;
        int peer =1;
        for(String event : events)
        {
            String[] divs = event.split(" ");

            if(divs[0].equals("ACQUIRE")) {
                if(hm.containsKey(Integer.parseInt(divs[1])))
                {
                    peer =  count;
                    break;
                }
                else
                    hm.put(Integer.parseInt(divs[1]),divs[0]);
            }
            else
            {
                if(!hm.containsKey(divs[0]))
                {
                    peer =  count;
                    break;
                }
                else
                    hm.remove(divs[1]);
            }
            count++;
        }
        return peer;
    }
}
