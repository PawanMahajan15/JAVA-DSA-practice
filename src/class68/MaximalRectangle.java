package class68;

import java.util.Arrays;
import java.util.Stack;

public class MaximalRectangle {
    public static int largestRectangleArea(int[] heights) {
            Stack<Integer>s1=new Stack<>();
            int right[]=new int[heights.length];
            int left[]=new int[heights.length];
            int n=heights.length;
        for (int i = 0; i <n; i++) {
                while(!s1.empty()&&heights[i]<=heights[s1.peek()]){
                    s1.pop();
                }
                if(s1.empty()){
                    left[i]=-1;
                }else{
                    left[i] = s1.peek();
                }
                s1.push(i);
            }
            System.out.println(Arrays.toString(right));
        s1=new Stack<>();
        for (int i =n-1; i >=0; i--){
                while(!s1.empty()&&heights[i]<=heights[s1.peek()]){
                    s1.pop();
                }
                if(s1.empty()){
                    right[i]=n;
                }else{
                    right[i]=s1.peek();
                }

                s1.push(i);
            }
            System.out.println(Arrays.toString(left));
            int max=0;
            for (int j = 0; j < heights.length; j++) {
                max=Math.max((right[j]-left[j]-1)*heights[j],max);
            }
            return max;

    }
    public static int maximalRectangle(char[][] matrix) {
         int arr[]=new int[matrix[0].length];
         int max=0;
        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[j]=matrix[i][j]=='0'?0:arr[j]+(matrix[i][j]-'0');
            }
            max=Math.max(max,largestRectangleArea(arr));
        }
        return max;
    }
    public static void main(String[] args) {
       char[][] matrix = {{'0','1'},
                          {'1','0'}};
        System.out.println(maximalRectangle(matrix));
    }
}
