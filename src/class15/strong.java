package class15;

import java.util.Scanner;

public class strong {
    public static boolean isStrongnumber(int n){
        int temp=n;
        int sum=0;
        while(n!=0){
            int fact=1;
            int remainder=n%10;
            for (int i = 1; i<=remainder; i++) {
                fact=fact*i;
            }sum=sum+fact;
            n=n/10;
        }
        if(sum==temp){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int T=sc.nextInt();
        int N=sc.nextInt();
        System.out.println(strong.isStrongnumber(N));
    }
}
