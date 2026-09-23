package CLASS1To7;

import java.util.Scanner;
public class MathAPI2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("p");
        double p=sc.nextDouble();
        System.out.println("D");
        double r=sc.nextDouble();
        System.out.println("t");
        double t= sc.nextDouble();
        System.out.println("n");
        int n=sc.nextInt();
        double  A=p*Math.pow(1+(r/n),(n*t));
        double ci= A-p;
        System.out.printf("%.5f",ci);                    /*agar hame point ke baad sirf 2 ya 3  nuber chahiye to hume %.2f ya %.3f
                                                            add karna hoga sout me*/

    }
}
