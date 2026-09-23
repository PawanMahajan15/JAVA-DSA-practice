package class68;

import java.util.Stack;

class StockSpanner {
    Stack<int []>st;
    int i;
    public StockSpanner() {
      st=new Stack<>();
       i=-1;
    }
    public int next(int price) {
        ++i;
      while(!st.empty()&&st.peek()[0]<=price){
          st.pop();
      }
      int ans;
      if(st.empty()){
          ans=i+1;
      }else{
          ans=i-st.peek()[1];
      }
      st.push(new int[]{price, i});
      return ans;
    }
}
