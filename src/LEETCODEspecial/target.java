package LEETCODEspecial;

import java.util.Scanner;

public class target {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int size=sc.nextInt();
        int arr[]=new int[size];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i <arr.length ; i++) {
            int sum=0;
            for (int j = i; j <arr.length ; j++) {
                sum=sum+arr[j];
                if (sum==target){
                  
                }
            }
        }
    }
}
