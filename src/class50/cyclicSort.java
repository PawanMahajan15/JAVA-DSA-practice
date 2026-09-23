package class50;

import java.util.Arrays;

public class cyclicSort {
    public static void cyclic(int arr[]){
        int i=0;
        while(i<arr.length){
            if(arr[i]-1!=i){
                int temp=arr[arr[i]-1];
                arr[arr[i]-1]=arr[i];
                arr[i]=temp;
            }else{
                i++;
            }
        }
    }
    public static void main(String[] args) {
int arr[]={2,5,6,3,4,1,9,8,7,10};
cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
}
