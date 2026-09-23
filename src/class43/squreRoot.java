package class43;

import java.util.Scanner;

public class squreRoot {
    public static int root(int n){
        long start=1;
        long end=n;
       long mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if (mid*mid>=n){
                 end=mid-1;
            }else if (mid*mid<=n){
                start=mid+1;
            }
        }
        return (int)mid;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        System.out.println(root(n));
//        int ans=0;
//        for (int i = 1; i*i <=n ; i++) {
//            ans=i;                                //O(Sqrt(n))
//        }
//        System.out.println(ans);
    }
}
