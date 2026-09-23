package LEETCODEspecial;

import java.util.Arrays;

public class selectionSorting {
    public static void main(String[] args) {
        int arr[]={15,2,4,56,4,3,23,-344,-554,-1};
        for (int i = 0; i <arr.length; i++) {
            int smallest=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
                }
            if(i!=smallest){
                int temp=arr[i];
                arr[i]=arr[smallest];
                arr[smallest]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
