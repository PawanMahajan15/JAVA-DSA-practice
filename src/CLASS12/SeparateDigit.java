package CLASS12;

import java.util.Scanner;

public class SeparateDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int remainder;
        while (n!=0){

            remainder=n%10;
            n=n/10;
            System.out.println(remainder);
        }

    }
}
