package CLASS1To7;

import java.util.Scanner;// ye line scanner use karne ke liye likhe hai jo ke util (AIP)me aata hai
public class Userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// isme scanner (int) jaisa or sc (variable) jaisa use kiya hai jo ki system output vali line mai jo bhe likha hoga vo print kar sake or input ke tarah use kar sake
        System.out.println("enter a number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(a + b);
        System.out.println(c + d);
    }
}
