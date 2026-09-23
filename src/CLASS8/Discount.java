package CLASS8;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input >= 0 && input <= 5000) {
            System.out.println(input);
        } else if (input >= 5001 && input <= 7000) {
            System.out.println(input * 95 / 100);

        } else if (input >= 7001 && input <= 9000) {
            System.out.println(input * 90 / 100);
        } else if (input >= 9001) {
            System.out.println(input * 80 / 100);
        }
    }
}

