package class67;
import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static int[] nextLargerElement(int arr[]){
      int ans[]=new int[arr.length];
        Stack<Integer>s=new Stack<>();
       ans[ans.length-1]=-1;
       s.push(arr[arr.length-1]);
       int i=arr.length-2;
       while(i>=0){
           while(!s.empty()&&s.peek()<=arr[i]){
               s.pop();
               }
           if(s.empty()) {
               ans[i]=(-1);
           }else {
               ans[i]=(s.peek());
           }
           s.push(arr[i]);
           i--;
       }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {2, 1, 2, 4, 3};
        System.out.println(Arrays.toString(nextLargerElement(arr)));
    }
}
