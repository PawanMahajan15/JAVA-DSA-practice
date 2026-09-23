package class52;

public class searchInsert {
    private static int Insert(int arr[],int start,int end,int target){
        int ans=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            } else if (arr[mid]<target) {
                start=mid+1;
                ans=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,6};
        System.out.println(Insert(arr,0,arr.length-1,-1));
    }
}
