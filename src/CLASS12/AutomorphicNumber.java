package CLASS12;

import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int squred=n*n;
        int count=0;
        while(n!=0){
            count++;
            n=n/10;
        }n=temp;
        long remainder=squred%(long)Math.pow(10,count);
        System.out.println(remainder==temp?"automorphic ":"not");
        System.out.println(squred);
    }

}
