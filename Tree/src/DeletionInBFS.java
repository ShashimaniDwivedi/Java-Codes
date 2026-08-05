class Solution {
    public Tree2 getMin(Tree2 curr)
    {
        while(curr.left!=null)
        {
            curr=curr.left;
        }
        return curr;
    }
    public Tree2 deleteNode(Tree2 root, int key)
    {
        //search the node to be deleted
        Tree2 parent=null;
        Tree2 curr=root;
        //doesn't exist or found
        while(curr!=null&&curr.val!=key)
        {
            parent=curr;
            if(key<curr.val)
                curr=curr.left;
            else
                curr=curr.right;
        }
        if(curr==null)//stop
        {
            return root;
        }
        //Case 1: Node has zero children
        if(curr.left==null&&curr.right==null)
        {
            if(curr==root){
                root=null;
            }
            else{
                if(parent.left==curr)
                    parent.left=null;
                else
                    parent.right=null;
            }
        }
        //Case 2: Node has One child
        else if(curr.left==null||curr.right==null)
        {//One child
            Tree2 child;
            if(curr.left!=null)//jo null nahi hai use child banana hai
                child=curr.left;
            else
                child=curr.right;
            if(curr==root)
            {
                root=child;
            }
            else{
                //agar parent left me hai
                if(curr==parent.left)
                    parent.left=child;
                else
                    parent.right=child;
            }
        }
        //Case 3:Node has two child
        else
        {
            Tree2 min=getMin(curr.right);
            int minval=min.val;
            deleteNode(root,minval);
            curr.val=minval;
        }
        return root;
    }
}
public class DeletionInBFS {
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
        Solution solution = new Solution();
        root = solution.deleteNode(root, 30);
        // Print the tree to verify the deletion
        printTree(root);
    }
    // Helper function to print the tree (in-order traversal)
    public static void printTree(Tree2 root) {
        if (root == null)
            return;
        printTree(root.left);
        System.out.print("Tree after Deletion : "+root.val + " ");
        printTree(root.right);
    }
}

