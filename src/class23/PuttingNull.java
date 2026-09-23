package class23;

import java.sql.SQLOutput;

public class PuttingNull {
    public static void main(String[] args) {
        Integer marks=null;
       System.out.println(marks+10);// here we get error
          if(marks==null){
              //
          }
    }
}
