package class10and11;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long power = 1;
        if (a==0&&b==0){
            System.out.println("Undefined");
        }else{
            for (int i = 1; i<=b ; i++) {
                power=power*a;
            }
            System.out.println(power);
        }
    }
}