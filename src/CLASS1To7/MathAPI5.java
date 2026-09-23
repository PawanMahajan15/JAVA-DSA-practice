package CLASS1To7;

import java.util.Scanner;

public class MathAPI5{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double r= sc.nextDouble();
        double C=(2*(Math.PI*r));
        System.out.printf("%.2f\n",C);
        double A=(Math.PI*Math.pow(r,2));
        System.out.printf("%.2f",A);

    }
}
