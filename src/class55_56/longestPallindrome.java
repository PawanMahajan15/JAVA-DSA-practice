package class55_56;
import java.util.*;

public class longestPallindrome {
    public static int pallin(String s){
        Map<Character,Integer>map=new HashMap<>();
        for (Character c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int ans=0;
        boolean a=false;
        for (Map.Entry<Character,Integer>k:map.entrySet()){
            if(k.getValue()%2==0){
                ans+=k.getValue();
            }else{
                ans+=k.getValue()-1;
                a=true;
            }
        }
             return (!a)?ans:ans+1;
    }
    public static int bySet(String s){
        Set<Character>set=new HashSet<>();
        int ans=0;
        for(Character c:s.toCharArray()){
            if(set.contains(c)){
                ans=ans+2;
                set.remove(c);
            }
            else{
                set.add(c);
            }
        }
        if (set.size()>0){
            ans=ans+1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(pallin("aabbcbbddd"));
        System.out.println(bySet("aabbcbbddd"));
        String s="aabbcbbddd";
        int bit[]=new int[123];
        for (Character c:s.toCharArray()){
            bit[c]++;
        }
        int ans=0;
        boolean isOdd=false;
        for (int i = 65; i <123 ; i++) {
            if(bit[i]%2==0){
                ans+=bit[i];
            }else{
                ans+=bit[i]-1;
                isOdd=true;
            }
            if(i==90)i=95;
        }
        if(isOdd){
            ans=ans+1;
        }
        System.out.println(ans);
    }
}
