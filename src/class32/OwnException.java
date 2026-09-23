package class32;

import java.sql.SQLOutput;

class myException extends Exception{
    public  myException(String msg){
//       System.out.println("kuch toh gaad baad hai");
        super(msg);

    }
}
public class OwnException {
    public static void main(String[] args)throws myException {
        int age=9;
        try{
            if (age<18){
                throw new myException("kachu gadbad hai bhaya");
            }else {
                System.out.println("sab changa si.....");
            }
        }
        catch (myException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("kya huaa tera vada...");
        }
    }
}
