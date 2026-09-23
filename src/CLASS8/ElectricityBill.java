package CLASS8;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double unit = sc.nextDouble();
        double total = 0.0;
        double unit100 = 420, unit200 = 1020, unit400 = 2620;
        if (unit >= 0.0 && unit <= 100.0) {
            total = (unit * 4.2);
        } else if (unit >= 101.0 && unit <= 200.0) {
            total = ((unit - 100) * 6 + unit100);
        } else if (unit >= 201 && unit <= 400) {
            total = ((unit - 200) * 8 + unit200);
        } else if (unit >= 401) {
            total = ((unit - 400) * 13 + unit400);
        }
        System.out.println(total);
    }
}