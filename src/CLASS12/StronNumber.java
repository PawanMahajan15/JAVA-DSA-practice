package CLASS12;

import java.util.Scanner;

public class StronNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int temp=n;
        int remainder;
        while (n != 0) {
            int fact=1;
            remainder = n % 10;

            for (int i = 1; i <= remainder; i++) {

                fact = fact * i;
            }
            sum=sum+fact;
                n = n / 10;
            }
        System.out.println(sum==temp?"strong number":"not strong number");
            }
    }