package class50;

public class MissingNumber {
    public static int missing(int arr[]){
        int i=0;
        int n=arr.length;
        while(i<arr.length){
            if(arr[i]==n||arr[i]==i){
                i++;
            }
            else {
                int temp=arr[i];
                arr[i]=arr[temp];
                arr[temp]=temp;

        }}
        int  j=0;
        while(j<arr.length){
            if(arr[j]!=j){
                return j;
            }
            else j++;
        }
        return n;
    }
    public static void main(String[] args) {
        int arr[]={0,3,2,4};
        System.out.println(missing(arr));
    }
}
