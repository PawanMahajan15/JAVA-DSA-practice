package CLASS1To7;

public class DataType {
    public static void main(String[] args) {
        // integer family
        byte a=127; //byte ke value 127 se jada agar karege to hame byte ko short se change karna padega
        short b=32767;// short ke value 32767 se jada agar karege to hame short ko int se change karna padega
        int c=2147483647;//same reason as above, par int ko hum byte or short ke jagah par direct use kar sakte hai
        long d=72837901934l;//int ke value se jada lene par long me change karna padega ,par long ke value le rahe hai to last me (l) ya (L) lagana jarure hai
                            /* int ek default java valu hai  */
        //  floating or pointer family
        float f=9.9f;//hum agar point me valu le rahe hai vo bhe float me to hume last me (f) lagana jaruri hai
        double g=4.3;// double mai kuch bhe lagane ke jarurat nahi hai is liye ,ye default me gena jata hai
        // character family
        char ch=8292;
        char c1='9';
        // boolean family
        boolean h=true;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
        System.out.println(g);
        System.out.println(ch);
        System.out.println(c1);
        System.out.println(h);
    }
}
