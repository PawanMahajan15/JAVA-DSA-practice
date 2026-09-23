package class15;

import java.util.Scanner;

public class method {
    public static int method_kya_hota_hai(int x,int y){
        int sum=x+y;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d= sc.nextInt();
        System.out.println(method.method_kya_hota_hai(a,b));
        System.out.println(method.method_kya_hota_hai(c,d));
    }
}
