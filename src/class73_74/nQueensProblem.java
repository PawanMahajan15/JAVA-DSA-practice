package class73_74;

import java.util.ArrayList;
import java.util.List;

public class nQueensProblem {
    private static boolean isVlaid(int[][] board, int col, int row) {
        int  i=row;
        int  j=col;
        while(j>=0) {
             if(board[i][j]==1)return false;
             j--;
        }
        i=row;
        j=col;
        while(j>=0&&i>=0){
            if(board[i][j]==1)return false;
            i--;
            j--;
        }
        i=row;
        j=col;
        while(j>=0&&i<board.length){
            if(board[i][j]==1)return false;
            i++;
            j--;
        }
return true;
    }
public static void putting(int n,List<List<String>>ans,int board[][],int col){
      if(col==n){
          List<String>cur=new ArrayList<>();
          for (int i = 0; i <n; i++) {
              String s="";
              for (int j = 0; j <n; j++) {
                  if(board[i][j]==1){
                      s+="Q";
                  }else {
                      s+=".";
                  }
              }
              cur.add(s);
          }
          ans.add(cur);
          return;
      }
    for (int row = 0; row <n; row++) {
        if(isVlaid(board,col,row)){
            board[row][col]=1;
            putting(n,ans,board,col+1);
            board[row][col]=0;
        }
    }
}
    public static List<List<String>> solveNQueens(int n){
    int board[][]=new int[n][n];
    List<List<String>>ans=new ArrayList<>();
      putting(n,ans,board,0);
      return ans;
    }
    public static void main(String[] args) {
        System.out.println( solveNQueens(4));
    }
}
