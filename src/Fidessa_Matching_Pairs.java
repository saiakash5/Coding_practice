import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Akash on 10/3/17.
 */
public class Fidessa_Matching_Pairs {
    public static void main(String args[])
    {

//        System.out.println("5%2 ="+(5%2));
//        System.out.println("5/2 ="+(5/2));

//        System.out.println(oddNumbers(2,5));

        String[] ab = new String[]{"<<<><><>"};
        int[] abn = new int[]{2};
         System.out.println(balancedOrNot(ab,abn));

//        System.out.println(solution("ABab"));
    }


    static int[] balancedOrNot(String[] expressions, int[] maxReplacements) {

        int[] result = new int[expressions.length];


        int count =0; // used for positioning result array

        for(String exp : expressions)
        {
            Stack<Character> st =new Stack<>();
            int needed = 0;
            for(int i=0;i<exp.length();i++)
            {
                if(exp.charAt(i)=='<')        //checking for open < and pushing if you found one to stack
                {
                    st.push('<');
                }
                else {
                    if(st.empty())            // found close without an open initially therefore incrementing needed by one
                    {
                        needed++;
                    }
                    else if(st.peek()=='<')   // pop if closing > is found
                    {
                        st.pop();
                    }
                }
            }
            needed = needed+st.size();
            if(needed<=maxReplacements[count])  //setting result array based on number of needed brackets and count for positioning
            {
                result[count] = 1;
            }
            else
            {
                result[count] = 0;
            }
            count++;
        }

    return result;

    }



    static int[] oddNumbers(int l, int r) {
        ArrayList<Integer> al = new ArrayList<>();

        int count = 0;
        for(int i = l ; i <=r; i++)
        {
            if(i%2!=0)
            {
//                a[count] = l;
                al.add(i);
                count++;
            }
        }
        int[] a = new int[al.size()];
        int count1=0;
        for(int i:al)
        {
            a[count1] = i;
            count1++;
        }

        return a;

    }

    public static int solution(String s)
    {

        if(!isUpperCase(s.charAt(0)) || s.length()==0)
            return -1;
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        int result =0;



        for(int i=1;i<s.length();i++)
        {
            if (!isUpperCase(s.charAt(i))) {
                char c = stack.peek();
                if (c + 32 == s.charAt(i)) {
                    stack.pop();
                    result = i;
                }
                else {
                    if(result==0)
                    {
                        return -1;
                    }
                    else
                        return result;
                }
            }
            else
                stack.push(s.charAt(i));

        }

        if (stack.empty())
            return s.length() - 1;
        else
            return result;

      /*  int position = 0;
        int count =0;
        boolean check = false;
        for(int i=0;i<s.length()-1;i++)
        {
            int x1 = (int)s.charAt(i);
            int x2 = (int)s.charAt(i+1);
            if(check)
            {
                count++;
                int x0 = (int)s.charAt(i-(2*count));

                while(x2-x0==32)
                {
                    position = i+1;
                    count++;
                    i++;
                    if(i-2*count>=0 && i<s.length()) {
                        x0 = (int) s.charAt(i - 2 * count);
                        x2 = (int)s.charAt(i+1);
                    }
                    else
                        break;
                }
//                if(x2-x0==32)
//                {
//                    position = i+1;
//                }
                check = false;
            }
            else if(x1>64 && x1<91)
            {
                if(x2>97 && x2<123)
                {
                    if(x2-x1 == 32)
                    {
                        position = i+1;
                        check = true;
                    }
                }
            }

        }
        if(position==0) {
            return -1;
        }
        else {
            return position;
        }
        */
    }

    public static boolean isUpperCase(char ch)
    {
//        String str = "ABCDEFGHIGKLMNOPQRSTUVWXYZ";
//
//        System.out.println((int)ch);

        if((int)ch >64 && (int)ch<91)
        {
            return true;
        }
        else
        {
            return false;
        }
//        int pos = str.indexOf(ch);
//        if (pos >= 0 && pos < 26)
//            return true;
//        else
//            return false;
    }


}


/*

#include <string>
#include <stack>
using namespace std;

class MatchingPair {
public:
	int matchingpairs(const string& str) {
		if (!isUpperCase(str.at(0)) || str.size() == 0)
			return -1;
		stack<char> stack;
		stack.push(str.at(0));
		int res = 0;
		for (int i = 1; i < str.size(); i++) {
			if (!isUpperCase(str.at(i))) {
				char c = stack.top();
				if (c - 32 == str.at(i)) {
					stack.pop();
					res = i;
				}
				else
					return res;
			}
			else
				stack.push(str.at(i));

		}
		if (stack.empty())
			return str.size() - 1;
		else
			return res;
	}

	bool isUpperCase(char ch) {
		string str = "ABCDEFGHIGKLMNOPQRSTUVWXYZ";
		int pos = str.find(ch);
		if (pos >= 0 && pos < 26)
			return true;
		else
			return false;
	}
};
 */