package class68;

import java.util.Arrays;
import java.util.Stack;

public class LargestRectangle {
    public static int largestRectangleArea(int[] heights) {
        Stack<int[]>s1=new Stack<>();
        Stack<int[]>s2=new Stack<>();
        int right[]=new int[heights.length];
        int left[]=new int[heights.length];
        int i=heights.length-1;
        int index=0;
        while(i>=0){
            while(!s1.empty()&&heights[i]<=s1.peek()[0]){
                s1.pop();
            }
            if(s1.empty()){
                right[i]=index+1;
            }else{
                right[i]=index-s1.peek()[1];
            }
            s1.push(new int[]{heights[i],index});
            i--;
            index++;
        }
        System.out.println(Arrays.toString(right));
        index=1;
        while(index<=heights.length){
            while(!s2.empty()&&heights[index-1]<=s2.peek()[0]){
                s2.pop();
            }
            if(s2.empty()){
                left[index-1]=index-1;
            }else{
                left[index-1]=index-s2.peek()[1]-1;
            }
            s2.push(new int[]{heights[index-1],index});
            index++;
        }
        System.out.println(Arrays.toString(left));
        int max=0;
        for (int j = 0; j < heights.length; j++) {
            max=Math.max((left[j]+right[j])*heights[j],max);
        }
        return max;
    }
    public static void main(String[] args) {
        int []arr={1,0};
        System.out.println(largestRectangleArea(arr));
    }
}
