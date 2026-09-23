package class10and11;

import java.util.Scanner;

public class factorsSUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact=0;
        for (int i = 1; i < n; i++) {
            if(n%i==0)
            {fact=fact+i;
                System.out.println(i);
            }
        }System.out.println("sum of factorial= " + fact);
    }
    }