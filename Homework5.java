//     Return list of nodes in the tree that are on a given Kth level.



public LinkedList<TreeNode> children(int level, int k)
        {
        LinkedList <TreeNode> newList = new LinkedList<TreeNode>();
        LinkedList <TreeNode> q = children;
        if(level == k)
        {
        newList.add(this);
        }
        for(TreeNode child = q.peek(); q.peek() != null; q.remove())
        {
        child.children(level + 1, k);
        }
        return newList;
        }

