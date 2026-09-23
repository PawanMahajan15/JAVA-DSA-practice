package class52;
import java.util.Arrays;

public class FirstAndLastPosition {
    private static int first(int arr[],int start,int end,int target) {
          int ans=-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans=mid;
                end=mid-1;
            } else if (arr[mid] < target) {
               start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
    private static int last(int arr[],int start,int end,int target) {
        int ans=-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans=mid;
                start=mid+1;
            } else if (arr[mid] > target) {
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
    private static int[] position(int arr[],int start,int end,int target){
        int ans[]=new int[2];
                ans[0]=first(arr,start,end,target);
                ans[1]=last(arr,start,end,target);
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={5,7,7,8,8,10} ;
        System.out.println(Arrays.toString(position(arr, 0, arr.length - 1,0)));
    }
}
