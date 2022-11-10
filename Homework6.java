
  // Given a binary tree, print level order traversal in a way that nodes of all levels are printed in separate lines. For example consider the following tree



public void printTraversalOrder()
        {
        System.out.println();
        if(this.left == null && this.right == null)
        {
        return;
        }
        if (this.parent == null)
        {
        System.out.println(this.value);
        }

        System.out.print(this.right.value);
        System.out.print(this.left.value);
        this.left.printTraversalOrder();
        this.right.printTraversalOrder();
        }

        



   //     Write a method for the BinarySearchTree class that returns the minimum in the binary search using iteration (no recursion is allowed).

class BinarySearchNode extends BinaryNode
{

    public T front();

}

    public int front()
    {
        int minValue = this.value;
        BinarySearchNode temp = this;
        while(temp.left != null)
        {
            minValue = temp.left.value;
            temp = (BinarySearchNode) temp.left;
        }
        return minValue;
    }

