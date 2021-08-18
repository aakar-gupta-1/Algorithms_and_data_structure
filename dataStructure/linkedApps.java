//different linked list applications such as inserting, sorting, reversing, etc.
package dataStructure;
public class linkedApps
{
    node front,front1;
    node rear,rear1;
    public linkedApps()
    {
        front=null;
        rear=null;
    }

    public void insert(int a)
    {
        node i;
        node insert,temp=null;
        insert=new node(a);
        for(i=front;i.info<=a;i=i.next)
        {
            temp=i;
            if(i.next==null) break;
        }
        if(temp==rear) rear=insert;
        if(i.next==null)i=null;
        insert.next=i;
        if(temp!=null)
        temp.next=insert;
        else insert=front;
    }

    public void sort()
    {

        for(node i=front;i!=null;i=i.next)
        {
            boolean swag=true;
            for(node j=front;j.next!=null;j=j.next)
            {
                node t=j.next;
                if(j.info>t.info)
                {
                    if(j==front)
                    {
                        node k=t;
                        j.next=t.next;
                        t.next=j;
                        front=t;
                        swag=false;
                    }
                    else
                    {
                        node k;
                        for(k=front;k.next!=j;k=k.next);
                        j.next=t.next;
                        t.next=j;
                        k.next=t;
                        swag=false;
                    }
                }
                if(j.next==null) break;// very important
            }
            if(swag==true) break;
        }
    }

    public void reverse()
    {
        front1=rear;
        rear1=rear;
        node i=null;
        while(i!=front)
        {
            for(i=front;i.next!=rear;i=i.next);
            i.next=null;
            rear1.next=i;
            rear1=i;
            rear=i;
        }
        front=front1;
        rear=rear1;
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
        printRec(front);
    }

    void printRec(node a)
    {
        if(a==null)
        {
            System.out.println(a.info);
        }
        else printRec(a.next);
    }
}
