package dataStructure;
public class lQueue
{
    node front;
    node rear;
    public lQueue()
    {
        front=null;
        rear=null;
    }

    boolean isEmpty()
    {
        if(rear==null && front==null) return true;
        else return false;
    }

    void add(int a)
    {
        if(isEmpty())
        {
            node s=new node(a);
            rear=s;
            front=s;
        }
        else
        {
            node s=new node(a);
            rear.next=s;
            rear=s;
        }
    }

    void delete()
    {
        if(isEmpty()) System.out.println("The Queue is empty");
        else if(front==rear) front=rear=null;
        else front=front.next;
    }

    void print()
    {
        if(isEmpty()) System.out.println("The Queue is empty");
        for(node i=front;i!=null;i=i.next)
        {
            System.out.println(front.info);
        }
    }
}