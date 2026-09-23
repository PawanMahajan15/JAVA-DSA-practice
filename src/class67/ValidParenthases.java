package class67;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthases {
    public  static boolean isValid(String s){
        Stack<Character>st=new Stack<>();
        for(char c:s.toCharArray()){
            if (c =='{'||c=='('||c=='['){
                st.push(c);
            } else if (c=='}'||c==')'||c==']'){
                if(st.empty())return false;
                else if (st.peek()=='{'&&c=='}') {
                    st.pop();
                }
                else if (st.peek()=='['&&c==']') {
                    st.pop();
                }
                else if (st.peek()=='('&&c==')') {
                    st.pop();
                }
                else return false;
            }
        }
        if(st.empty())return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(isValid(s));
    }
}
