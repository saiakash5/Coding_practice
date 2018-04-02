import java.util.Stack;

/**
 * Created by Akash on 10/8/17.
 */
public class BracketMatch {
    public static void main(String args[])
    {
        String a = "(())";
        System.out.println(bracket(a));
    }

    public static int bracket(String text)
    {
        Stack<Character> st = new Stack<>();
        int count = 0;
        for(int i=0;i<text.length();i++)
        {
            if(text.charAt(i)=='(')
            {
                st.push('(');
            }
            else
            {
                if(st.empty())
                {
                    count++;
                }
                else if(st.peek()=='(')
                {
                    st.pop();
                }
            }
        }
        count = count + st.size();
        return count;
    }
}
