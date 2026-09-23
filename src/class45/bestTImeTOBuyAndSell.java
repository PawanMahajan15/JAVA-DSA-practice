package class45;

public class bestTImeTOBuyAndSell {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        int max=0,min=arr[0];
        for (int i = 1; i <arr.length ; i++) {
              int cmax=arr[i]-min;
              max=Math.max(max,cmax);
              min=Math.min(min,arr[i]);
        }
        System.out.println(max);
    }
}
