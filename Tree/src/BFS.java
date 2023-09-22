import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
//Using Queue
//Tc O(n)
//SC O(n)
class Tree2
{
    int val;
    Tree2 left=null;
    Tree2 right=null;
    Tree2(int val)
    {
        this.val=val;
    }
}
public class BFS {
    class Solution
    {
        //Function to return the level order traversal of a tree.
       static ArrayList<Integer> levelOrder(Tree2 root)
        {
            ArrayList<Integer> ans=new ArrayList<>();
            if(root==null)
                return ans;
            Queue<Tree2> q=new LinkedList<>();
            q.add(root);
            while(!q.isEmpty())
            {
                Tree2 n= q.remove();
                ans.add(n.val);
                if(n.left!=null)
                    q.add(n.left);
                if(n.right!=null)
                    q.add(n.right);
            }
            return ans;
        }
    }

    public static void main(String[] args) {
  /*       1
         /   \
        2     3
       /  \  / \
      4    5 6  7
    */
        Tree2 root=new Tree2(1);
        root.left=new Tree2(2);
        root.right=new Tree2(3);
        root.left.left=new Tree2(4);
        root.left.right=new Tree2(5);
        root.right.left=new Tree2(6);
        root.right.right=new Tree2(7);
        System.out.println("The element of Tree are : " + Solution.levelOrder(root));
    }
}
