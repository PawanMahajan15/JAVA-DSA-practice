package class70_71_72;

public class towerOfHanoi {
    public static void toh(int n, String server, String destination, String helper) {
           if(n==1){
               System.out.println(n+" disk transfer from "+ server + " to "+destination);
               return;
           }
            toh(n-1,server,helper,destination);
        System.out.println(n+" disk transfer from "+ server + " to "+ destination);
        toh(n-1,helper,destination,server);
    }
    public static void main(String[] args) {
        toh(2,"s","d", "h");
    }
}
