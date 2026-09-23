package CLASS12;

import java.util.Scanner;

public class Harshad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int temp=n;
        while(n!=0){
            int remainder=n%10;
            sum=sum+remainder;
            n=n/10;
        }
        n=temp;
        System.out.println(n%sum==0?"Yes":"No");

    }
}

/*
for example input is 18
1+8=9
18%9==0
 */