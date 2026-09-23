package Class22;
import java.util.Scanner;
public class StringBuilderAPI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        String s="jai shree ram";
        sb.append(8.0) ;
        sb.append('h');
        s=s+sb;
        System.out.println(s);
        StringBuilder sb2=new StringBuilder("jai shree krishna");
        System.out.println(sb2.compareTo(sb));
        // sb2.reverse();
        System.out.println(sb2);
        System.out.println(sb2.charAt(3));
        System.out.println(sb2.delete(3,9));
        sb2.deleteCharAt(5);
        System.out.println(sb2.capacity());
        System.out.println(sb2.length());
        sb2.setCharAt(2,'y');
        System.out.println(sb2);
        sb2.insert(5,'r');
        System.out.println(sb2);
        sb2.replace(4,11,"ram");
        System.out.println(sb2);
        String k="abcd";
        StringBuilder j=new StringBuilder(k);
        j.append('e');
        System.out.println(j);
        String l= j.toString();
        System.out.println(l);
    }
}
