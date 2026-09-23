package class19;
    public class ClassAndObject {
    public static void main(String[] args) {
                Student s = new Student();
                // first method by reference
                s.name = "pawan";
                s.college = "TIT";
                s.rollno = 182;
                System.out.println(s.rollno);
                System.out.println(s.name);
                System.out.println(s.college);
                Student s1=new Student();
                s1.name="chetan";
                s1.rollno=123;
                s1.college="lnct";
        System.out.println(s1.rollno);
        System.out.println(s1.name);
        System.out.println(s1.college);
      }
    }