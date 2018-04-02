package AshishCoding;

import sun.net.www.http.HttpClient;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashMap;

/**
 * Created by Akash on 1/10/18.
 */
public class JavaRestApi {

    static String USER_AGENT = "Mozilla/5.0";
    public static void main(String args[]) throws IOException {
        //https://min-api-cryptocompare.com/data/price?fsym=BTC&tsyms=EUR


        String fileName = "/Users/Akash/Desktop/CryptoCoinsInput.txt";

        HashMap<String,Integer> coins = processInput(fileName);

        String Get_call_1 = "https://min-api.cryptocompare.com/data/price?fsym=";
        String Get_call_2 = "&tsyms=EUR";
        float total_worth = 0;

        System.out.printf("%-15s %-15s %-15s %-15s %n","Coin","value","#","worth");
        for(String coin_name : coins.keySet())
        {
            String get_call = Get_call_1+coin_name+Get_call_2;
            float value = get_request(get_call);
            total_worth+=(value*coins.get(coin_name));
            System.out.printf("%-15s %-15s %-15s %-15s %n",coin_name,value,coins.get(coin_name),value*coins.get(coin_name));

        }
        System.out.println("-----------------------------------------------------------");
        System.out.printf("%-15s %45f","Total worth",total_worth);

    }


    public static HashMap<String,Integer> processInput(String file_path)
    {
        HashMap<String,Integer> coins = new HashMap<>();
        String line = null;
        try
        {
            FileReader fileReader = new FileReader(file_path);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null)
            {
                String[] parts = line.split("=");
                if(!coins.containsKey(parts[0]))
                {
                    coins.put(parts[0],Integer.parseInt(parts[1]));
                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        return coins;
    }


    public static float get_request(String get_call_path) throws IOException {


        URL obj = new URL(get_call_path);
        HttpURLConnection con = (HttpURLConnection)obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("Content-Type", "text/plain; charset=utf-8");

        //add request header
        con.setRequestProperty("User-Agent", USER_AGENT);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        float f = Float.valueOf(response.toString().replaceAll("[^\\d.]+|\\.(?!\\d)", ""));
        return f;
    }
}
