package class10and11;

import java.util.Scanner;

public class FibonicAddition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int num=n*2;
        int a=0;
        int b=1;
        int z=0;
        for (int i = 1; i <=num; i++) {
            int sum=a+b;
            a=b;
            b=sum;
            if (i%2==0){
                z=z+a;
            }
        }
        System.out.println(z);
    }
}
