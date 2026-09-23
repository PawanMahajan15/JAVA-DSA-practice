package class42;

import java.util.Arrays;
import java.util.Scanner;

public class primeRange {
    public static void range(int n){
        boolean prime[]=new boolean[n+1];
        Arrays.fill(prime,true);
        prime[0]=false;
        prime[1]=false;
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if(prime[i]){
                for (int j =i*i; j <=n ; j=j+i) {
                            if (j%i==0){
                                prime[j]=false;
                            }
                }
            }
        }
        int c=0;
        for (boolean i:prime) {
            if (i){
               // System.out.println(i);
                c++;
            }
        }
        System.out.println(c);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        range(n);
    }
}
