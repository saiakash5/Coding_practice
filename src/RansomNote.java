import java.util.*;

public class RansomNote {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;

    public RansomNote(String magazine, String note) {

        magazineMap = new HashMap<>();
        noteMap = new HashMap<>();
        StringTokenizer st = new StringTokenizer(magazine," ,.");
        boolean check =false;
        while(st.hasMoreTokens())
        {
            String s = st.nextToken();
            if(!magazineMap.containsKey(s))
            {
                magazineMap.put(s, 1);
            }
            else
            {
                int i = magazineMap.get(s);
                i++;
                magazineMap.remove(s);
                magazineMap.put(s, i);
            }
        }

        StringTokenizer st2 = new StringTokenizer(note," ,.");

        while(st2.hasMoreTokens()) {
            String s1 = st2.nextToken();
            if (!noteMap.containsKey(s1)) {
                noteMap.put(s1, 1);
            } else {
                int i = noteMap.get(s1);
                i++;
                noteMap.remove(s1);
                noteMap.put(s1, i);
            }
        }

    }

    public boolean solve() {
        boolean check = true;
        for(String k : noteMap.keySet())
        {
            int x2 = noteMap.get(k);
            if(magazineMap.containsKey(k))
            {
                int x1 = magazineMap.get(k);
                if(x1>0)
                {
                    int f = x1-x2;
                    if(f<0)
                    {
                        check = false;
                        break;
                    }
                    magazineMap.remove(k);
                    magazineMap.replace(k,f);
                }
            }
        }
        return check;

    }

    public static void main(String[] args) {
        String s1 = "two times three is not four";
        String s2 = "two times two is four";


        RansomNote s = new RansomNote(s1, s2);

        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");

    }
}

