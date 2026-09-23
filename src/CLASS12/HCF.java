package CLASS12;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int divisor=1;
            for (int i = 2; i <=n; i++) {
                while(n%i==0&&m%i==0) {
                    int remainder = n / i;
                    int remain=m/i;
                    divisor=divisor*i;
                    n = n / i;
                    m=m/i;
                }
            }
            System.out.println(divisor);

    }
}
