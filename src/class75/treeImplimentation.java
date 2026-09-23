package class75;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class treeImplimentation {
   static Scanner sc;
    static {
        sc=new Scanner(System.in);
    }
    public static treeNode Buildtree(){
        System.out.println("enter val");
        int val=sc.nextInt();
        if(val==-1)return null;
        treeNode root=new treeNode(val);
        System.out.println("enter left for "+ val);
        root.left=Buildtree();
        System.out.println("enter right for "+ val);
        root.right=Buildtree();
        return root;
    }
    public static void printLDR(treeNode root){
        if(root==null)return;
        printLDR(root.left);
        System.out.print(root.val+" ");
        printLDR(root.right);
    }
    public static void main(String[] args) {
         treeNode root=Buildtree();
         printLDR(root);
    }
}
