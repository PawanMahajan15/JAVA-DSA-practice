package class70_71_72;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class permutation {
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void sub(int []arr,List<List<Integer>>ans,int i){
        if(i==arr.length){
            List<Integer>cur=new ArrayList<>();
            for(int a:arr){
                cur.add(a);
            }
            ans.add(cur);
            return;
        }
        for (int j = i; j <arr.length; j++) {
            swap(arr,i,j);
            sub(arr,ans,i+1);
            swap(arr,i,j);
        }
    }
    public static void main(String[] args) {
           int arr[]={1,2,3};
           List<List<Integer>>ans=new ArrayList<>();
        sub(arr,ans,0);
        
        System.out.println(ans);
    }
}
