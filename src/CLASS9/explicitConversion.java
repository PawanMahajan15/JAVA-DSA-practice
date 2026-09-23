package CLASS9;

public class explicitConversion {
    public static void main(String[] args) {
        double a=45.43;
        byte b=(byte)a;               // explicit conversion
                                      /* hume jis bhe type me data change karna hai usee
                                      variable ke aage declear karna hoga or isme data loss bhe hota hai
                                       */
        System.out.println(b);
    }
}
