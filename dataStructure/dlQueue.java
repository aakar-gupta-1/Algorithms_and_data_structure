package dataStructure;
public class dlQueue
{
    node front;
    node rear;
    public dlQueue()
    {
        front=null;
        rear=null;
    }

    boolean isEmpty()
    {
        if(rear==null && front==null) return true;
        else return false;
    }

    void addRear(int a)
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
    
    void addFront(int a)
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
            s.next=front;
            front=s;
        }
    }

    void deleteFront()
    {
        if(isEmpty()) System.out.println("The Queue is empty");
        else if(front==rear) front=rear=null;
        else front=front.next;
    }
    
    void deleteRear()
    {
        if(isEmpty()) System.out.println("The Queue is empty");
        else if(front==rear) front=rear=null;
        else
        {
            for(node i=front;i!=null;i=i.next)
            {
                if(i.next==rear)
                {
                    rear=i;
                    i.next=null;
                }
            }
        }
    }

    void print()
    {
        if(isEmpty()) System.out.println("The Queue is empty");
        for(node i=front;i!=null;i=i.next)
        {
            System.out.println(i.info);
        }
    }
}
