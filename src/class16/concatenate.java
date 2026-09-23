package class16;
import java.util.Scanner;

public class concatenate {
    public int[] getConcatenate(int[] arr, int n){
int []copy=new int[n*2];
        for (int i = 0; i <arr.length; i++) {
            copy[i] = arr[i];
            copy[arr.length + i] = arr[i];
        }
        return copy;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        for (int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        concatenate obj=new concatenate();
        int cop[]=obj.getConcatenate(arr,size);
        for (int i = 0; i <cop.length ; i++) {
            System.out.print(cop[i]+" ");
        }
    }
}
