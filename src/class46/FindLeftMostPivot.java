package class46;

public class FindLeftMostPivot {
    public static int pivotIndex(int[] arr) {
        int right[] = new int[arr.length];
        int sum = 0;
        right[arr.length-1]=arr[arr.length-1];
        for (int i = arr.length - 1; i > 0; i--) {
            right[i-1] =right[i] +arr[i-1];
        }
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if (sum==right[i])return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,7,3,6,5,6};
        System.out.println("index= "+pivotIndex(arr));

    }
}
