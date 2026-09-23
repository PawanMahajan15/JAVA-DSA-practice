package class60;
public class longestPrefix {
    public static String common(String s1,String s2){
        StringBuilder sb=new StringBuilder();
        int length=Math.min(s1.length(),s2.length());
        for (int i = 0; i <length ; i++) {
            if(s1.charAt(i)==s2.charAt(i))sb.append(s1.charAt(i));
            else return sb.toString();
        }
        return sb.toString();
    }
    public static String prefix(String str[]){
        int i=1;
        String ans=str[0];
        while(i< str.length){
            String s1=ans;
            String s2=str[i];
            ans=common(s1,s2);
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        String[] str={"flower","flow","flight"};
        System.out.println(prefix(str));
    }
}
