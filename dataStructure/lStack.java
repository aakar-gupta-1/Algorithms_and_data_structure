package dataStructure;
public class lStack
{
    node top;
    public lStack()
    {
        top=null;
    }
    boolean isEmpty()
    {
        if(top==null) return true;
        else return false;
    }
    void push(int a)
    {
        node s=new node(a);
        s.next=top;
        top=s;
    }
    void pop()
    {
        if(isEmpty()) System.out.println("The stack is empty");
        else top=top.next;
    }
    void print()
    {
        for(node i=top;i!=null;i=i.next)
        {
            System.out.println(i.info);
        }
    }
}
