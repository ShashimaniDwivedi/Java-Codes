class Treenode
{
    int val;
    Treenode left=null;
    Treenode right=null;
    Treenode(int val)
    {
        this.val=val;
    }
}

public class DiameterOfTree
{
    //Longest path between two node of Tree
    //More Edges more the distance
    //ans =left height+right height excluding root height
   static int max=0;
    public static int height(Treenode root)
    {
     if(root==null)
     {
       return 0;
     }
      int left=height(root.left);
     int right=height(root.right);
     max=Math.max(max,left+right);
     return 1+Math.max(left,right);
    }
    public static int Diameter(Treenode root)
    {
        height(root);
        return max;
    }
    public static void main(String[] args) {
        /*
           1
          /  \
         2    3
        / \  / \
       4   5 6  7
         */
     Treenode root=new Treenode(1);
        root.left=new Treenode(2);
        root.right=new Treenode(3);
        root.left.left=new Treenode(4);
        root.left.right=new Treenode(5);
        root.right.left=new Treenode(6);
        root.right.right=new Treenode(7);
      int ans=Diameter(root);
      System.out.println("Diameter of Tree is : "+ans);
    }
}
