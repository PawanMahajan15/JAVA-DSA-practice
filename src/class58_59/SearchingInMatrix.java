package class58_59;

public class SearchingInMatrix {
    private static boolean searchTarget(int arr[],int target ){
        int start=0,end=arr.length;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]==target)return true;
            else if (arr[mid]>target) {
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return false;
    }
    private static boolean searchRow(int matrix[][],int target){
        for (int i = 0; i < matrix.length ; i++) {
            if(matrix[i][matrix[0].length-1]>=target){
               return searchTarget(matrix[i],target);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[][] = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target=23;
        System.out.println(searchRow(arr,target));
    }
}
