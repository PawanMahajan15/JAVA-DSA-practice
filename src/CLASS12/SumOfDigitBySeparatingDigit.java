package CLASS12;

import java.util.Scanner;

public class SumOfDigitBySeparatingDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int remainder;
        int sum=0;
        while(n!=0){
            remainder=n%10;
            sum=sum+remainder;
            n=n/10;

        }
        System.out.println(sum);

    }
}
