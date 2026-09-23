package class70_71_72;

import java.util.ArrayList;

public class Josephus {
    public static int findTheWinner(int n, int k) {
        ArrayList<Integer>list=new ArrayList<>();
        for (int i = 1; i <=n; i++) {
            list.add(i);
        }
        return kill( k,list,0);
    }

    private static int kill(int k, ArrayList<Integer> list, int i) {
        if(list.size()==1)return list.get(0);
        int index=(i+k-1)%list.size();
        list.remove(index);
         return kill(k,list,index);
    }

    public static void main(String[] args) {
        System.out.println(findTheWinner(10,4));
    }
}
