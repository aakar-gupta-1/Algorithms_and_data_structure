package dataStructure;
public class doliQueue
{
    dNode front;
    dNode rear;
    public doliQueue()
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
            dNode s=new dNode(a);
            rear=s;
            front=s;
        }
        else
        {
            dNode s=new dNode(a);
            rear.next=s;
            s.prev=rear;
            rear=s;
        }
    }

    void delete()
    {
        if(isEmpty()) System.out.println("The Queue is empty");
        else if(front==rear) front=rear=null;
        else 
        {
            front=front.next;
            front.prev=null;
        }
    }

    void print()
    {
        if(isEmpty()) System.out.println("The Queue is empty");
        for(dNode i=front;i!=null;i=i.next)
        {
            System.out.println(i.info);
        }
    }
}