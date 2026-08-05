//TC O(n^2)
class Tree1
{
    int val;
    Tree1 left=null;
    Tree1 right=null;
    Tree1(int val)
    {
        this.val=val;
    }
}
//Recursive code
public class breathFirstSearch {
    public static void levelOrderTraversal(Tree1 root)
    {
     int level =1;
     while(printLevel(root,level))
     {
         level++;
     }
    }
    public static boolean printLevel(Tree1 root,int level)
    {
     if(root==null)
         return false;
     if(level==1)
     {
         System.out.println("Tree values  are : "+root.val);
         return true;
     }
     boolean left=printLevel(root.left,level-1);
     boolean right=printLevel(root.right,level-1);
     return (left ||right);
    }
    public static void main(String[] args) {
        /* 1
         /   \
        2     3
       /  \  / \
      4    5 6  7
    */
        Tree1 root=new Tree1(1);
        root.left=new Tree1(2);
        root.right=new Tree1(3);
        root.left.left=new Tree1(4);
        root.left.right=new Tree1(5);
        root.right.left=new Tree1(6);
        root.right.right=new Tree1(7);
        levelOrderTraversal(root);
    }
}
