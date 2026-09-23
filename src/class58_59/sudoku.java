package class58_59;
import java.util.HashSet;
import java.util.Set;

public class sudoku {
    private  static boolean boxCheck(String [][]board,int start,int col){
       Set<String>set=new HashSet<>();
        for (int i = start; i <start+3; i++) {
            for (int j =col; j <3+col ; j++) {
                if(set.contains(board[i][j]))return false;
                else if(board[i][j]==".");
                else {
                    set.add(board[i][j]);
                }
            }
        }
        return true;
    }
    private static boolean rowCheck(String []board){
        Set<String>set=new HashSet<>();
       for(String s:board){
           if (set.contains(s))return false;
           else if(s==".");
           else {
               set.add(s);
           }
       }
       return true;
    }
    private static boolean columnCheck(String [][]board,int j){
        Set<String>set=new HashSet<>();
        for (int i = 0; i <9; i++) {
            if (set.contains(board[i][j]))return false;
            else if(board[i][j]==".");
            else {
                set.add(board[i][j]);
            }
        }
        return true;
    }
    private static boolean isValid(String [][]board){
        boolean ans=true;
        for (int i = 0; i <9; i++) {
            if(rowCheck(board[i]));
            else return false;
        }
        int j=0;
        for (int i = 0; i <9; i++) {
           if(columnCheck(board,j))j++;
           else return false;
        }
        for (int i = 0; i <9;i+=3) {
            for (int k = 0; k<9 ;) {
                if(boxCheck(board,i,k)){
                    k+=3;
                }
                else return false;
            }
        }
         return ans;
    }
    public static void main(String[] args) {
       String [][]arr =  {{"5", "3", ".", ".","7", ".", ".", ".", "."}
                        , {"6", ".", ".", "1", "9", "5", ".", ".", "."}
                        , {".", "9", "8", ".", ".", ".", ".", "6", "."}
                        , {"8", ".", ".", ".", "6", ".", ".", ".", "3"}
                        , {"4", ".", ".", "8", ".", "3", ".", ".", "1"}
                        , {"7", ".", ".", ".", "2", ".", ".", ".", "6"}
                        , {".", "6", ".", ".", ".", ".", "2", "8", "."}
                        , {".", ".", ".", "4", "1", "9", ".", ".", "5"}
                        , {".", ".", ".", ".", "8", ".", ".", "7", "9"}};
        System.out.println(isValid(arr));

    }
}