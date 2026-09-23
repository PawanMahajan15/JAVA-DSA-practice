package class19;

public class ToString {
    String name;
    int rollNo;
    String clgName;

    public ToString(String name, int rollNo, String clgName) {
        this.name = name;
        this.rollNo = rollNo;
        this.clgName = clgName;
    }


    @Override
        public String toString() {
            return "ToString{" +
                    "name='" + name + '\'' +
                    ", rollNo=" + rollNo +
                    ", clgName='" + clgName + '\'' +
                    '}';
    }
}
