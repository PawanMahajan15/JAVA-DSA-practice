package Class14;

import java.util.Scanner;

public class Ypattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=n;i>=1;i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == i || j == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            } System.out.println();
        }
        for (int i = 1; i <=(n+1)/2 ; i++) {
            for (int j = 1; j <=n; j++) {
                if (j<(n+1)/2) {
                    System.out.print(" ");
                }
            } for (int j = 1; j <=n; j++) {
                if (j == (n+1)/2) {
                    System.out.print("* ");
                }else  {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


