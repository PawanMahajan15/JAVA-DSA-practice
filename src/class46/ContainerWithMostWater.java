package class46;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int height[]={1,8,6,2,5,4,8,3,7};
       int i=0,j=height.length-1;
       int max=0;
       while (i<j){
           int ans=Math.min(height[i],height[j])*(j-i);
           if(ans>max){
               max=ans;
           }
           if(height[i]>height[j])j--;
           else {
               i++;
           }
       }
        System.out.println(max);
    }
}
