package class45;

import java.util.Arrays;

public class SortCollours {
    public static void main(String[] args) {
        int arr[]={2,1,2,0,1,0};
        int i=0,j=0,k=arr.length-1;
        while(i<=k){
            if(arr[i]==2){
                int temp=arr[k];
                arr[k--]=arr[i];
                arr[i]=temp;
            }
           else if (arr[i]==0){
                int t=arr[j];
                arr[j++]=arr[i];
                arr[i++]=t;
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
