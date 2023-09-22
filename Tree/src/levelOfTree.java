
class Tree
{
   int val;
   Tree left=null;
   Tree right=null;
   Tree(int val)
   {
       this.val=val;
   }
}
public class levelOfTree {
    //function to find height
    public static int height(Tree root)
    {
        if(root==null)
           return 0;
        return 1+(Math.max(height(root.left),height(root.right)));
    }
    public static void main(String[] args) {
      /*  1
        /   \
       2     3
      /  \  / \
     4    5 6  7
    */
        Tree root=new Tree(1);
        root.left=new Tree(2);
        root.right=new Tree(3);
        root.left.left=new Tree(4);
        root.left.right=new Tree(5);
        root.right.left=new Tree(6);
        root.right.right=new Tree(7);
        System.out.println("The height of the Tree is : "+height(root));
    }
}
