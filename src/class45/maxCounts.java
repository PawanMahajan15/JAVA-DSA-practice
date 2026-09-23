package class45;

public class maxCounts {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int ans=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                c++;
            }else{
                c=0;
            }
            if(ans<c){
                ans=c;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
int nums[]={1,1,0,0,1,0,1,1,1,0};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
