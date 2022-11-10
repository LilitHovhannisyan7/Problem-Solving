
    //    Implement a linked list based Stack class using a Node class
//class Node
    //{
   // string value;
   // Node next;
   // public Node(string value, Node next) {
      //  this.value = value;
       // this.next = next;
   // }
//}

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
        this.value = null;
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



class Stack
{

    private Node top;

    public boolean empty()
    {
        if(top == null)
        {
            return true;
        }
        return false;
    }
    public String top()
    {
        return top.getValue();
    }
    public void push(String element)
    {
        Node newNode = new Node();
        newNode.setValue(element);
        if(top == null)
        {
            newNode.setNext(null);
        }
        else
        {
            newNode.setNext(top);
        }
        top = newNode;
    }
    public String pop()
    {
        if(top == null)
        {
            throw new EmptyStackException();
        }

        String topValue = top.getValue();

        top = top.getNext();
        return topValue;


    }
}




   // Implement an array based Stack class that increases the capacity by adding 100 more elements each time it runs out of capacity.

class Stack
{

    private int stackSize;
    private int array[];


    public  boolean empty()
    {
        if(stackSize == 0)
        {
            return true;
        }
        return false;
    }
    public int top()
    {
        return array[stackSize - 1];
    }
    public void push( int obj )
    {
        array[stackSize] = obj;
        ++stackSize;
    }
    public int pop()
    {
        --stackSize;
        return array[stackSize];
    }

    public boolean full()
    {
        if(stackSize == array.length)
        {
            return true;
        }
        return false;
    }

    public void addCapacity()
    {
        if(full() == true)
        {
            int array1[] = new int[array.length + 100];
            for(int i = 0; i < array.length; ++i)
            {
                array1[i] = array[i];
            }
            array = array1;
        }
    }
}

 //   For a given string of parentheses check if all opening and closing ones do match
  //      (({}[])) - good
    //    ({]) - bad
     //   ({)} - bad

public static void main(String[] args)
        {

        String st = "({)}";

        Stack stack = new Stack();
        int i = 0;
        while(i < st.length())
        {
        if(st.charAt(i) == '(' || st.charAt(i) == '{' || st.charAt(i) == '[')
        {
        stack.push(st.charAt(i));
        }
        else if(st.charAt(i) - (char)stack.peek() == 1 || st.charAt(i) - (char)stack.peek() == 2)
        {
        stack.pop();
        }
        ++i;
        }
        if(stack.empty() == true)
        {
        System.out.println("Yes");
        }
        else
        {
        System.out.println("No");
        }

        }
