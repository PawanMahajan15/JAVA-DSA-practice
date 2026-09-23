package class21;
import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;
public class Togglechar {
    public static String toggle(String name){
        String toggled="";
        for (int i = 0; i <name.length() ; i++) {
            if (name.charAt(i)>= 'A' && name.charAt(i) <= 'Z'){
                toggled = toggled + (char) (name.charAt(i) + 32);
            }else if(name.charAt(i)>='a'&&name.charAt(i)<='z'){
                toggled=toggled+(char)(name.charAt(i)-32);
            }
        }
        return toggled;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println(Togglechar.toggle(name));
//        String toggled="";
//        for (char ch:name.toCharArray()) {
//            if (ch >= 'A' && ch <= 'Z') {
//                toggled = toggled + (char) (ch + 32);
//            }else if(ch>='a'&&ch<='z'){
//                toggled=toggled+(char)(ch-32);
//            }
//        }
//        System.out.println(toggled);
    }
}
