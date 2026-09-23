package class48;
import java.util.Arrays;
public class mergesort {
    private static void merge1(int arr[],int left,int mid,int right){
        int m=mid-left;
        int n=(right-mid)+1;
        int m1[]=new int[m];
        int m2[]=new int[n];
        for (int i = 0; i <m1.length; i++) {
            m1[i]=arr[left+i];
        }
        System.out.println(Arrays.toString(m1));
        for (int i =0; i <m2.length; i++) {
            m2[i]=arr[mid+i];
        }
        System.out.println(Arrays.toString(m2));
        int i=0,j=0,k=left;
        while(i<m1.length&&j<m2.length) {
            if (m1[i] <= m2[j]) {
                arr[k++] = m1[i++];
            } else {
                arr[k++] = m2[j++];
            }
        }
        while(i<m1.length){
            arr[k++]=m1[i++];
        }
        while(j<m2.length){
            arr[k++]=m2[j++];
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[]={11,2,4,7,9,12,1,3,4,6,7,10};
        System.out.println(arr.length);
        int left=1,right=arr.length-1;
        int mid= (right+left)/2;
        merge1(arr,left,mid,right);
    }
}
