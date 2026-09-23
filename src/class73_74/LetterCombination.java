package class73_74;

import java.util.ArrayList;
import java.util.List;

public class LetterCombination {
    public static void comb(List<String>ans,String digits,String cur,String arr[],int i){
            if(i==digits.length()){
                ans.add(cur);
                return;
            }
            String key=arr[digits.charAt(i)-'0'];
        for (int j = 0; j <key.length(); j++) {
            comb(ans,digits,cur+key.charAt(j),arr,i+1);
        }
    }
    public static List<String> letterCombinations(String digits) {
       String []arr={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String>ans=new ArrayList<>();
        comb(ans,digits,"",arr,0);
        return ans;
    }
    public static void main(String[] args) {
        String digits="234";
        System.out.println( letterCombinations(digits));

    }
}
