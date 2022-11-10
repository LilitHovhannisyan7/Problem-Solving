
 //       Implement a linked list based Queue class using a Node class


class Node
{
    String value;
    Node next;
    public Node(String value, Node next)
    {
        this.value = value;
        this.next = next;
    }
    public Node()
    {
        this.value= null;
        this.next = null;
    }

    public String getValue()
    {
        return this.value;
    }
    public Node getNext()
    {
        return this.next;
    }
    public void setValue(String value)
    {
        this.value = value;
    }
    public void setNext(Node next)
    {
        this.next = next;
    }
}
class Queue
{
    private Node front;
    private Node back;


    public Boolean empty()
    {
        if(front == null)
        {
            return true;
        }
        return false;
    }

    public String front()
    {
        if(front == null)
        {
            throw new RuntimeException();
        }
        return front.getValue();
    }

    public void push(String element)
    {
        Node newNode = new Node();
        newNode.setValue(element);
        newNode.setNext(null);
        back.setNext(newNode);
        back = newNode;

    }

    public String pop()
    {
        if(empty() == true)
        {
            throw new RuntimeException();
        }
        String frontValue = front.getValue();
        front = front.getNext();
        return frontValue;
    }


}







  //  Implement a cyclic array based Queue class that uses dynamic size adjustment when needed.


class Queue
{
    private int queueSize;
    private int indexOfFront;
    private int indexOfBack;
    private int[] arr;

    Queue()
    {
        int[] arr = new int[10];
        int indexOfBack = -1;
        int indexOfFront = 0;
        int queueSize = 0;
    }

    public Boolean empty()
    {
        if(queueSize == 0)
        {
            return true;
        }
        return false;
    }

    public int front()
    {
        if(empty() == true)
        {
            throw new RuntimeException();
        }
        return arr[indexOfFront];
    }

    public void push(int element)
    {
        if(arr.length == queueSize)
        {
            throw new RuntimeException();
        }
        ++indexOfBack;
        arr[indexOfBack] = element;
        ++queueSize;
        if(indexOfBack == arr.length)
        {
            indexOfBack = 0;
        }
    }

    public int pop()
    {
        if(empty() == true)
        {
            throw new RuntimeException();
        }
        int tmp = arr[indexOfFront];
        ++indexOfFront;
        --queueSize;
        return tmp;
    }

}



 //   Implement a stack using the queue data structure.
        The Stack class cannot use an array, list or node. It should use only objects of type queue only.




class Stack
{
    Queue<Integer> q = new LinkedList<Integer>();
    public Boolean empty()
    {
        return q.isEmpty();
    }

    public int top()
    {
        return q.peek();
    }

    public void push(int element)
    {
        Queue <Integer> q1 = new LinkedList<Integer>();
        q1 = q;
        Queue <Integer> q2 = new LinkedList<Integer>();
        for(int i = 0; i < q1.size(); ++i)
        {
            q2.add(q1.peek());
            q1.remove();
        }
        q = q2;
    }
    public int pop()
    {
        if(empty() == true)
        {
            throw new EmptyStackException();
        }
        int tmp = q.peek();
        q.remove();
        return tmp;
    }

}
