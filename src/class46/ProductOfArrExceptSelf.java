package class46;

import java.util.Arrays;

public class ProductOfArrExceptSelf {
    public static int[] a(int arr[],int c){
        if(c>1){
            int empty[]=new int[arr.length];
            return empty;
        }else if(c==1){
            int pro=1;
            for (int i = 0; i <arr.length ; i++) {
                if (arr[i]!=0){
                    pro=pro*arr[i];
                }
            }
            for (int i = 0; i < arr.length ; i++) {
                if(arr[i]!=0){
                    arr[i]=0;
                }else{
                    arr[i]=pro;
                }
            }
            return arr;

        }
        else{
            int pro=1;
            for (int i = 0; i <arr.length ; i++) {
                    pro=pro*arr[i];
                }
            for (int i = 0; i < arr.length; i++) {
                arr[i]=pro/arr[i];
            }
            return arr;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int c=0;
        for(int i:arr) {
            if (i == 0) {
                c++;
            }
        }
        System.out.println(Arrays.toString(a(arr,c)));
    }
}
