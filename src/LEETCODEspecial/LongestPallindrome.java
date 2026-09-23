package LEETCODEspecial;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestPallindrome {
    private static int byMap(String s){
        Map<Character,Integer>map=new HashMap<>();
        for(Character ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int ans=0;
        boolean a=false;
        for(Map.Entry<Character, Integer>k: map.entrySet()){
            if(k.getValue()%2==0){
                ans+=k.getValue();
            }
            else{
                ans+=k.getValue()-1;
                a=true;
            }
        }
        if (a)return ans+1;
        return ans;
    }
    private static int bySet(String s){
        Set<Character>set=new HashSet<>();
        int ans=0;
        for(Character a:s.toCharArray()){
            if(set.contains(a)){
                ans+=2;
                set.remove(a);
            }else{
                set.add(a);
            }
        }
        if (set.isEmpty())return ans;
        return ans+1;
    }
    private static int byBitmap(String s){
        byte []arr=new byte[127];
        int ans=0;
        boolean is=false;
        for(Character a:s.toCharArray()){
            arr[a]++;
        }
        for(int i=65;i<123;i++){
            if(arr[i]%2==0)ans+=arr[i];
            else {
                ans += arr[i] - 1;
                is = true;
            }
        }
        return is?ans+1:ans;
    }
    public static void main(String[] args) {
        String s="aabbccda";
        System.out.println(byMap(s));
        System.out.println(bySet(s));
        System.out.println(byBitmap(s));
    }
}
