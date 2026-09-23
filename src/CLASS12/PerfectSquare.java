package CLASS12;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int Squred=0;
        for (int i = 0; i <=Math.sqrt(n); i++) {
            Squred=i*i;
        }
        System.out.println(Squred==n?"Yes":"No");
    }
        }


