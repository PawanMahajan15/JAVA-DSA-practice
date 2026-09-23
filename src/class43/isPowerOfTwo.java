package class43;

import java.util.Scanner;

public class isPowerOfTwo {
    public static boolean X(int n){
        if (n==1)return true;
        if (n%2!=0||n==0) return false;
        return X(n/2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(X(n));
    }
}
