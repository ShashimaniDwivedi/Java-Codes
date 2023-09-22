class Treenode1
{
    int val;
    Treenode1 left=null;
    Treenode1 right=null;
    Treenode1(int val)
    {
        this.val=val;
    }
}
public class DepthFirstSearch {
    public static void inOrderTraversal(Treenode1 root)
    {
        if(root==null)
        {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.val+" ");
        inOrderTraversal(root.right);

    }
    public static void PreOrderTraversal(Treenode1 root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.val+" ");
        PreOrderTraversal(root.left);
        PreOrderTraversal(root.right);
    }
    public static void PostOrderTraversal(Treenode1 root)
    {
        if(root==null)
        {
            return;
        }
        PostOrderTraversal(root.left);
        PostOrderTraversal(root.right);
        System.out.print(root.val+" ");
    }

    public static void main(String[] args) {
          /*
           1
          /  \
         2    3
        / \  / \
       4   5 6  7
         */
        Treenode1 root=new Treenode1(1);
        root.left=new Treenode1(2);
        root.right=new Treenode1(3);
        root.left.left=new Treenode1(4);
        root.left.right=new Treenode1(5);
        root.right.left=new Treenode1(6);
        root.right.right=new Treenode1(7);
        System.out.print("Preorder Traversal of Tree is : ");
        PreOrderTraversal(root);
        System.out.println();
        System.out.print("Inorder Traversal of Tree is : ");
        inOrderTraversal(root);
        System.out.println();
        System.out.print("Postorder Traversal of Tree is : ");
        PostOrderTraversal(root);

    }
}
