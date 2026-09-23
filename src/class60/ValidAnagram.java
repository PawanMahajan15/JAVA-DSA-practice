package class60;

import java.util.Arrays;

public class ValidAnagram {
    public  static boolean isValid(String s,String t){
        int arr[]=new int[123];
        for(char c:s.toCharArray()){
            arr[c]++;
        }
        for(char c:t.toCharArray()){
            arr[c]--;
        }
        for (int c:arr){
            if (c!=0)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="a";
        String t="ab";

        System.out.println(isValid(s,t));

    }
}
