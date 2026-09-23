package CLASS12;

import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int Sq=n*n;
        int temp=n;
        int sum=0;
        while(Sq!=0){
            int remainder=Sq%10;
            sum=sum+remainder;
            Sq=Sq/10;
        }n=temp;
        System.out.println(sum==n?"Yes":"No");
    }
}/* for example=9
9*9=81
81=8+1=9
sumof Square=n */


