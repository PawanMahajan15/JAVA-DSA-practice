package class46;

public class MajorityElement_MooresVotingAlgo {
    public static int majorityElement(int[] arr) {
        int pro=arr[0];
        int vote=1;
        for(int a:arr){
            if (pro==a){
                vote++;
            }else {
                vote--;
            }
            if(vote==0){
                pro=a;
                vote=1;
            }
        }
        return pro;
    }

    public static void main(String[] args) {
        int arr[]={1,1,2,2,2,1,1,1};
        System.out.println(majorityElement(arr));
    }
}
