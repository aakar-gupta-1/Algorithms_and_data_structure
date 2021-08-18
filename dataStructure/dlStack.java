package dataStructure;
public class dlStack
{
    dNode top;
    public dlStack()
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
        dNode s=new dNode(a);
        s.next=top;
        if(!isEmpty()) top.prev=s;
        top=s;
    }

    void pop()
    {
        if(isEmpty()) System.out.println("The stack is empty");
        else 
        {
            top=top.next;
            top.prev=null;
        }
    }

    void print()
    {
        for(dNode i=top;i!=null;i=i.next)
        {
            System.out.println(i.info);
        }
    }
}
