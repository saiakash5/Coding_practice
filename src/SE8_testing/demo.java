package SE8_testing;


import javax.sound.midi.SysexMessage;
import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import java.util.stream.Stream;

/**
 * Created by Akash on 3/7/18.
 */
public class demo
{
    public static void main(String[] args) throws ParseException {

    List<String> f = new ArrayList<>();
    f.add("Mango");
    f.add("O");
    f.add("b");

    Stream<String> frS = f.parallelStream();

    frS.filter(fruit->{
        System.out.println("Fr :"+fruit);
        return false;
    }).forEach(fruit->{});


    }




}
