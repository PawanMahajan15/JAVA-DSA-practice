package class10and11;

import java.util.Scanner;

public class PRIMEnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                t++;
                System.out.println(i);
            }
        }System.out.println(t==2?"prime":"not prime");
    }
}