package class16;

import java.util.Arrays;
import java.util.Scanner;

public class kTimesLeftRotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int size=sc.nextInt();
        int arr[]=new int[size];
        for (int i = 0; i <arr.length; i++) {
        arr[i]=sc.nextInt();
        }
        while(k!=0){
            int temp=arr[0];
        for (int i = 0; i <arr.length-1; i++) {
            arr[i] = arr[i + 1];
           }
            arr[arr.length-1]=temp;
            k--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
