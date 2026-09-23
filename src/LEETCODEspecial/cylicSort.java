package LEETCODEspecial;

import java.util.Arrays;

public class cylicSort {
    public static void main(String[] args) {
      int arr[]={4,3,2,7,8,2,3,1};
      int n=arr.length;
      int i=0,j=0;
      while(i<arr.length){
          if(arr[i]!=i){
              if(arr[i]>arr.length){
                  i++;
              }
              int temp=arr[i];
              arr[i]=i;
              arr[temp]=temp;
          }else{
              i++;
          }
      }
        System.out.println(Arrays.toString(arr));
    }
}
