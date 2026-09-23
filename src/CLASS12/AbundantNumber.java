package CLASS12;

import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int temp=n;
        int i=1;
        while(i<n){
            if(n%i==0) {
                sum = sum + i;
            }
              i++;
        }n=temp;
        System.out.println(sum>n?"Yes":"No");
    }
}
