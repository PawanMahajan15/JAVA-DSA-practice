package class50;

public class firstMissingPositive {
    public static int missing(int arr[]){
        int i=0;
       while(i<arr.length){
           if(arr[i]<=arr.length&&arr[i]>0&&arr[i]-1!=i&&arr[i]!=arr[arr[i]-1]){
               int temp=arr[i];
               arr[i]=arr[temp-1];
               arr[temp-1]=temp;
           }else{
              i++;
           }
       }
       int j=0;
       while(j<arr.length){
           if(arr[j]-1==j){
               j++;
           }else {
               return j+1;
           }
       }
       return j+1;
    }
    public static void main(String[] args) {
        int arr[]={3,4,-1,1};
        System.out.println(missing(arr));
    }
}
