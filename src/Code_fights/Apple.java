package Code_fights;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by Akash on 11/14/17.
 */
public class Apple {

    public static void main(String args[]) throws FileNotFoundException,IOException
    {
        String file1 = "employee_names.csv";
        String file2 = "employee_pay.csv";

        HashMap<Integer,String[]> names = settingMaps(file1);
        HashMap<Integer,String[]> salary = settingMaps(file2);

        Ljoin(salary,names);



    }

    public static HashMap settingMaps(String file) throws FileNotFoundException,IOException
    {
        HashMap<Integer,String[]> hm = new HashMap<>();
        String line = "";
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        while((line = br.readLine()) != null) {

            String[] t_names = line.split(" ");
            //considering id in first column
            int id = Integer.parseInt(t_names[0]);
            if(!hm.containsKey(id))
            {
                hm.put(id,t_names);
            }
        }

        return hm;
    }

    public static  void Ljoin(HashMap L,HashMap R)
    {

        Iterator L_iterator = L.keySet().iterator();
        while(L_iterator.hasNext())
        {
            int id = (int) L_iterator.next();
            String[] L_params = (String[]) L.get(id);
            if(R.containsKey(id))
            {

                String[] R_params = (String[]) R.get(id);
                System.out.print(id+" "+L_params[1]+" "+L_params[2]+" "+R_params[1]+" "+R_params[2]);//We can iterate through R_params and print all values except id;
            }
            else
            {
                System.out.print(id+" "+L_params[1]+" "+L_params[2]+" null"+" null");//We can print null values for R_params length-1 times theoritically
            }

            System.out.println();
        }
    }
}
