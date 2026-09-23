package class45;

import java.util.Arrays;
import java.util.Scanner;
public class kTimesRotation {
    public static void byalgo(int arr[],int k,int n){
        System.out.println(Arrays.toString(arr));
        int i=0,j=k-1;
        while( i< j) {
            int temp=arr[i];
            arr[i]=arr[k-1-i];
            arr[k-1-i]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
        int mid=k;
        j=n-1;
        while (mid<j) {
            int t=arr[mid];
            arr[mid]=arr[j];
            arr[j]=t;
            mid++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
        i=0;
        j=n-1;
       while(i<j) {
            int e=arr[i];
            arr[i]=arr[j];
            arr[j]=e;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = {1, 2, 3, 4, 5,6};
        int n = arr.length;
       // int []temp = new int[n];
        int k = sc.nextInt();
        if (k > n) {
            k = k % n;
        }
//        int j = 0;
//        for (int i = k; i < n; i++) {
//            temp[j++] = arr[i];
//        }
//        for (int i = 0; i < k; i++) {
//            temp[j++] = arr[i];
//        }
//        System.out.println(Arrays.toString(temp));

        byalgo(arr,k,n);
    }
}
