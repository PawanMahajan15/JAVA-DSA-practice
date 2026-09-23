package class45;

import java.util.Arrays;

public class mergeSortedArrays {
    public static void mergeSortedArrays(int arr1[],int m, int arr2[], int n) {
        int i=m-1,j=n-1,k= arr1.length-1;
        while(i>=0&&j>=0){
            if(arr1[i]>=arr2[j]){
                arr1[k--]=arr1[i--];
            }else{
                arr1[k--]=arr2[j--];
            }
        }
        while(j>=0){
            arr1[k--]=arr2[j--];
        }
        System.out.println(Arrays.toString(arr1));
    }
    public static void main(String[] args) {
        int arr1[]={3,4,5,0,0,0};
        int arr2[]={1,2,2};
        int m=3;
        int n=3;
        mergeSortedArrays(arr1,m,arr2,n);
    }
}
