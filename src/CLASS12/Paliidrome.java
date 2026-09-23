package CLASS12;

import java.util.Scanner;

public class Paliidrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int original=n;
        int  reverse=0,remainder;
        while (n!=0){
            remainder=n%10;
            reverse=reverse*10+remainder;
            n=n/10;
        }if (original==reverse){
            System.out.println("palindromic number");
        }else{
            System.out.println("not palindromic number");
        }
   }
}

