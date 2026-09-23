package class60;

public class BinarySum {
    public static String Binary(String s,String  t){
        StringBuilder sb=new StringBuilder();
        int carry=0,i=s.length()-1,j=t.length()-1;
        while(i>=0||j>=0){
            int sum=carry;
            if(i>=0)sum+=Character.getNumericValue(s.charAt(i));
            if (j>=0)sum+=Character.getNumericValue(t.charAt(j));
            sb.append(sum%2);
            carry=sum/2;
            i--;
            j--;
        }
        if(carry==1)sb.append(1);
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String s="11";
        String t="1";
        System.out.println(Binary(s,t));
    }
}
