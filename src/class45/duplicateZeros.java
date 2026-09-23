package class45;

import java.util.Arrays;

public class duplicateZeros {
    public static void main(String[] args) {
        int arr[]={0,1,2,3,0,5};
        int c=0;
        for (int k : arr) {
            if (k == 0)
                c++;
        }
        int i=arr.length-1,j= arr.length+c-1;
        while(i!=j){
           if(j>= arr.length){
               j--;
               if(arr[i]==0){
                   if(j<arr.length){
                       arr[j--] = arr[i--];
                   }else {
                       j--;
                       i--;
                   }
               }else{
               i--;
               }
           }else
           {
                arr[j--]=arr[i];
                if(arr[i]==0) {
                    arr[j--] = arr[i--];
                }else{
                    i--;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
