package class53;

public class FindPeakindex {
    private static int peak(int arr[]){
        int start=0,end=arr.length-1;
        while(start<=end){
           int  mid=start+(end-start)/2;
           if(arr[mid]<arr[mid+1]){
               start=mid+1;
           } else if (arr[mid]>arr[mid+1]) {
               end=mid-1;
           }
        }
        return start;
    }
    public static void main(String[] args) {
        int  arr[]={1,2,3,4,5,6,7,8,9,10,3,2,0};
        System.out.println(peak(arr));
    }
}
