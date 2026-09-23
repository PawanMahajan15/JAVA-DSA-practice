package class44;

import java.util.Arrays;

public class MyArrayList {
    int data[];
     int p;
    public MyArrayList(){
        data=new int[7];
        p=-1;
    }
    public MyArrayList(int UserDefined){
        data=new int[UserDefined];
        p=-1;
    }
    private void capacity() {
        if (p+1 == data.length) {
          int temp[]=data;
          data=new int[data.length*2];
            for (int i = 0; i <temp.length ; i++) {
                data[i]=temp[i];
            }
        }
    }
    public void add(int value){
        capacity();
        data[++p]=value;
        }
        public void add(int index,int value){
            if(index<0||index>p+1){
                throw new ArrayIndexOutOfBoundsException("index:"+index+"is out of bound"+size());
            }else{
                capacity();
                for (int i = p; i>=index ; i--) {
                  data[i+1]=data[i];
                }
                data[index]=value;
                p++;
            }
    }
    public int  size(){
         return p+1;
    }
    public void remove(int index){
        if (index<0||index>p)throw new ArrayIndexOutOfBoundsException("aisa koi index hai hee nahi");
        else {
            for (int i = index; i <=p ; i++) {
                data[i]=data[i+1];
            }p--;
        }
    }
    public int get(int index){
        if (index<0||index>p)throw new ArrayIndexOutOfBoundsException("aisa koi index hai hee nahi");
        return data[index];
    }

    @Override
    public String toString() {
       StringBuilder sb=new StringBuilder();
       sb.append("[");
        for (int i = 0; i <=p; i++) {
            sb.append(data[i]);
            if(i<p){
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
