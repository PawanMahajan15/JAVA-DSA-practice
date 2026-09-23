package class45;

import java.util.Arrays;
import java.util.Scanner;

public class kTimesRghtRotation {
    public static void byalgo(int arr[],int k,int n) {
        int i=0,j=n-k-1;
        while(i<j){
           int temp=arr[i];
           arr[i++]=arr[j];
           arr[j--]=temp;
        }
        System.out.println(Arrays.toString(arr));
        i=n-k;j=n-1;
        while(i<j){
            int t=arr[i];
            arr[i++]=arr[j];
            arr[j--]=t;
        }
        System.out.println(Arrays.toString(arr));
        i=0;j=arr.length-1;
        while(i<j){
            int t=arr[i];
            arr[i++]=arr[j];
            arr[j--]=t;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int k = sc.nextInt();
        if (k > n) {
            k = k % n;
        }
        byalgo(arr,k,n);
    }
}
