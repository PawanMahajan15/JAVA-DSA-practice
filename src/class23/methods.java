package class23;

import java.sql.SQLOutput;

public class methods {
    public static void main(String[] args) {
        int a=Integer.parseInt("123");
        Integer b=Integer.parseInt("3823234");
        Float c=Float.parseFloat("3345.43");
        Long d=Long.parseLong("3243312");//this methode is use for conversion of String into primitive data type
        Byte b1=Byte.parseByte("127");
        Short e=Short.parseShort("456");
        Boolean r=Boolean.parseBoolean("true");
        Double t=Double.parseDouble("435678.675");
        //(value of )this method also do same work
        float c2=Float.valueOf("23.34");
        Double c5=Double.valueOf("3455.456");
        System.out.println(c2);
    }
}