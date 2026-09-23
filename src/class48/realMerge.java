package class48;
import java.util.Arrays;
public class realMerge {
    private static void merge(int arr[],int left,int mid,int right){
        int temp[]=new int[right-left+1];
        int i=left;
        int j=mid+1;
        int k=0;
        while(i<mid+1&&j<=right){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }else if(arr[i]>arr[j]) {
                temp[k++]=arr[j++];
            }
        }
        while(i<mid+1)temp[k++]=arr[i++];
        while(j<=right)temp[k++]=arr[j++];
        for (int l = 0; l < temp.length ; l++) {
            arr[left+l]=temp[l];
        }
    }
   private static int[] merge3(int arr[],int left,int right){
        if(left<right){
            int mid=(right+left)/2;
            merge3(arr, left, mid);
            merge3(arr, mid+1, right);
            merge(arr,left,mid,right);
        }
       return arr;
   }
    public static void main(String[] args) {
        int arr[]={38,27,43,3,9,82,10};
        int left=0;
        int right=arr.length-1;
        System.out.println(Arrays.toString(merge3(arr,left,right)));

    }
}
