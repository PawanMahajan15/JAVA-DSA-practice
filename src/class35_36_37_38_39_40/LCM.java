package class35_36_37_38_39_40;

import java.util.Scanner;

public class LCM {
    public static int gcd(int a,int b,int min){
        if(a%min==0&&b%min==0)return min;
        return LCM.gcd(a,b,min-1);
    }
    public static int lcm(int a,int b,int min) {
        int GCD=LCM.gcd(a,b,min);
        int ans=(a*b)/GCD;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        int min=Math.min(a,b);
        System.out.println(lcm(a,b,min));
    }
}
