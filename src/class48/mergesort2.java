package class48;

import java.util.Arrays;

public class mergesort2 {
    private static void merge(int arr[],int left,int mid,int right){
        int temp[]=new int[(right-left)+1];
        System.out.println(temp.length);
        int i=left;
        int j=mid+1;
        int k=0;
        while(i<mid+1&&j<=right) {
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
            }
        }
        while(i<mid+1){
            temp[k++]=arr[i++];
        }
        while(j<=right){
            temp[k++]=arr[j++];
        }
        System.out.println(Arrays.toString(temp));
        for (int l =0; l <temp.length; l++) {
            arr[left+l]=temp[l];
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[]={11,2,4,7,9,12,1,3,4,6,7,10};
        System.out.println(arr.length);
        int left=1,right=arr.length-1;
        int mid=5;
        merge(arr,left,mid,right);
    }
}
