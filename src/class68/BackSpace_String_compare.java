package class68;

import java.util.Stack;

public class BackSpace_String_compare {
    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character>s2=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='#'){
                if(s1.empty());
                else {
                    s1.pop();
                }
            }else{
            s1.push(ch);
        }}
        for(char ch:t.toCharArray()){
            if(ch=='#'){
                if(s2.empty());
                else {
                    s2.pop();
                }
            }else {
                s2.push(ch);
            }
        }
        if (s1.empty()&&s2.empty())return true;
        StringBuilder ans1=new StringBuilder();
        StringBuilder ans2=new StringBuilder();

        while(!s1.empty()){
            ans1.append(s1.pop());
        }
        while(!s2.empty()){
            ans2.append(s2.pop());
        }
        return ans1.compareTo(ans2) == 0;
    }
    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c","ac"));
    }
}
