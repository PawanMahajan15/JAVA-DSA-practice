package class16;

import java.util.Scanner;

public class SumOfAbsoluteDifference {
    public int absoluteDifference(int []arr,int n){
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 1+i; j <arr.length; j++) {
                sum=sum+(arr[i]-arr[j]);
            }
        }
   return Math.abs(sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        for (int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        SumOfAbsoluteDifference obj=new SumOfAbsoluteDifference();
        System.out.println((obj.absoluteDifference(arr,size)));
    }
}
