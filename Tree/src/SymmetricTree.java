public class SymmetricTree {
    public static boolean isSymmetric(Treenode left,Treenode right)
    {
        if(left==null&&right==null)
        {
            return true;
        }
        if(left==null||right==null)
        {
            return false;
        }
        if(left.val!=right.val)
        {
            return false;
        }
        return isSymmetric(left.left,right.right)&&isSymmetric(left.right,right.left);
    }
    public static void main(String[] args) {
          /*
           1
          /  \
         2    2
        / \  / \
       4   5 5  4
         */
        Treenode root=new Treenode(1);
        root.left=new Treenode(2);
        root.right=new Treenode(2);
        root.left.left=new Treenode(3);
        root.left.right=new Treenode(4);
        root.right.left=new Treenode(4);
        root.right.right=new Treenode(3);
        boolean ans=isSymmetric(root,root);
        if(ans==true)
        {
            System.out.println("Tree is Symmetric");
        }
        else {
            System.out.println("Tree is not Symmetric");
        }
    }
}
