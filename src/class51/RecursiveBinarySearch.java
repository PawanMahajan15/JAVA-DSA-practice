package class51;

public class RecursiveBinarySearch {
    private static int Binary(int arr[],int start,int end,int target){
        if(start<=end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) {
                return Binary(arr, mid + 1, end, target);
            } else if (arr[mid] > target) {
                return Binary(arr, start, mid - 1, target);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []arr={1};
        System.out.println(Binary(arr,0,arr.length-1,1));
    }
}
