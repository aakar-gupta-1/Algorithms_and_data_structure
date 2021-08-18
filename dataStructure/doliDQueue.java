//doubly linked Dqueue
package dataStructure;
public class doliDQueue
{
    dNode front;
    dNode rear;
    public doliDQueue()
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

    void addFront(int a)
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
            s.next=front;
            front.prev=s;
            front=s;
        }
    }

    void deleteFront()
    {
        if(isEmpty()) System.out.println("The Queue is empty");
        else if(front==rear) front=rear=null;
        else 
        {
            front=front.next;
            front.prev=null;
        }
    }

    void deleteRear()
    {
        if(isEmpty()) System.out.println("The Queue is empty");
        else if(front==rear) front=rear=null;
        else
        {
            /*
            for(dNode i=front;i!=null;i=i.next)
            {
            if(i.next==rear)
            {
            rear=i;
            i.next=null;
            }
            }
             */
            rear=rear.prev;
            rear.next=null;
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
