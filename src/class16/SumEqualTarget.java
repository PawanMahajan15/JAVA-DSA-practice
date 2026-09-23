package class16;

import java.util.Scanner;

public class SumEqualTarget {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int size= sc.nextInt();
        int arr[]=new int[size];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        int c=0;
        for (int i = 0; i <arr.length ; i++) {
            int sum=0;
            for (int j = i; j <arr.length ; j++) {
                sum=sum+arr[j];
                if(sum==target){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
