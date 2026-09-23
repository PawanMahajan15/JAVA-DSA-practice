package class42;

import java.util.ArrayList;
import java.util.Scanner;

public class KthFactor {
    public static int K(int n,int k){
        int c=0;
       // ArrayList<Integer>list=new ArrayList<>();
        for (int i = 1; i <=n ; i++) {
            if (n%i==0){
                c++;
                if (c==k)
                    return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        System.out.println(K(n,k));
    }
}
