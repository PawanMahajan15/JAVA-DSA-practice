package class49;

import java.util.Arrays;

public class QuickSort {
    public static int pivot(int arr[],int left,int right){
     int pivot=arr[left];
     int i=left+1;
     int j=right;
     while(i<=j){
         while(i<=j&&arr[i]<=pivot)i++;
         while(i<=j&&arr[j]>pivot)j--;
         if(i<j){
                 int temp=arr[i];
                 arr[i++]=arr[j];
                 arr[j--]=temp;
         }
     }
     int temp=arr[j];
     arr[j]=arr[left];
     arr[left]=temp;
     return j;
    }
    public static void partition(int  arr[],int left,int right){
        if(left<right){
           int p=pivot(arr, left, right);
           partition(arr,left,p-1);
           partition(arr,p+1,right);
        }
    }
    public static void main(String[] args) {
        int arr[]={38,27,43,3,9,82,10,5,354,46,4656,23};
        int left=0;
        int right=arr.length-1;
      partition(arr,left,right);
        System.out.println(Arrays.toString(arr));
    }
}
