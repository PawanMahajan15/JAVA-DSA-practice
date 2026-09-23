package class15;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        int N= sc.nextInt();
        prime obj=new prime();
        System.out.println(obj.isPrime(N));
    }
    public boolean isPrime(int n){
        int sum=0;
        for (int i = 1; i<=n; i++) {
            if(n%i==0){
                sum++;
            }
        }if(sum==2){
            return true;
        }else {
            return false;
        }
    }
}
