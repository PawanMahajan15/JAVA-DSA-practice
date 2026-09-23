package class73_74;

public class WordSearch {
    public static boolean isValid(char[][] board, String word,int m,int n,int row,int col, int visited[][],int index){
        if(index==word.length()){
            return true;
        }
        if(row<0||row>=m||col<0||col>=n||visited[row][col]==1||board[row][col]!=word.charAt(index))return false;
       visited[row][col]=1;
        int ct[]={-1,0,1,0};
        int rt[]={0,1,0,-1};
        for (int k = 0; k <4 ; k++) {
           int nrow=row+rt[k];
            int ncol=col+ct[k];
            if(isValid(board,word,m,n,nrow,ncol,visited,index+1)){
                return true;
            }
        }
        visited[row][col]=0;
        return false;
    }
    public static boolean exist(char[][] board, String word) {
        int m= board.length;
        int n=board[0].length;
     int visited[][]=new int[m][n];
        for (int i = 0; i <m; i++) {
            for (int j = 0; j < n; j++) {
                if (isValid(board, word, m, n,i,j, visited,0)) return true;
            }
        }
return false;
    }
    public static void main(String[] args) {
      char board[][]=  {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        System.out.println(exist(board,word));
    }
}

