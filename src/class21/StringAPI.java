package class21;

public class StringAPI {
    public static void main(String[] args) {
        String s1="pawan";//literal constant decleration
        String s2="pawan";
        String s3=new String("pawan");//constructor declartion
        String s4=new String("pawan");
        System.out.println(s1==s2);
        System.out.println(s3==s4);
//stringAPI
        String s="jaishreeram";
        String k="JAISHREERAM";
        System.out.println(s.toUpperCase()+" 1");
        System.out.println(s.toLowerCase()+" 2");
        System.out.println(s.charAt(0)+" 3");
        System.out.println(s.compareTo(k)+" 4");
        System.out.println(s.compareToIgnoreCase(k)+" 5");
        System.out.println(s.concat(k)+" 6");
        System.out.println(s.endsWith("ram")+" 7");
        System.out.println(s.startsWith("jai")+" 8");
        System.out.println(s.isBlank()+" 9");
        System.out.println(s.isEmpty()+" 10");
        System.out.println(s.indexOf("r")+" 11");
        System.out.println(s.equals(k)+" 12");
        System.out.println(s.equalsIgnoreCase(k)+" 13");
        System.out.println(s.length()+" 14");
        System.out.println(s.substring(4)+" 15");
        System.out.println(s.substring(2,5)+" 16");
        System.out.println(s.toCharArray());
    }
}
