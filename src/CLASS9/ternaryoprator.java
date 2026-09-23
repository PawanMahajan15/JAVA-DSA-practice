package CLASS9;

import java.util.Scanner;

public class ternaryoprator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ans=a>b?a:b;
        System.out.println(ans);             //same data type is use
        int c=sc.nextInt();
        int d=sc.nextInt();
        String Ans=a>b?"c is greater":"d is greater";    // diffirent data type is use
        System.out.println(Ans);
        int e=sc.nextInt();
        int f=sc.nextInt();
        System.out.println(a>b?"c is greater":"d is greater");  //direct print without
                                                                // any data type
    }
}
