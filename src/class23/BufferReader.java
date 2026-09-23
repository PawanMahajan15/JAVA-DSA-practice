package class23;

import java.io.*;

public class BufferReader {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader k=new BufferedReader(isr);
        //or
        //BufferedReader k=new BufferedReader( new InputStreamReader(System.in));
        int a=Integer.parseInt(k.readLine());
        int b=Integer.parseInt(k.readLine());
        String s=k.readLine();
        System.out.println(a+b+s);
        //scanner may jo problem aati hai int k bad string ko read nahi karta vo
        //bufferreader may nahi aati
    }
}
