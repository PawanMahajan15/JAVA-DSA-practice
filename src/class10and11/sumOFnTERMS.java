package class10and11;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class sumOFnTERMS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int i;
        for( i=0;i<=n;i++){
        sum=sum+i;

        }
        System.out.println(sum);
    }

}
