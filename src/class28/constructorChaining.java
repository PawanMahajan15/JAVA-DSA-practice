package class28;

import java.io.BufferedReader;
import java.io.InputStreamReader;

  class constructorChaining {
    constructorChaining(){
        System.out.println("jai shree ram");
    }
    constructorChaining(int a){
           this();
        System.out.println("x= "+a);
    }                                               //this is known as constructor chaining
}                                                   //super keyword is use to directly access method of parent class from child class
class chain2 extends constructorChaining {
    chain2(int x, int y) {
        super(89);
        System.out.println("chain 2 method 1");
        System.out.println("x+y= " + (x + y));
    }

    chain2(String name) {
        this(34, 56);
        System.out.println("name kya hai jaani tera=" + name);
    }
}
     class mainvali{
     public static void main(String[] args)  {
         chain2 obj=new chain2("pawan");
     }
 }
