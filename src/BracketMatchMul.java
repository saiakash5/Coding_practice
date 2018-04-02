/**
 * Created by Akash on 10/8/17.
 */

import java.util.Stack;
public class BracketMatchMul {

    public static void main(String args[])
    {
        String st = "()[{}()]([[][]()[[]]]{()})([]()){[]{}}{{}}{}(){([[{}([]{})]])}\n" +
                "{][({(}]][[[{}]][[[())}[)(]([[[)][[))[}[]][()}))](]){}}})}[{]{}{((}]}{{)[{[){{)[]]}))]()]})))[\n" +
                "[)](][[([]))[)\n" +
                "]}]){[{{){\n" +
                "{[(}{)]]){(}}(][{{)]{[(((}{}{)}[({[}[}((}{()}[]})]}]]))((]][[{{}[(}})[){()}}{(}{{({{}[[]})]{((]{[){[\n" +
                "()}}[(}])][{]{()([}[}{}[{[]{]](]][[))(()[}(}{[{}[[]([{](]{}{[){()[{[{}}{[{()(()({}([[}[}[{(]})\n" +
                "){[])[](){[)}[)]}]]){](]()]({{)(]])(]{(}(}{)}])){[{}((){[({(()[[}](]})]}({)}{)]{{{\n" +
                "[(})])}{}}]{({[]]]))]})]\n" +
                "[{\n" +
                "{}([{()[]{{}}}])({})\n" +
                "{({}{[({({})([[]])}({}))({})]})}\n" +
                "()[]\n" +
                "{)[])}]){){]}[(({[)[{{[((]{()[]}][([(]}{](])()(}{(]}{})[)))[](){({)][}()((\n" +
                "[][(([{}])){}]{}[()]{([[{[()]({}[])()()}[{}][]]])}\n" +
                "(}]}\n" +
                "(([{()}]))[({[{}{}[]]{}})]{((){}{()}){{}}}{}{{[{[][]([])}[()({}())()({[]}{{[[]]([])}})()]]}}\n" +
                "[(([){[](}){){]]}{}([](([[)}[)})[(()[]){})}}]][({[}])}{(({}}{{{{])({]]}[[{{(}}][{)([)]}}\n" +
                "()()[()([{[()][]{}(){()({[]}[(((){(())}))]()){}}}])]\n" +
                "({)}]}[}]{({))}{)]()(](])})][(]{}{({{}[]{][)){}{}))]()}((][{]{]{][{}[)}}{)()][{[{{[[\n" +
                ")}(()[])(}]{{{}[)([})]()}()]}(][}{){}}})}({](){([()({{(){{\n" +
                "}([]]][[){}}[[)}[(}(}]{(}[{}][{}](}]}))]{][[}(({(]}[]{[{){{(}}[){[][{[]{[}}[)]}}]{}}(}";
        System.out.println(isBalanced(st));

    }

    public static boolean isBalanced(String expression) {

//        int diffCounter1 = 0;
//        int diffCounter2 = 0;
//        int diffCounter3 = 0;
//        int ans = 0;
//
//        for(int i =0;i<expression.length();i++)
//        {
//            if(expression.charAt(i)=='{')
//            {
//                diffCounter1+=1;
//            }
//            else if(expression.charAt(i)=='[' )
//            {
//                diffCounter2+=1;
//            }
//            else if(expression.charAt(i)=='(' )
//            {
//                diffCounter3+=1;
//            }
//            else if(expression.charAt(i)=='}')
//            {
//                diffCounter1-=1;
//            }
//            else if(expression.charAt(i)==')')
//            {
//                diffCounter3-=1;
//            }
//            else if(expression.charAt(i)==']')
//            {
//                diffCounter2-=1;
//            }
//
//            if(diffCounter1<0)
//            {
//                diffCounter1+=1;
//                ans+=1;
//            }
//            if(diffCounter2<0)
//            {
//                diffCounter2+=1;
//                ans+=1;
//            }
//            if(diffCounter3<0)
//            {
//                diffCounter3+=1;
//                ans+=1;
//            }
//        }
//        if(ans+diffCounter1+diffCounter2+diffCounter3>0)
//        {
//            return false;
//        }
//        else
//            return true;

        Stack<Character> st = new Stack<>();

        for(int i=0;i<expression.length();i++)
        {
            char s = expression.charAt(i);
            if(s=='{' || s=='[' || s=='(')
            {
                st.push(s);
            }
            else
            {
                if(st.isEmpty())
                {
                    return false;
                }
                char top = st.pop();
                if (!((s == ')' && top == '(') || (s == ']' && top == '[') || (s == '}' && top == '{'))) {
                    return false;
                }
            }
        }
        return true;

    }

    static boolean isMatched(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if (!((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{'))) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
