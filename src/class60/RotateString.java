package class60;

public class RotateString {
    public static boolean Check(String s,String goal){
        StringBuilder sb=new StringBuilder(s);
        int n=s.length();
        while(n>0){
            if(sb.toString().equals(goal))return true;
            char ch=sb.charAt(0);
            sb.append(ch);
            sb.deleteCharAt(0);
            n--;
        }
        return false;
    }
    public static void main(String[] args) {
        String s="abcde";
        String goal="cdeab";
        System.out.println(Check(s,goal));
    }
}
