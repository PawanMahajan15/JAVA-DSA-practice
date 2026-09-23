package class10and11;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class primeFACTORS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int prime=0;
        for (int i = 2; i <=n; i++) {
            while(n % i==0){
                int remainder=n/i;
                System.out.println(i);
                n=n/i;
            }
        }
    }
}





