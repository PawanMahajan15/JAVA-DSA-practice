package class46;

public class trappingRainWater {
    public static void main(String[] args) {
     int []heights={0,1,0,2,1,0,1,3,2,1,2,1};
     int []left=new int[heights.length];
     int []right=new int[heights.length];
        int max=0;
        for (int i = 0; i <heights.length; i++) {
            left[i]=max;
            max=Math.max(max,heights[i]);
        }
        max=0;
        for (int i = heights.length-1; i>=0; i--) {
            right[i]=max;
            max=Math.max(max,heights[i]);

        }
        int sum=0;
        for (int i = 0; i < heights.length; i++) {
            int ans=Math.min(left[i],right[i])-heights[i];
            if(ans>0){
                sum=sum+ans;
            }
        }
        System.out.println(sum);
    }
}
