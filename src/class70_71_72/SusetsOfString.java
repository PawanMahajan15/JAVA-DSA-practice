package class70_71_72;

import java.util.*;

public class SusetsOfString {
    public static void powersets(String s, String cur, List<String> list, int i){
        if(i==s.length()){
            list.add(cur);
            return;
        }
        powersets(s,cur+s.charAt(i),list,i+1);
        powersets(s,cur,list,i+1);
    }
    public static void subset(String s){
        List<String> list=new ArrayList<>();
        String cur="";
        powersets(s,cur,list,0);
        Collections.sort(list);
        System.out.println(list);
    }
    public static void main(String[] args) {
        subset("abcd");
    }
}
