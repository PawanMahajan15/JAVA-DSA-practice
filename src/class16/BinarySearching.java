package class16;

import java.util.*;

public class BinarySearching {
    public static int binarySearching( int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end) {
            int mid = (start + end) / 2;
            if (key == arr[mid]) {
                return mid;
            }
            if (key < mid) {
              end=mid-1;
            } if(key>mid){
                start=mid+1;
            }
        }
         return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int size=sc.nextInt();
         int arr[]=new int[size];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int  key=sc.nextInt();
        System.out.println(BinarySearching.binarySearching(arr,key));
    }
}
