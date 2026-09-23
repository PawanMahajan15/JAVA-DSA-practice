package class35_36_37_38_39_40;

import java.util.Scanner;

public class HCF {
    public static int BF(int a, int b, int min){
        if(a%min==0&&b%min==0)return min;
        return BF(a,b,min-1);

    }
    public static int euclideanAlgo(int a,int b){
        if(a==b)return a;
        if (a>b)return euclideanAlgo(a-b,b);
        return euclideanAlgo(a,b-a);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int ans=1;
        int min=Math.min(a,b);
        System.out.println("by brud force method= "+BF(a,b,min));
        for (int i = min; i>=1 ; i--) {
            if (a%i==0&&b%i==0){
                ans=i;
                break;
            }
        }
        System.out.println("by brud force'simple'= "+ans);
        while(a!=b){
            if (a>b){
                a=a-b;
            }else {
                b=b-a;
            }
        }
        System.out.println("by euclidean algo 'simple'= "+a);
        System.out.println("by euclidean algo method= "+euclideanAlgo(a,b));

    }
}
