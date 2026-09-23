package class10and11;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class factorialOFnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long i;
        long fact=1;
        for(i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
