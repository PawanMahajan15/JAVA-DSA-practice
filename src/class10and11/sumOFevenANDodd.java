package class10and11;

import java.util.Scanner;

public class sumOFevenANDodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int f = sc.nextInt();
        int odd = 0;
        int even = 0;
        if (i > f) {
        int a=i;
            i=f;
            f=a;
        }
            for (int s = i; s <= f; s++) {
                if (s % 2 == 0) {
                    even = even + s;
                } else if (s % 2 != 0) {
                    odd = odd + s;
                }
            }
            System.out.println(odd);
            System.out.println(even);

        /*else {
            for (int s = f; s <= i; s++) {
                if (s % 2 == 0) {
                    even = even + s;
                } else if (s % 2 != 0) {
                    odd = odd + s;
                }
            }
            System.out.println(odd);
            System.out.println(even);
        }*/
    }

}
