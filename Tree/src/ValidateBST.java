public class ValidateBST {
    public static boolean check(Tree2 root,int min,int max)
    {
        if(root==null)
        {
            return true;
        }
        if(root.val<=min||root.val>=max)
        {
            return false;
        }
        return check(root.left,min,root.val)&&check(root.right, root.val,max);
    }
    public static void main(String[] args) {
        /* 50
          /  \
         30   70
        / \   / \
       20 40 60 90
        */
        Tree2 root=new Tree2(50);
        root.left=new Tree2(30);
        root.right=new Tree2(70);
        root.left.left=new Tree2(20);
        root.left.right=new Tree2(40);
        root.right.left=new Tree2(60);
        root.right.right=new Tree2(90);
        boolean ans=check(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
        if(ans==true)
        {
            System.out.println("Binary Search Tree ");
        }
        else
            System.out.println("Not a Binary Search Tree");
    }
}
