
   //     Implement a complete binary tree using an array (no Node class). Implement the following methods for it

public class CompleteBinaryTree
{
    private int[] arrStorage; // Stores the values of tree nodes
    private int treeSize;     // Stores the number of nodes in the tree



    public void add(int value)
    {
        treeSize++;
        arrStorage[treeSize] = value;
    }

    public void remove()
    {
        int [] arr1 = new int[arrStorage.length - 1];
        for(int i = 0; i < arr1.length; ++i)
        {
            arr1[i] = arrStorage[i];
        }
        arrStorage = arr1;
        --treeSize;
    }
}








   // Given a Binary tree, check if it is binary search tree or not.
public class BinaryTree {
    protected BinaryNode root;

    public bool isBinarySearchTree()
    {

        Queue <BinaryNode> q = new LinkedList<BinaryNode>();
        q.add(root);
        while(!q.isEmpty())
        {
            BinaryNode node = q.poll();
            if(node.left != null)
            {
                if(node.left.value > node.value)
                {
                    return false;
                }
                q.add(node.left);
            }
            if(node.right != null)
            {
                if(node.right.value < node.value)
                {
                    return false;
                }
                q.add(node.right);
            }
        }
        return true;
    }




  //  Print The Top View of a Binary Tree

public class BinaryTree {


public class BinaryTree
{
    protected BinaryNode root;

    public void printTopView()
    {
        BinaryNode node = root;
        Stack<BinaryNode> st = new Stack<BinaryNode>();
        st.add(node);
        while(node.left != null)
        {
            st.add(node.left);
            node = node.left;
        }
        while(!st.empty())
        {
            System.out.print(st.peek().value + " ");
            st.pop();
        }
        node = root;
        while(node.right != null)
        {
            System.out.print(node.right.value);
        }
    }



    static class BinaryNode
    {
        int value;
        BinaryNode left;
        BinaryNode right;
    }
}
