package class46;

public class kadanesTheorem_MaximumSubArr {
    public static int maxSubArray(int[] nums) {
        int max=nums[0];
        int sum=0;
        for(int a:nums){
            sum=sum+a;
            max=Math.max(sum,max);
            if (sum<0){
                sum=0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(maxSubArray(arr));
    }
}
