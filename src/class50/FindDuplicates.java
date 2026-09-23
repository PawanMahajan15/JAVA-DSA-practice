package class50;
import java.util.ArrayList;
import java.util.List;
public class FindDuplicates {
    public static List<Integer> returnmissing(int arr[]){
        List<Integer>list =new ArrayList<>();
         int i=0;
         while(i<arr.length){
           if(arr[i]==i+1||arr[i]==arr[arr[i]-1]){
             i++;
           }else {
               int temp=arr[i];
               arr[i]=arr[temp-1];
               arr[temp-1]=temp;
           }
         }
         int j=0;
         while(j<arr.length){
             if(j==arr[j]-1){
                 j++;
             }else{
                 list.add(j+1);
                 j++;
             }
         }
     return list;
    }
    public static void main(String[] args) {
        int arr[]={4,3,2,7,7,2,3,1};
        System.out.println(returnmissing(arr));
    }
}
